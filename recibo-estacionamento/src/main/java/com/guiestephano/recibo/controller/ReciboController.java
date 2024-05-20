package com.guiestephano.recibo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guiestephano.recibo.domain.model.Recibo;
import com.guiestephano.recibo.service.ReciboService;

@RestController
@RequestMapping("/recibos")
public class ReciboController {
	
	@Autowired
	private ReciboService service;
	
	@GetMapping
	public ResponseEntity<List<Recibo>> findAll(){
		List<Recibo> recibos = service.findAll();
		return ResponseEntity.ok(recibos);
	}
}
