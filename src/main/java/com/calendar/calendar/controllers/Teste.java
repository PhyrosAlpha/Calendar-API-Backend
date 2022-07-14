package com.calendar.calendar.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste")
public class Teste {
	
	@GetMapping
	public ResponseEntity<Object> teste(){
		
		System.out.println("Rota Acessada");
		
		
		return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
		
	}
	
	

}
