package com.api.pedido;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PEDIDO")
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id_cliente;
	
	private double total_pedido;
	
	private String end_entrega;

	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public double getTotal_pedido() {
		return total_pedido;
	}

	public void setTotal_pedido(double total_pedido) {
		this.total_pedido = total_pedido;
	}

	public String getEnd_entrega() {
		return end_entrega;
	}

	public void setEnd_entrega(String end_entrega) {
		this.end_entrega = end_entrega;
	}
	

}
