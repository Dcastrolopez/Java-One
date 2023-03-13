// Linked list vs Array List

package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase9 {

	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {

		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};

	public static void main(String[] args) {
		Curso curso1 = new Curso ("Historia", 30);
		Curso curso2 = new Curso ("Algebra", 10);
		Curso curso3 = new Curso ("Aritmetica", 20);
		Curso curso4 = new Curso ("Geometría", 50);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		cursos.sort(Comparator.comparing(Curso::getNombre));

		System.out.println(cursos);
		
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
		System.out.println(cursoList);
		}
	}

