package com.edilson.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edilson.cursomc.domain.Pedido;
import com.edilson.cursomc.repositories.PedidoRepository;
import com.edilson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id = " + id + ", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
	
}
