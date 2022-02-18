package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio02.Desafio02Solucao;

class Desafio02SolucaoTest {

	Desafio02Solucao solucao = new Desafio02Solucao();
	
	@Test
	void testVerificaSenha() {
		assertEquals(3, solucao.verificarSenha("Ya3"));
	}

}
