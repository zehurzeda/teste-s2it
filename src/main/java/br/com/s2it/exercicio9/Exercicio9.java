package br.com.s2it.exercicio9;

import java.util.Objects;

public class Exercicio9 {

	public int getValorNosSubsequentes(BinaryTree noInicial) {
		return somarNos(noInicial.left) + somarNos(noInicial.right);
	}

	private int somarNos(BinaryTree tree) {
		if (Objects.isNull(tree)) {
			return 0;
		}

		return tree.valor + somarNos(tree.left) + somarNos(tree.right);
	}

}
