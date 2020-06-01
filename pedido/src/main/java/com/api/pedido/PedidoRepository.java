package com.api.pedido;

import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<PedidoModels, Long>{
	
	PedidoModels findById(int id);	

}
