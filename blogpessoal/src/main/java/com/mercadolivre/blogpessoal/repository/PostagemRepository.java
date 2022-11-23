package com.mercadolivre.blogpessoal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mercadolivre.blogpessoal.model.Postagem;


public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
