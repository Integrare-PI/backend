package com.generation.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.backend.model.Postagem;

public interface PostagemRepository extends JpaRepository <Postagem,Long> {
		public List<Postagem> findAllByAssuntoContainingIgnoreCase(String assunto);
}
