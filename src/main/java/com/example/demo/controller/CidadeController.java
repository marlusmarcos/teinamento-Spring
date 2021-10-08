package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cidade;
import com.example.demo.repositoryImpl.CidadeRepositoryimpl;

@RestController
@RequestMapping("/cidades")
public class CidadeController {
	
	@Autowired
	private CidadeRepositoryimpl cidadeRep;

	@GetMapping
	public List<Cidade> Buscartodas () {
		return cidadeRep.todas();
	}
	@GetMapping("/{cidadeId}")
	public Cidade buscar (@PathVariable Long cidadeId) {
		return cidadeRep.buscar(cidadeId);
	}
}
