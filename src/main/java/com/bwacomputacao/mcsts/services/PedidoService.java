package com.bwacomputacao.mcsts.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwacomputacao.mcsts.domain.Pedido;
import com.bwacomputacao.mcsts.repositories.PedidoRepository;
import com.bwacomputacao.mcsts.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		 Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! id: " + id + ", Tipo: "+Pedido.class.getName()));
	
	
	}
}
