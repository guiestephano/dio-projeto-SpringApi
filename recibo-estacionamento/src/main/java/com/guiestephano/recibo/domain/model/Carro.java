package com.guiestephano.recibo.domain.model;

import com.guiestephano.recibo.domain.model.enums.Cor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_carro")
public class Carro {
	
	@Id
	private String placa;
	private String modelo;
	
	@Enumerated(EnumType.STRING)
	private Cor cor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;
	
	
	public Carro() {}
	
	
	public Carro(String placa, String modelo, Cor cor, Cliente cliente) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.cliente = cliente;
	}


	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
