package com.alura.collections;

import com.alura.collections.model.Curso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MainCollectionsStreams2 {
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};

	public static void main(String[] args) {
		Curso curso1 = new Curso("Historia", 40);
		Curso curso2 = new Curso("Trigonometria", 20);
		Curso curso3 = new Curso("Física", 35);
		Curso curso4 = new Curso("Química", 25);
		Curso curso5 = new Curso("Educación fisica", 90);
		Curso curso6 = new Curso("Programación", 20);
		Curso curso7 = new Curso("Álgebra", 35);
		Curso curso8 = new Curso("Filosofía", 25);
		Curso curso9 = new Curso("Educación fisica", 70);
		Curso curso10 = new Curso("Trigonometria", 10);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		cursos.add(curso9);
		cursos.add(curso10);

		List<Curso> cursoLista = cursos.stream()
				.filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia"))
				.sorted(Comparator.comparingInt(Curso::getTiempo))
				.collect(Collectors.toList());
		
		System.out.println("cursoLista: " + cursoLista);

		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
	
		Map<String, List<Curso>> mapaLista = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
		mapaLista.forEach((k, v) -> System.out.println(k + " - " + v.size()));

		System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());

	}
	
}
