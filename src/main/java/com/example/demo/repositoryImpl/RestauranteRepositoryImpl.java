package com.example.demo.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.example.demo.model.Restaurante;
import com.example.demo.repository.RestauranteRepository;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository{
	
	@PersistenceContext
	private EntityManager manage;
	@Override
	public Restaurante busar(Long id) {
		return manage.find(Restaurante.class, id);
	}

	@Override
	public List<Restaurante> todas() {
		return manage.createQuery("from Restaurante", Restaurante.class).getResultList();
	}

	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar(Restaurante restaurante) {
		manage.merge(restaurante);		
	}

}
