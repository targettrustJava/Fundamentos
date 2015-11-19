package br.com.target.dados;

public class Aluno {
	private String nome;
	private int anoIgresso;
	private int anoSaida;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Aluno(String nome, int anoIgresso, int anoSaida) {
		this.nome = nome;
		this.anoIgresso = anoIgresso;
		this.anoSaida = anoSaida;
	}

	public int getAnoIgresso() {
		return anoIgresso;
	}

	public void setAnoIgresso(int anoIgresso) {
		this.anoIgresso = anoIgresso;
	}

	public int getAnoSaida() {
		return anoSaida;
	}

	public void setAnoSaida(int anoSaida) {
		this.anoSaida = anoSaida;
	}

	public Aluno(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public  int getTotalAlunos(){
		return 10;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", anoIgresso=" + anoIgresso
				+ ", anoSaida=" + anoSaida + "]";
	}
}
