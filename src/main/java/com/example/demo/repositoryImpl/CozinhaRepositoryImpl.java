package com.example.demo.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.example.demo.model.Cozinha;
import com.example.demo.repository.CozinhaRepository;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Cozinha busar(Long id) {
		return manager.find(Cozinha.class, id);
	}

	@Override
	public List<Cozinha> todas() {
		return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
	}

	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void salvar(Cozinha cozinha) {
		// TODO Auto-generated method stub
		
	}

}
