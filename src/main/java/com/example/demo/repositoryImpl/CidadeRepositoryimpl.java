package com.example.demo.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.example.demo.model.Cidade;
import com.example.demo.repository.CidadeRepository;

@Component
public class CidadeRepositoryimpl implements CidadeRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Cidade buscar(Long id) {
		return manager.find(Cidade.class, id);
	}

	@Override
	public List<Cidade> todas() {
		return manager.createQuery("from Cidade", Cidade.class).getResultList();
	}

	@Override
	public void salvar(Cidade cidade) {
		manager.merge(cidade);
		
	}

	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
