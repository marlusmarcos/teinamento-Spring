package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurante;
import com.example.demo.repositoryImpl.RestauranteRepositoryImpl;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {
	
	@Autowired
	private RestauranteRepositoryImpl resturanteResp;
	
	@GetMapping
	public List<Restaurante> todos () {
		return resturanteResp.todas();
	}
}
