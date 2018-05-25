package br.com.s2it.exercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio8 {

	private static final Logger LOGGER = Logger.getAnonymousLogger();
	private static final int LIMITE_VALOR = 1000000;

	public int gerarC(int a, int b) {
		final StringBuilder strBuilder = new StringBuilder();

		final String stringA = Integer.toString(a);
		final String stringB = Integer.toString(b);

		int limiteLoop = Math.max(stringA.length(), stringB.length());

		for (int i = 0; i < limiteLoop; i++) {
			if (i < stringA.length()) {
				strBuilder.append(stringA.charAt(i));
			}
			if (i < stringB.length()) {
				strBuilder.append(stringB.charAt(i));
			}
		}
		try {
			final int c = Integer.parseInt(strBuilder.toString());

			return c > LIMITE_VALOR ? -1 : c;
		} catch (NumberFormatException ex) {
			LOGGER.log(Level.INFO, "O valor de 'C' ultrapassa o limite do tipo int", ex);
			return -1;
		}

	}

}
