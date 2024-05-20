package com.guiestephano.recibo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guiestephano.recibo.domain.model.Recibo;
import com.guiestephano.recibo.domain.repository.ReciboRepository;

@Service
public class ReciboService {
	
	@Autowired ReciboRepository reciboRepository;
	
	public Recibo findById(Long id) {
		return reciboRepository.findById(id).orElse(null);
	}
	
	public List<Recibo> findAll(){
		return reciboRepository.findAll();
	}
}
