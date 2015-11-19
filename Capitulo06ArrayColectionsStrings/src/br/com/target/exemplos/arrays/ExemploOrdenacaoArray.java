package br.com.target.exemplos.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings({ "rawtypes", "unchecked","unused" })
public class ExemploOrdenacaoArray {

	public static void main(String[] args) {
		// HashMap ordenado por Keys
		// TestaOrdenarHashMap();
		// HashMap ordenado por Valor
		TestaOrdenarHashMap1();
		
	}

	private static void TestaOrdenarHashMap() {
		/*
		 * Neste exemplo, está sendo ordenado o tipo HashMap com base nas chaves
		 * usando a classe de coleção TreeMap.
		 * 
		 * HashMap ordenado por Keys
		 */

		HashMap<Integer, String> deusesGregos = new HashMap<Integer, String>();
		deusesGregos.put(5, "Ares");
		deusesGregos.put(11, "Calandra");
		deusesGregos.put(4, "Zeus");
		deusesGregos.put(77, "Yahto");
		deusesGregos.put(9, "Perceu");
		deusesGregos.put(66, "Quimera");
		deusesGregos.put(0, "Raissa");

		System.out.println("Antes de Ordenar:");
		Set set = deusesGregos.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		Map<Integer, String> map = new TreeMap<Integer, String>(deusesGregos);
		System.out.println("\n----------\nApós Ordenar:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();

		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}
	}


	private static void TestaOrdenarHashMap1() {
		/*
		 * Vamos ordrnar HashMap por valores, usando a interface Comparator.
		 */

		HashMap<Integer, String> deusesGregos = new HashMap<Integer, String>();
		deusesGregos.put(5, "Ares");
		deusesGregos.put(11, "Calandra");
		deusesGregos.put(4, "Zeus");
		deusesGregos.put(77, "Yahto");
		deusesGregos.put(9, "Perceu");
		deusesGregos.put(66, "Quimera");
		deusesGregos.put(0, "Raissa");

		System.out.println("Antes de Ordenar:");
		Set set = deusesGregos.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.println(me.getValue()+ ": ");
			System.out.print(me.getKey());
		}

		Map<Integer, String> map = sortByValues(deusesGregos);
		System.out.println("\n----------\nApós Ordenar:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();

		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
			
		}
	}

	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		// Personalizando o Comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		// Copiando a lista ordenada em HashMap
		// Usando LinkedHashMap para preservar a ordem de inserção

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

}
