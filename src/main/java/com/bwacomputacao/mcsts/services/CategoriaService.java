package com.bwacomputacao.mcsts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwacomputacao.mcsts.domain.Categoria;
import com.bwacomputacao.mcsts.repositories.CategoriaRepository;
import com.bwacomputacao.mcsts.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! id: " + id + ", Tipo: "+ Categoria.class.getName()));
	}
}
