package com.remedios.gustavo.curso.remedio;

//aqui seria o uso de um DTO.
public record DadosCadastrosRemedio(
		String nome,
		Via via,
		String lote,
		String quantidade,
		String validade,
		Laboratorio laboratorio) {

}
