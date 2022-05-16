package com.bwacomputacao.mcsts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwacomputacao.mcsts.domain.Cliente;
import com.bwacomputacao.mcsts.repositories.ClienteRepository;
import com.bwacomputacao.mcsts.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		 Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! id: " + id
				+ ", Tipo: "+ Cliente.class.getName()));
	}
}
