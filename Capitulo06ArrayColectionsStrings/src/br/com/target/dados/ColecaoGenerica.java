package br.com.target.dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked"})
public class ColecaoGenerica<T> {

	private ArrayList elementos;

	public ColecaoGenerica() {
		setElementos(new ArrayList());
	}

	public void add(T obj) {
		getElementos().add(obj);
	}

	public void remove(T obj) {
		getElementos().remove(obj);
	}


	public void ordena() {
		 Collections.sort(getElementos());
	}

	
	public void lista() {
		String s = "";
		Iterator it = getElementos().iterator();
		while (it.hasNext()) {
			s = s + (String) it.next() + ",";
		}
		System.out.println(s);
	}

	public void processElements() {
		for (Object o : getElementos()) {
			System.out.println(o);
		}
		System.out.println("Total de: "  + getElementos().size());
	}

	public ArrayList getElementos() {
		return elementos;
	}

	public void setElementos(ArrayList elementos) {
		this.elementos = elementos;
	}

}
