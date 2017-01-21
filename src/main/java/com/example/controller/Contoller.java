package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Service; 

@RestController
public class Contoller {

	@Autowired
	Service service;
	
	@RequestMapping("/get")
	public String testFunkcja(){
		return service.pobierzWartosc();
	}
	
}
