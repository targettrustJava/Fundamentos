package com.target.dados;

/**
 * Classe para representar um especie de Animal. Uma esp�cie deve sempre conter
 * um nome e um c�digo gerado atrav�s de uma regra de neg�cio
 * 
 * @author cassio trindade
 * @since 30/05/2014
 * @version 1.0
 */
public class Especie {
	private String nome;  			// Vari�vel de inst�ncia
	private Integer codigoEspecie;	// Vari�vel de inst�ncia
	private static String familia;	// Vari�vel de classe
	
	/**
	 * @return o nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * @return o codigoEspecie
	 */
	public Integer getCodigoEspecie() {
		return this.codigoEspecie;
	}

	/**
	 * @param o
	 *            nome com o parametroNome
	 * 
	 */
	public void setNome(String parametroNome) {
		this.nome = parametroNome;
	}

	/**
	 * @param o
	 *            codigoEspecie com parametroCodigoEspecie
	 * 
	 */
	public void setCodigoEspecie(Integer parametroCodigoEspecie) {
		/*
		 * CodigoEspecie � formado com o numero de letras + 000
		 */
		parametroCodigoEspecie = Integer.valueOf(this.nome.length() + "000");
		this.codigoEspecie = parametroCodigoEspecie;
		// esse codigo tem que ser refeito (C�ssio)
	}

	/**
	 * @return the familia
	 */
	public static String getFamilia() {
		return familia;
	}

	/**
	 * @param parametroFamilia
	 *            the familia to set
	 */
	public static void setFamilia(String parametroFamilia) {
		familia = parametroFamilia;
	}

	protected void finalize() throws Throwable {
		// Libera todos os recursos alocados pela classe
		System.out.println("Inst�ncia sendo coletada pelo GC!");
	}

}
