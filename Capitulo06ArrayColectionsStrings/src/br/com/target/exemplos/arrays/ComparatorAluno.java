package br.com.target.exemplos.arrays;

import br.com.target.dados.Aluno;

public class ComparatorAluno implements Comparable<Aluno> {

	public int compareTo(Aluno a1, Aluno a2) {
		return a1.getAnoIgresso() < a2.getAnoIgresso() ? -1 : (a1.getAnoIgresso() > a2.getAnoIgresso() ? +1 : 0);
	}

	@Override
	public int compareTo(Aluno o) {
		// TODO Auto-generated method stub
		return 0;
	}
	     
}
