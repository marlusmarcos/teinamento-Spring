package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Cozinha;

public interface CozinhaRepository {

	Cozinha busar (Long id);
	List <Cozinha> todas ();
	void remover (Long id);
	void salvar (Cozinha cozinha);
}
