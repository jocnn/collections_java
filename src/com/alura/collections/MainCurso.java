package com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Php", 40);
		Curso curso2 = new Curso("Ruby", 20);
		Curso curso3 = new Curso("C#", 35);
		Curso curso4 = new Curso("Java", 25);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println("impresion tal cual fueron ingresados");
		System.out.println(cursos.toString());
		
		System.out.println("impresion en orden de forma natural");
		Collections.sort(cursos);
		System.out.println(cursos);
		
		System.out.println("impresion en Orden inverso ------");
		// Collections.sort(cursos, Collections.reverseOrder());
		Collections.sort(cursos, Comparator.comparing(Curso::getTiempo).reversed());
		System.out.println(cursos);
		
		System.out.println("impresion implementando comparator dentro del método, invertido");
		//Collections.sort(cursos, Comparator.comparing(Curso::getNombre));
		cursos.sort(Comparator.comparing(Curso::getTiempo).reversed());
		System.out.println(cursos);
		
		System.out.println("impresion usnado stream");
		List<Curso> cursoL = cursos.stream()
			.sorted(Comparator.comparingInt(Curso::getTiempo))
			.collect(Collectors.toList());
		System.out.println(cursoL);
		
		System.out.println("impresion usnado filter con stream");
		List<Curso> cursoFiltrar = cursos.stream()
			.filter(curso -> !curso.getNombre().equalsIgnoreCase("Php"))
			.sorted(Comparator.comparingInt(Curso::getTiempo))
			.collect(Collectors.toList());
		System.out.println(cursoFiltrar);
	}
}
