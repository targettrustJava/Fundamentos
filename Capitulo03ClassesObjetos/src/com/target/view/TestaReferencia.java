package com.target.view;

import com.target.model.Animal;

public class TestaReferencia {
	 private static Animal cao;
	 private static Animal gato;

	public static void main(String[] args) {

		cao = new Animal();

		if (cao == null)
			System.out.println("Objeto cao � null");
		else
			System.out.println("Objeto cao N�O � null");

		if (gato == null)
			System.out.println("Objeto gato � null");
		else
			System.out.println("Objeto gato N�O � null");

	}

}
