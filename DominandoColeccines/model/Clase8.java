package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Clase8 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {

		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};

	
	public static void main(String[] args) {
		for (List<Integer> lista : listas) {
			final String nombreImplementacion = lista.getClass().getSimpleName();
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < 1000000; i++) {
				lista.add(i);
			}
			long fin = System.currentTimeMillis()
;
			long duracion = fin - inicio;
			System.out.println(nombreImplementacion + " add: " + duracion);
			
			
			}
	}
}
