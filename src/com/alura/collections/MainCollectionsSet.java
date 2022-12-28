package com.alura.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MainCollectionsSet {
	public static void main(String[] args) {
		String alumno1 = "Tinni";
		String alumno2 = "Maluma";
		String alumno3 = "Bad Bunny";
		String alumno4 = "Alejandro Sanz";

		Set<String> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);

		// for (var alumno: listaAlumnos) {
		// 	System.out.println("alumno: " + alumno);			
		// }

		listaAlumnos.forEach(alumn -> System.out.println(alumn));

		//boolean valido = listaAlumnos.contains("Pepito");
		boolean valido = listaAlumnos.contains("Bad Bunny");
		System.out.println("validación: " + valido);

		String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println("max: " + max);
		System.out.println("max: " + max.length());
		
		listaAlumnos.removeIf(alumn -> "Maluma".equalsIgnoreCase(alumn));
		listaAlumnos.forEach(a -> System.out.println(a));

	}
}
