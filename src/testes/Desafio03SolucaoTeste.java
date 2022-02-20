package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio03.Desafio03Solucao;

class Desafio03SolucaoTeste {

	Desafio03Solucao solucao = new Desafio03Solucao();
	
	@Test
	void test() {
		assertEquals(3, solucao.verificaPalavra("ifailuhkqq"));
	}

}
