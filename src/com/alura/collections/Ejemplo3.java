package com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {
	public static void main(String[] args) {
		String curso1 = "Sociales";
		String curso2 = "Religion";
		String curso3 = "Fisica";
		String curso4 = "Historia";

		System.out.println();
		ArrayList<String> listaCursos = new ArrayList<>();
		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);
		listaCursos.add(curso4);
		
		System.out.println("Impresion de lista sin ordenar");
		System.out.println(listaCursos);

		Collections.sort(listaCursos);
		System.out.println("Impresion de lista ordenada");
		System.out.println(listaCursos);

		Collections.sort(listaCursos, Collections.reverseOrder());
		System.out.println("Impresion de lista ordenada invertida");
		System.out.println(listaCursos);

		listaCursos.sort(Comparator.naturalOrder());
		System.out.println("Impresion de lista usando Comparator orden natural");
		System.out.println(listaCursos);

		List<String> listaC = listaCursos.stream().sorted().collect(Collectors.toList());
		System.out.println("Impresion de lista usando stream");
		System.out.println(listaC);
	}
}
