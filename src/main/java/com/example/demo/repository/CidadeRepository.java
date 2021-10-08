package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Cidade;

public interface CidadeRepository {
	Cidade buscar (Long id);
	List<Cidade> todas ();
	void salvar (Cidade cidade);
	void remover (Long id);

}
