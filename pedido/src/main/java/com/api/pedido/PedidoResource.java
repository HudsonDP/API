package com.api.pedido;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pedido.rabbitMQ.RabbitService;

@RestController
@RequestMapping(value="/api")
public class PedidoResource {

	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/pedido")
	public List<PedidoModels> listaPedido(){
		return (List<PedidoModels>) pedidoRepository.findAll();
	}
	
	@GetMapping("/pedido/{id}")
	public PedidoModels listaPedidoID(@PathVariable(value="id") int id){
		return pedidoRepository.findById((int) id);
		
	}
	
	@Autowired
	RabbitService rabbitService;
	
	@PostMapping("/pedido")
	public PedidoModels inserePedido(@RequestBody PedidoModels pedido, String id) {
		rabbitService.send("Pedido ID:" + id + "Enviado para fila!");
		return pedidoRepository.save(pedido);
		
	}
	
	
}
