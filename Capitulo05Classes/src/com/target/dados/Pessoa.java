package com.target.dados;

import java.util.Date;
// .... Defini��o da classe Pessoa....

public class Pessoa extends Object{  
	private long codigo;
	private String nome;
	private String sobreNome;
	protected String identificador;
	private Date dataCadastro = new Date(); // variavel de classe recebendo um valor
	private Date dataNascimento;  
	private Endereco endereco;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param parametroCodigo
	 * @param parametroNome
	 * @param parametroSobreNome
	 * @param parametroIdentificador
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 * @param parametroEndereco
	 */
	public Pessoa(long parametroCodigo, String parametroNome,
			String parametroSobreNome, String parametroIdentificador,
			Date parametroDataCadastro, Date parametroDataNascimento,
			Endereco parametroEndereco) {
		this.codigo = parametroCodigo;
		this.nome = parametroNome;
		this.sobreNome = parametroSobreNome;
		this.identificador = parametroIdentificador;
		this.dataCadastro = parametroDataCadastro;
		this.dataNascimento = parametroDataNascimento;
		this.endereco = parametroEndereco;
	}


	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param parametroCodigo the codigo to set
	 */
	public void setCodigo(long parametroCodigo) {
		this.codigo = parametroCodigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * @return the sobreNome
	 */
	public String getSobreNome() {
		return this.sobreNome;
	}
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return this.identificador;
	}
	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return this.endereco;
	}
	/**
	 * @param parametroNome the nome to set
	 */
	public void setNome(String parametroNome) {
		this.nome = parametroNome;
	}
	/**
	 * @param parametroSobreNome the sobreNome to set
	 */
	public void setSobreNome(String parametroSobreNome) {
		this.sobreNome = parametroSobreNome;
	}
	/**
	 * @param parametroIdentificador the identificador to set
	 */
	public void setIdentificador(String parametroIdentificador) {
		this.identificador = parametroIdentificador;
	}
	/**
	 * @param parametroDataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date parametroDataCadastro) {
		this.dataCadastro = parametroDataCadastro;
	}
	/**
	 * @param parametroDataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date parametroDataNascimento) {
		this.dataNascimento = parametroDataNascimento;
	}
	/**
	 * @param parametroEndereco the endereco to set
	 */
	public void setEndereco(Endereco parametroEndereco) {
		this.endereco = parametroEndereco;
	}
	
	
}
