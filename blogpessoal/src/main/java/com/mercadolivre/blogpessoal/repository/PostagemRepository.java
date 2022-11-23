package com.mercadolivre.blogpessoal.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mercadolivre.blogpessoal.model.Postagem;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
