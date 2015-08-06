package com.targettrust.java;

import java.util.ArrayList;

/*
 * Define A Classe ClienteDB para teste de orverload 
 * @author C�ssio Trindade
 * @since 17/10/2013
 * @version 1.0
 */

public class ClienteDB {
	private String nome ;
	private int id;
	private ArrayList<EnderecoDB> enderecos;
	
	public ClienteDB(){
		enderecos = new ArrayList<EnderecoDB>();
	}

	public ClienteDB(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
		enderecos = new ArrayList<EnderecoDB>();
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the endere�o
	 */
	public ArrayList<EnderecoDB> getEndereco() {
		return enderecos;
	}

	/**
	 * @param enderecos the endere�o to set
	 */
	 public void setEndereco( EnderecoDB e ) {
		 enderecos.add(e);
	    }

	/**
	 * Imprime o nome do Cliente
	 * 
	 * @param nome Nome do Cliente
	 */
	public String lista(String nome) {
		System.out.println(nome);
		return nome;
	}
	
	/**
	 * Imprime o c�digo do Cliente
	 * 
	 * @param id c�digo do Cliente
	 */
	public int lista(int id) {
		System.out.println(id);
		return id;
	}

	/**
	 * Imprime o nome e o c�digo do Cliente
	 * 
	 * @param nome Nome do Cliente
	 * 
	 * @param id c�digo do Cliente
	 */
	public String lista(String nome, int id) { 
		System.out.println("O Cliente " + nome + " tem o Codigo: " + id);
		return nome;
	}

}
