package com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.alura.collections.model.Aula;
import com.alura.collections.model.Curso;

public class MainCollectionsStreams {
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};
	public static void main(String[] args) {
		Curso curso1 = new Curso("Historia", 40);
		Curso curso2 = new Curso("Trigonometria", 20);
		Curso curso3 = new Curso("Fisica", 35);
		Curso curso4 = new Curso("Quimica", 25);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		// System.out.println(cursos);
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		System.out.println(cursos);
		
		int tiempo = 0;
		for (Curso curso : cursos) {
			tiempo += curso.getTiempo();
		}
		System.out.println(tiempo);
		
		// List<Curso> cursoFiltrar = cursos.stream()
		// 	.filter(curso -> !curso.getNombre().equalsIgnoreCase("Fisica"))
		// 	.sorted(Comparator.comparingInt(Curso::getTiempo))
		// 	.collect(Collectors.toList());
		//System.out.println(cursoFiltrar);
		
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
	}
}
