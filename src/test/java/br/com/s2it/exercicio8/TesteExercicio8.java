package br.com.s2it.exercicio8;

import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio8 {
	
	Exercicio8 exercicio = new Exercicio8();
	
	@Test
	public void testeComNumerosComAMesmaQuantidadeDeDigitos() {
		int a = 159;
		int b = 183;
		int c = 115893;
		
		Assert.assertEquals(c, exercicio.gerarC(a, b));
	}
	
	@Test
	public void testeComQuantidadeDeDigitosDiferentes() {
		int a = 12;
		int b = 9845;
		int c = 192845;
		
		Assert.assertEquals(c, exercicio.gerarC(a, b));
	}
	
	@Test
	public void testeMarioQueLimiteDefinido() {
		int a = 1000;
		int b = 100;
		int c = -1;
		
		Assert.assertEquals(c, exercicio.gerarC(a, b));
	}
	
	@Test
	public void testeMarioQueLimiteDeInt() {
		int a = 13123;
		int b = 14123;
		int c = -1;
		
		Assert.assertEquals(c, exercicio.gerarC(a, b));
	}
	
	
}
