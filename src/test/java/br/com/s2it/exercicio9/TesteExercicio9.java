package br.com.s2it.exercicio9;

import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio9 {

	Exercicio9 exercicio = new Exercicio9();

	@Test(expected = NullPointerException.class)
	public void testNoInicialNulo() {
		exercicio.getValorNosSubsequentes(null);
	}

	@Test
	public void testeNoSemFilhos() {
		int resultado = 0;

		Assert.assertEquals(resultado, exercicio.getValorNosSubsequentes(new BinaryTree()));
	}
	
	@Test
	public void testeNoComFilhosPreenchidos() {
		BinaryTree tree = new BinaryTree();
		BinaryTree tree1 = new BinaryTree();
		BinaryTree tree2 = new BinaryTree();
		BinaryTree tree3 = new BinaryTree();
		BinaryTree tree4 = new BinaryTree();
		BinaryTree tree5 = new BinaryTree();
		BinaryTree tree6 = new BinaryTree();
		
		tree.valor = 5;
		tree1.valor = 3;
		tree2.valor = 4;
		tree3.valor = 2;
		tree4.valor = 7;
		tree5.valor = 6;
		tree6.valor = 8;
		
		tree.left = tree1;
		tree.right = tree4;
		tree1.left = tree3;
		tree1.right = tree2;
		tree4.left = tree5;
		tree4.right = tree6;
		
		int resultado = 30;
		
		Assert.assertEquals(resultado, exercicio.getValorNosSubsequentes(tree));
	}
}
