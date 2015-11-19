package br.com.target.dados;

import java.util.ArrayList;
import java.util.List;


public class apl {

	public static void main(String[] args) {
		
		ColecaoGenerica<Cliente>   colecaoClientes = new ColecaoGenerica<Cliente>();
		
		Cliente c = new Cliente("Cassio", "Professor");
		Cliente c1 = new Cliente("Perdro", "Aluno");
		
		colecaoClientes.add(c1);
		colecaoClientes.add(c);
		
		colecaoClientes.processElements();

	}

}
