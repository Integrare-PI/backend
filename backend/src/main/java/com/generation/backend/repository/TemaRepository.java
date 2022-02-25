package com.generation.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.backend.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByDisciplinaContainingIgnoreCase(String disciplina);

	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
