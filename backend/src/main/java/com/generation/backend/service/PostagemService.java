package com.generation.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.backend.model.Postagem;
import com.generation.backend.repository.PostagemRepository;

@Service

public class PostagemService {

	@Autowired
	private PostagemRepository postagemRepository;

	public Optional<Postagem> curtir(Long id) {
		if (postagemRepository.existsById(id)) {
			Postagem postagem = postagemRepository.findById(id).get();
			postagem.setCurtidas(postagem.getCurtidas()+1);
			return Optional.of(postagemRepository.save(postagem));
		}
		return Optional.empty();
	}
}
