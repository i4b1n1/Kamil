package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Encja;
import com.example.domain.EncjaRepository;

@Component
public class Service {

	@Autowired
	EncjaRepository encjaRepository;
	
	
	public String pobierzWartosc(){
		String result=null;
		List<Encja> listaEncji = encjaRepository.findAll();
		
		return listaEncji.toString();
				
		
	}
}
