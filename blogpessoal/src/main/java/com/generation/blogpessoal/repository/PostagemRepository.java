package com.generation.blogpessoal.repository;


import com.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//PRIMEIRO COLOCAMOS @Repository INDICANDO O MODIFICADOR DA CLASSE JAVA PARA UTILIZARMOS COM AS BIBLIOTECAS SPRING.
// ADICIONAMOS UMA HERANCA USANDO O COMANDO "extends" JpaRepository PASSANDO DOS PARAMETROS "Postagem", "Long"  JPA e uma especificacao, qual a forma e atributos iremos criar a nossa tabela. Alem do JPA temos tambem o Hybernete que é o framework.
// TRASFORMA
// TABELA  -->  CLASSE
// COLUNA  -->  ATRIBUTO
// REGISTRO  -->  OBJETO
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {



    // findAllByTituloContainingIgnoreCase() com a função de trazer todas as  Postagens cujo título possua a palavra pesquisada.
    public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}



// POR FIM VAMOS CRIAR UM NOVO PACKAGE CHAMADO "controller" e dentro dele criaremos uma classe java do tipo javaclass chamada "PostagemController". Onde
// vamos utilizar a nossa interface.
