package com.generation.blogpessoal.controller;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;
import com.generation.blogpessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

            @Autowired
            private PostagemRepository postagemRepository;

            @Autowired
            private TemaRepository temaRepository;

            @GetMapping
            public ResponseEntity<List<Postagem>> getAll(){
                return ResponseEntity.ok(postagemRepository.findAll());


            }
            @GetMapping("/{id}")
            public ResponseEntity<Postagem> getById(@PathVariable Long id){

                return postagemRepository.findById(id)
                .map(resposta -> ResponseEntity.ok(resposta))
                .orElse(ResponseEntity.notFound().build());

               /* Optional<Postagem> buscaPostagem = postagemRepository.findById(id);
                if (((Optional<?>) buscaPostagem).isEmpty()) {
                    return ResponseEntity.notFound().build();
                } else {
                    return ResponseEntity.ok(buscaPostagem.get());
                }
                */
            }
    //METODO PARA LISTAR POR TITULO getByTitulo() com a função de trazer todas Postagens cujo titulo possua a palavra pesquisada.
            @GetMapping("/titulo/{titulo}")
            public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){
                return  ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
                // SELECT * FROM TB_POSTAGENS WHERE TITULO LIKE "%titulo%";
            }

    //METODO PARA POSTAR CRIAR post() com a função de gravar (persistir) uma nova Postagem no banco de dados.
            @PostMapping
            public ResponseEntity<Postagem> post(@Valid @RequestBody Postagem postagem){
                if (temaRepository.existsById(postagem.getTema().getId()))
                return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));

                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }

    // METODO PARA ATUALIZAR put() com a função de atualizar os dados de uma Postagem.
            @PutMapping
            public ResponseEntity<Postagem> putPostagem(@Valid @RequestBody Postagem postagem){
               if(postagemRepository.existsById(postagem.getId())){

                   if(temaRepository.existsById(postagem.getTema().getId()))
                       return ResponseEntity.status(HttpStatus.OK)
                       .body(postagemRepository.save(postagem));

                   return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
               }

               return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                /* return ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem)); */



    }
    // METODO PARA DELETAR
            public ResponseEntity<Object> deletePostagem(@PathVariable long id) {

                return postagemRepository.findById(id)
                        .map(resposta -> {postagemRepository.deleteById(id);
                        return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); }).orElse(ResponseEntity.notFound().build());


                // Optional<Postagem> postagem = postagemRepository.findById(id); if (postagem.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND); postagemRepository.deleteById(id);
                //METODO SIMPLES DE DELETAR: postagemRepository.deleteById(id);

            }

}
