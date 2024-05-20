package com.guiestephano.recibo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.recibo.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
