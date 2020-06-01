package com.api.pedido;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="TB_PEDIDO")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = PedidoModels.class)
public class PedidoModels implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	private int id_cliente;

	private String id_produto;
		
	private double total_pedido;
	
	private String end_entrega;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public String getId_produto() {
		return id_produto;
	}

	public void setId_produto(String id_produto) {
		this.id_produto = id_produto;
	}

}
