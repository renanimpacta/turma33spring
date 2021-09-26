package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//É a anotação que expõe para o Spring que estamos criando um Controller.
@RestController

// É a Requisição que informa o caminho que vai ser chamada o conteúdo da classe HelloController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		
		String texto = "Mentalidades: Persistência e Mentalidade de crescimento  ||  Habilidade: Atenção aos Detalhes";
		
		return texto;
		
	}
	
}
