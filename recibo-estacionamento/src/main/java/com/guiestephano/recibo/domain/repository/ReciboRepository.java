package com.guiestephano.recibo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiestephano.recibo.domain.model.Recibo;

public interface ReciboRepository extends JpaRepository<Recibo, Long>{

}
