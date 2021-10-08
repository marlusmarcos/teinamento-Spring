package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Restaurante;

public interface RestauranteRepository {

	Restaurante busar (Long id);
	List <Restaurante> todas ();
	void remover (Long id);
	void salvar (Restaurante Restaurante);
}
