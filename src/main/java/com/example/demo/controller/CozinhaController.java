package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cozinha;
import com.example.demo.repositoryImpl.CozinhaRepositoryImpl;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {
	
	@Autowired
	private CozinhaRepositoryImpl cozinhaRep;
	
	@GetMapping
	public List<Cozinha> ListarCozinhas () {
		return cozinhaRep.todas();
	}
}
