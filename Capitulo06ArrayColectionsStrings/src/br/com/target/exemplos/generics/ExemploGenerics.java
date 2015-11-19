package br.com.target.exemplos.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.target.dados.Cliente;
import br.com.target.dados.ColecaoGenerica;

public class ExemploGenerics {

	public static void main(String[] args) {
		testaGenerics3();
	}
	/**
	 * Exemplo da utiliza��o de Generics
	 */
	public static void testaGenerics() {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("Diego"));
		clientes.add(new Cliente("Pedro"));
		clientes.add(new Cliente("Jo�o"));

		for (Cliente c : clientes) {
			System.out.println(c.getNome());
		}

		Cliente c = clientes.get(0);
		System.out.println("-->"+c.getNome());
	}

	public static void testaGenerics1() {
	      Cliente c = new Cliente("Jo�o", "Jo�ozinho" ); 
	      Map<String, Cliente> hash = new HashMap<String, Cliente>();
	        
	      // Adiciona um Cliente na Hash
	      hash.put(c.getNome(), c);
	      //hash.put(new Integer(1), c); 
	      
	      // Recupera um Cliente
	      Cliente x = hash.get( c.getNome() );

	     // Mostra dados do Cliente recuperado
	     System.out.printf( "Dados: %s  %s", x.getNome(), x.getApelido());
	   }

	public static void testaGenerics2() {
	
		ColecaoGenerica<String> racasCaes = new ColecaoGenerica<String>();
		
		racasCaes.add("Bulldog");
		racasCaes.add("Beagle");
		racasCaes.add("Dogue Alem�o");
		racasCaes.add("Golden Retriever");
		racasCaes.add("Labrador");
		racasCaes.add("Akita");
		// racasCaes.add(true); //s� aceita argumento String 
		racasCaes.lista();  // imprime os 
		racasCaes.ordena();
		racasCaes.lista(); 
	
	}
	
	public static void testaGenerics3() {
		ColecaoGenerica<Cliente> clientes= new ColecaoGenerica<Cliente>();
		clientes.add(new Cliente("Pedro","pedrinho",11121970));
		clientes.add(new Cliente("Paulo","paulinho",5101990));
		clientes.add(new Cliente("Ana","aninha",5101990));
		clientes.processElements();
		clientes.ordena();
		clientes.processElements();
	} 
}
