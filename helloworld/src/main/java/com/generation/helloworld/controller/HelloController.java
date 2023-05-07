package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //indicando que e uma classe controladora
@RequestMapping("/hello")   // dizendo que o endereço sera / hello
public class HelloController {

	@GetMapping
	public String hello() {   //metodo pra devolver string
		return "<b>Hello Turma 62!</b>";  //retorne 
		
	}
	
	@GetMapping("/nome")   //endereço sempre minusculo e sempre especificar pois se tiver + q 1 ele nao vai saber qual mandar
	public String meunome() {   
		return " <br/> Meu Nome É Bruno !</b>";  
		
	}

	
	
	@GetMapping("/bsmdageneration")  
	public String listadebsms() {   
		return "<b>Comunicação <br/ > <b>Proatividade<br /> <b>Critividade<br />";  
	
	}
	
	@GetMapping("/objetivoapremdizagemsmn")  
	public String listaobjetivos() {   
		return "<b>Dominar Spring <br/ > <b>Dominar MYSQL<br /> <b>Dominar Insomnia<br />  <b>Dominar bloco 1 e 2<br />  ";  
	
	}
	

}

