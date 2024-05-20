package com.guiestephano.recibo.config;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.guiestephano.recibo.domain.model.Carro;
import com.guiestephano.recibo.domain.model.Cliente;
import com.guiestephano.recibo.domain.model.Recibo;
import com.guiestephano.recibo.domain.model.enums.Cor;
import com.guiestephano.recibo.domain.model.enums.StatusPagamento;
import com.guiestephano.recibo.domain.repository.CarroRepository;
import com.guiestephano.recibo.domain.repository.ClienteRepository;
import com.guiestephano.recibo.domain.repository.ReciboRepository;

@Configuration
public class SeedingConfig implements CommandLineRunner{
	
	@Autowired
	private ReciboRepository reciboRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = new Cliente("111.111.111-11", "Arthur Morgan", "(11) 11111-1111");
		Cliente cliente2 = new Cliente("222.222.222-22", "Jhon Marston", "(22) 22222-2222");
		Cliente cliente3 = new Cliente("333.333.333-33", "Dutch Van Der Linde", "(33) 33333-3333");
		
		Carro carro1 = new Carro("AAA1A11", "Chevrolet Opala", Cor.PRETO, cliente1);
		Carro carro2 = new Carro("BBB2B22", "Honda Civic", Cor.PRATA, cliente1);
		Carro carro3 = new Carro("CCC3C33", "Citroen C3", Cor.BRANCO, cliente2);
		Carro carro4 = new Carro("DDD4D44", "Marea Turbo", Cor.PRETO, cliente3);
	
		
		Recibo recibo1 = new Recibo(null,10.0,LocalDateTime.now().minusHours(2),carro1);
		recibo1.setSaida(LocalDateTime.now());
		recibo1.total();
		recibo1.setStatusPagamento(StatusPagamento.PAGO);
		Recibo recibo2 = new Recibo(null,10.0,LocalDateTime.now().minusHours(6),carro4);
		recibo2.setSaida(LocalDateTime.now());
		recibo2.total();
		Recibo recibo3 = new Recibo(null,10.0,LocalDateTime.now().minusHours(3),carro3);
		Recibo recibo4 = new Recibo(null,10.0,LocalDateTime.now(),carro2);
		
		reciboRepository.saveAll(Arrays.asList(recibo1,recibo2,recibo3,recibo4));
		
	}

}
