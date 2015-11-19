package br.com.target.exemplos.arrays;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ExemploColection {

	public static void main(String[] args) {
		// testaArrayList();
		// testaInterator();
		// testaEnumeration();
		// testaList();
		// testaVector();
		// testaHashTable();
		// testaHashSet();
		testaLinkedList();
	}

	/**
	 * - Elementos n�o ordenados - Permite duplicados - null � permitido -
	 * Semelhante a classe Vector - Acesso aleat�rio
	 */
	public static void testaArrayList() {
		ArrayList lista = new ArrayList();
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Golden Retriever");
		lista.add("Labrador");

		System.out.println("*** Tamanho do Array: " + lista.size()
				+ lista.isEmpty());
		for (int j = 0; j < lista.size(); j++)
			System.out.println(lista.get(j));

		lista.remove(2); // Dogue Alem�o
		System.out.println("*** Tamanho do Array: " + lista.size()
				+ lista.isEmpty());
		for (int j = 0; j < lista.size(); j++)
			System.out.println(lista.get(j));

		lista.clear();
		System.out.println("*** Tamanho do Array: " + lista.size()
				+ lista.isEmpty());
	}

	public static void testaInterator() {
		String s = "";
		ArrayList lista = new ArrayList();
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Golden Retriever");
		lista.add("Labrador");
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			s = s + (String) it.next() + ",";
		}
		System.out.println(s);
	}

	public static void testaEnumeration() {
		String s = "";
		Vector lista = new Vector();
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Golden Retriever");
		lista.add("Labrador");
		Enumeration e = lista.elements();
		while (e.hasMoreElements()) {
			s = s + (String) e.nextElement() + ",";
		}
		System.out.println(s);
	}

	public static void testaList() {
		List lista = new ArrayList();
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Golden Retriever");
		lista.add("Labrador");
		lista.add("Bulldog");
		lista.add(null);

		for (int j = 0; j < lista.size(); j++)
			System.out.println(lista.get(j));
	}

	/**
	 * Elementos n�o ordenados 
	 * Permite duplicados 
	 * null � permitido
	 * Acesso aleat�rio
	 */
	public static void testaVector() {

		Vector lista = new Vector();
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Golden Retriever");
		lista.add("Labrador");
		lista.add("Bulldog");
		lista.add(null);
		System.out.println(lista.get(0));
		System.out.println(lista);

	}

	public static void testaVector1() {
		Vector lista = new Vector(2, 2);
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Golden Retriever");
		lista.add("Labrador");
		lista.add("Bulldog");
		lista.add(null);
		lista.trimToSize();
		// lista.setSize(2);

		System.out.println(lista.get(0));
		System.out.println(lista.get(0).hashCode());

		System.out.println(lista.get(5));
		System.out.println(lista.get(5).hashCode());
		System.out.println(lista);
	}

	/**
	 * Elementos n�o ordenados 
	 * permite duplicados 
	 * null N�O � permitido
	 * Acesso baseado em chave
	 */
	public static void testaHashTable() {
		try {

			System.out.println("Hashtable--------");
			Hashtable lista3 = new Hashtable();
			lista3.put(new Integer(1), "Bulldog");
			lista3.put(new Integer(2), "Beagle");
			lista3.put(new Integer(3), "Dogue Alem�o");
			lista3.put(new Integer(4), "Dogue Alem�o");
			lista3.put(new Integer(5), "Labrador");
			lista3.put(new Integer(6), "Bulldog");
			//lista3.put(new Integer(7), null);
			System.out.println(lista3.get(new Integer(1)));
			//System.out.println(lista3.get(new Integer(1)).hashCode());
			System.out.println(lista3.get(new Integer(6)));
			//System.out.println(lista3.get(new Integer(6)).hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Elementos n�o ordenados 
	 * N�o permite duplicados 
	 * null � permitido
	 * Acesso baseado em chave
	 */
	public static void testaHashSet() {
		try {

			System.out.println("HashSet--------");
			String s ="";
			HashSet lista = new HashSet();
			lista.add("Bulldog");
			lista.add("Beagle");
			lista.add("Dogue Alem�o");
			lista.add("Labrador");
			lista.add("Bulldog");
			lista.add("Dogue Alem�o");
			//lista.add(null);
			Iterator it = lista.iterator();
			while (it.hasNext()) {
				s = s + (String) it.next() + ",";
			}
			System.out.println(s);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Elementos n�o ordenados 
	 * Permite duplicados
	 * null � permitido
	 */
	public static void testaLinkedList() {
		List lista = new LinkedList();
		lista.add("Bulldog");
		lista.add("Beagle");
		lista.add("Dogue Alem�o");
		lista.add("Dogue Alem�o");
		lista.add("Labrador");
		lista.add("Bulldog");
		lista.add(null);
		System.out.println(lista);
	}
}
