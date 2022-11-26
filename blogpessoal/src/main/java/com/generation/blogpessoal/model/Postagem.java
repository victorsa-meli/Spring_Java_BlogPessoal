package com.generation.blogpessoal.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_postagens")
public class Postagem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    // TITULO
    @NotBlank(message = "O atributo titulo é obrigatorio! ")
    @Size(min = 5, max = 100, message = "o atributo titulo deve conter no minimo 10 e no maximo 100 caracteres")
    public String titulo;


    // TEXTO
    @NotBlank(message = "O atributo texto é obrigatorio! ")
    @Size(min = 10, max = 1000, message = "o atributo texto deve conter no minimo 10 e no maximo 1000 caracteres")
    public String texto;

    // HORARIO SERVIDOR
    @UpdateTimestamp
    public LocalDateTime data;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    public Tema tema;

    // GETTERS AND SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }
}


