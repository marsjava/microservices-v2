package com.learn.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.microservices.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	public CurrencyExchange findByFromAndTo(String from, String to);
}
