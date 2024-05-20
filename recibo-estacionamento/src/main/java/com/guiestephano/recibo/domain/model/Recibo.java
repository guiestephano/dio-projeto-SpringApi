package com.guiestephano.recibo.domain.model;

import java.time.LocalDateTime;

import com.guiestephano.recibo.domain.model.enums.StatusPagamento;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_recibo")
public class Recibo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double valorHora;
	private Double valorTotal;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	
	@Enumerated(EnumType.STRING)
	private StatusPagamento statusPagamento;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Carro carro;
	
	
	public Recibo() {}
	
	
	public Recibo(Long id, Double valorHora, LocalDateTime entrada, Carro carro) {
		super();
		this.id = id;
		this.valorHora = valorHora;
		this.entrada = entrada;
		statusPagamento = StatusPagamento.PENDENTE;
		this.carro = carro;
	}


	public void total() {
		if(saida.isAfter(entrada)) {
			int quantidadeDeHoras = saida.getHour() - entrada.getHour();
			valorTotal = quantidadeDeHoras * valorHora;
		}
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valotTotal) {
		this.valorTotal = valotTotal;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}

	public StatusPagamento getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
}
