package com.api.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class PedidoResource {

	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/pedido")
	public List<Pedido> listaPedido(){
		return pedidoRepository.findAll();
	}
	
	@GetMapping("/pedido/{id}")
	public Pedido listaPedidoID(@PathVariable(value="id") long id){
		return pedidoRepository.findById(id);
		
	}
	
	@PostMapping("/pedido")
	public Pedido inserePedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	
}
