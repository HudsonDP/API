package com.api.pedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	Pedido findById(long id);	

}
