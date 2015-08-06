package com.targettrust.apl;

//TesteStatic.java
class Classe1 {
	// Variavel static
	public static int contadorStatic = 0;

	// Variavel nao-static
	public int outroContador = 0;

	public Classe1() {
	}
	
	// Precisa ser static porque "contador" � static
	public static void incrementaContador() {
		contadorStatic++;
		System.out.println("contador static agora � " + contadorStatic);
	}

	public void incrementaOutroContador() {
		outroContador++;
		System.out.println("outro contador agora � " + outroContador);
	}
}

public class TesteStatic {
	public static void main(String args[]) {
		Classe1 c1 = new Classe1();
		c1.incrementaContador();
		c1.incrementaOutroContador();

		Classe1 c2 = new Classe1();
		c2.incrementaContador();
		c2.incrementaOutroContador();

		Classe1 c3 = new Classe1();
		c3.incrementaContador();
		c3.incrementaOutroContador();

		Classe1 c4 = new Classe1();
		c4.incrementaContador();
		c4.incrementaOutroContador();
	}
	
	
	/*
	 * Note que a vari�vel "contador", que � static, 
	 * n�o teve seu valor zerado 
	 * a cada novo objeto criado da classe Classe1, 
	 * mas sim incrementado, enquanto "outroContador", 
	 * que � uma vari�vel comum, ficou sempre em 1, 
	 * pois a zeramos o valor no construtor da classe.
	 */
}
