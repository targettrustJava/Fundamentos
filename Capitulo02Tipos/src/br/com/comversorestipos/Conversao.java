package br.com.comversorestipos;

public class Conversao {

	public static void teste() {

		/*
		 * Casting feito implicitamente, pois o valor possui um tamanho menor
		 * que o tipo da vari�vel que ir� recebe-lo.
		 */
		System.out
				.println("Casting feito implicitamente, pois o valor possui um\n tamanho menor que o tipo da vari�vel que ir� recebe-lo.");
		char a = 'a';
		int b = 'b';
		float c = 100;

		System.out.println("char a = 'a': " + a); // Imprime a
		System.out.println("int b = 'b': " + b); // Imprime 98 (conver��o
													// implicita char b = 98)
		System.out.println("float c = 100: " + c); // Imprime 100.0

	}

	public static void teste1() {
		/*
		 * Casting feito explicitamente, pois o valor possui um tamanho maior
		 * que o tipo da variavel que ir� recebe-lo.
		 */
		char a = 'a';
		int d = (int) 5.1987;
		float e = (float) 5.0;

		int f = (a + 5);

		System.out.println("**** int f =  (a + 5) : " + f);

		char g = (char) 110.5;

		short s = (short) 0xffff;
		char c1 = '\uffff';

		System.out.println("int d = (int) 5.1987: " + d); // Imprime 5
		System.out.println("float e = (float) 5.0: " + e); // Imprime 5.0
		System.out.println(f); // Imprime 102
		System.out.println(g); // Imprime n
		System.out.println(s); // Imprime -1
		System.out.println(c1); // Imprime ?
	}

	public static void teste2() {
		/*
		 * Conver��o invalaida, Erro de compila��o
		 */

		int i = 13;
		// byte b1 = i;

		/*
		 * As classes Wrappers possuem m�todos de convers�o de tipos que podem
		 * ser usados ao inv�s de Casting
		 */

		int idade = Integer.parseInt("18");
		double preco = Double.parseDouble("45.14");

		System.out.println(idade); // Imprime o numero 18
		System.out.println(preco); // Imprime
		System.out.println("**** preco * idade = " + preco * idade);

		String idade1 = "18";
		String preco1 = "45.14";
		System.out.println("**** preco + idade = " + (preco1 + idade1));
	}

	public static void teste3() {
		/*
		 * Exemplo de opera��o de converso��es validas e invalidas
		 */
		Integer i1 = 10;
		Double d1 = 35.7;
		Float f = 100f;

		f = i1.floatValue(); // Esta opera��o � poss�vel pois Integer t�m menor
								// precis�o que Float
		// f = d1.doubleValue() ; //Esta opera��o n�o � poss�vel pois Double n�o
		// �cabe� em Float

	}

	public static void teste4() {
		/*
		 * Exemplos de convers�o utilizando cast e Math
		 */
		int i = 0;
		double z = 12.564;

		i = (int) 13.456;

		// byte b = i; // Erro em tempo de compila��o.
		byte b = (byte) i; // Utilizando cast, sem erro de compila��o

		System.out.println(i);
		System.out.println(Math.round(z));
		System.out.println(Math.floor(z));
		System.out.println(Math.ceil(z));

		short s = (short) 010; // valor octagonal
		char c = '\u0025';

		int i0 = s;
		int i2 = c;

		System.out.println(s);
		System.out.println(c);

		System.out.println(i0);
		System.out.println(i2);

	}

	public static void main(String[] args) {
		teste();
		teste1();
		teste2();
		teste3();
		teste4();

	}
}
