package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio01.Desafio01Solucao;

class Desafio01SolucaoTest {
	
	Desafio01Solucao solucao = new Desafio01Solucao();
	
	String escadaEsperada = "     *\n" + "    **\n" + "   ***\n" + "  ****\n" + " *****\n" + "******";

	@Test
	void testCriarEscada() {
		assertEquals(escadaEsperada, solucao.criarEscada(6));
	}

}
