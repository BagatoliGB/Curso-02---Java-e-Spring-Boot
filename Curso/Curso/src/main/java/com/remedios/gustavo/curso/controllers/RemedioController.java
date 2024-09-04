package com.remedios.gustavo.curso.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.gustavo.curso.remedio.DadosCadastrosRemedio;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

		@PostMapping
		public void cadastrar(@RequestBody DadosCadastrosRemedio dados) {
				
			System.out.println(dados);
		}
}
