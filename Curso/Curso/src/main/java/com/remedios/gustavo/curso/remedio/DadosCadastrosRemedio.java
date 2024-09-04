package com.remedios.gustavo.curso.remedio;

public record DadosCadastrosRemedio(
		String nome,
		Via via,
		String lote,
		String quantidade,
		String validade,
		Laboratorio laboratorio) {

}
