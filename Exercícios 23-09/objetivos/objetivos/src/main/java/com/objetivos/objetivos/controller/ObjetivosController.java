package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//É a anotação que expõe para o Spring que estamos criando um Controller.
@RestController

//É a Requisição que informa o caminho que vai ser chamada o conteúdo da classe HelloController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		String texto =  "Meu objetivo para essa e as próximas semanas é aprender Spring e conseguir criar API's funcionais!!!";
		
		return texto;
	}

}
