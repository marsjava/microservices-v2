package com.learn.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.configure.Configuration;
import com.learn.microservices.model.Limits;

@RestController
public class LimitsController {
	@Autowired
	private Configuration config;
	@GetMapping("/limits")
	public Limits retrieveLimit() {
		return new Limits(config.getMinimum(), config.getMaximum());
	}
}
