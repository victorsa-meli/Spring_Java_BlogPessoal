package controller;

import com.generation.blogpessoal.model.Usuario;
import com.generation.blogpessoal.repository.UsuarioRepository;
import com.generation.blogpessoal.service.UsuarioService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioControllerTest {


    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private UsuarioService  usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;


    @BeforeAll
    void start(){
        usuarioRepository.deleteAll();
        usuarioService.cadastrarUsuario(new Usuario(0L, "Root", "root@root.com", "rootroot", " "));
    }

    @Test
    @DisplayName("Testar o cadastro do usuario usuario")
    public void deveCriarUmUsuario(){

        HttpEntity<Usuario> bodyRequest = new HttpEntity<Usuario>
                (new Usuario(0L, "Paulo", "paulo@gmail.com", "12345678", " " ));

        ResponseEntity<Usuario> bodyResponse = testRestTemplate
                .exchange("/usuario/cadastrar", HttpMethod.POST, bodyRequest, Usuario.class);
        assertEquals(HttpStatus.CREATED, bodyResponse.getStatusCode());
        assertEquals(bodyResponse.getBody().getNome(), bodyResponse.getBody().getNome());
        assertEquals(bodyResponse.getBody().getUsuario(), bodyResponse.getBody().getUsuario()); // Checa se os dados inseridos e compara se sao equivalentes.
    }


    @Test
    @DisplayName("Lista todos os usuario")
    public void deveMostrarTodosUsuarios(){

        usuarioService.cadastrarUsuario(new Usuario(0L, "Sabrina", "sab@gmail.com", "12345678", " "));
        usuarioService.cadastrarUsuario(new Usuario(0L, "Ricardo", "ric@gmail.com", "12345678", " "));

        ResponseEntity<String> response = testRestTemplate
                .withBasicAuth("root@root.com","rootroot")
                .exchange("/usuario/all", HttpMethod.GET, null, String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());

    }




}
