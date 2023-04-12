package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //indicando que e uma classe controladora
@RequestMapping("/Hello")   // dizendo que o endereço sera / hello
public class HelloController {

	@GetMapping
	public String hello() {   //metodo pra devolver string
		return "<b>Hello Turma 62!</b>";  //retorne 
		
	}
	
	@GetMapping("/nome")   //endereço sempre minusculo
	public String meunome() {   
		return "<b>Hello! <br />Bruno</b>";  
		
	}
	
}