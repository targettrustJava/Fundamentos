package br.com.target.exemplos.strings;

public class ExemploStrings1 {

	public static void main(String args[]) {
		// uso construtor
		String nomeAnimal = new String("Rex");
		System.out.println(nomeAnimal);
		System.out
				.println("**----------------------------------------------**");

		/* Strings simples */
		String animal1 = "C�o";
		String animal2 = "Gato";

		System.out.println(animal1 + " & " + animal2); // C�o & Gato
		System.out.println(animal1 + " \u0026 " + animal2);
		System.out
				.println("**----------------------------------------------**");

		// Concatena��o
		String apelidoAnimal = "Fuj�o";
		apelidoAnimal = apelidoAnimal.concat(" Bob�o");
		System.out.println(apelidoAnimal);

		apelidoAnimal = "Fuj�o" + " Brincalh�o";
		System.out.println(apelidoAnimal);
		System.out
				.println("**----------------------------------------------**");

		// Convers�o
		int numero = 12;
		String frase = "Animal numero " + numero;
		System.out.println(frase);
		System.out
				.println("**----------------------------------------------**");

		// Literais
		String descricaoGato = "\tGato siam�s � uma ra�a de gato oriental,\n "
				+ "caracterizada por um corpo elegante e longil�neo e uma\n"
				+ " cabe�a marcadamente triangular. Pode ser confundido com\n "
				+ "a ra�a de gatos thai que tem origem na ra�a siamesa mas\n "
				+ "apresenta uma morfologia bem distinta.\n"
				+ " Aconselh�vel para uma fam�lia.\n"
				+ "S�o precisos poucos cuidados com o pelo.";
		System.out.println(descricaoGato);
		System.out
				.println("**----------------------------------------------**");

		/*
		 * Opera��es com Strings
		 */

		/* construindo uma string a partir de um array de char */
		char[] charArray = { 'C', 'A', 'C', 'H', 'O', 'R', 'R', 'O', ' ', 'e',
				' ', 'G', 'A', 'T', 'O' };
		String string1 = new String(charArray);
		System.out.println("\n" + string1);
		System.out
				.println("**----------------------------------------------**");

		/* construindo uma string a partir de uma string literal */
		String string2 = "www.petshoptt.com.br";
		System.out.println("\n" + string2);

		//Tamanho da String
		System.out.println(string2 + " possui " + string2.length()
				+ " caracteres.");
		
		//Localizar caracter pelo �ndice
		System.out.println(string2.charAt(2)); // w
		
		//Letras mai�sculas e min�sculas de uma String.
		System.out.println(string2.toUpperCase()); 
		System.out.println(string2.toLowerCase()); 				
		System.out
		.println("**----------------------------------------------**");

		// Retorno de caracteres espec�ficos e conte�do
		String string3 = "  Sistema de Controle de Animais PTT";
		System.out.println(string3.substring(2,4));//Si 
		System.out.println(string3.substring(13));//Controle de Animais PTT 
		System.out.println(string3.trim());
		System.out.println(string3.startsWith(" "));
		
		System.out
		.println("**----------------------------------------------**");
		
		/*
		 * Posicionar-se em uma string, utilizasse o m�todo indexOf() para
		 * localizar uma string dentro de outra.
		*/ 
		int posicao; // vari�vel que guarda a posi��o da string encontrada.
		String busca = "."; // String a ser buscada.
		posicao = string2.indexOf(busca);
		if (posicao >= 0) {
			System.out.println("A string " + busca + " esta na posi��o "
					+ posicao);
		} else {
			System.out.println("N�o h�  " + busca + " na string");
		}

		posicao = string2.lastIndexOf(".com");
		if (posicao >= 0) {
			System.out.println("A string .com esta na posi��o de " + posicao);
		} else {
			System.out.println("N�o h� .com na string");
		}
		System.out
				.println("**----------------------------------------------**");

		/*
		 * o especificador de formato para caractere (%c) mostra o i-�simo
		 * caractere da tabela ASCII
		 */
		int i;
		System.out.printf("\n\nCaracteres especiais:\n");
		for (i = 30; i <= 47; i++) {
			System.out.printf("\no caracter especia � %c � o numero " + i, i);
		}

		System.out.printf("\n\nCracteres num�ricos:\n");
		for (i = 48; i <= 57; i++) {
			System.out.printf("%c", i);
		}

		System.out.printf("\n\nCaracteres alfab�ticos mai�sculos:\n");
		for (i = 65; i <= 90; i++) {
			System.out.printf("%c", i);
		}

		System.out.printf("\n\nCaracteres alfab�ticos min�sculos:\n");
		for (i = 97; i <= 122; i++) {
			System.out.printf("%c", i);
		}
		System.out.printf("\n");

	}
}
