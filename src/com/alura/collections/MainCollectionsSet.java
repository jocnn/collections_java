package com.alura.collections;

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
		
		for (var alumno: listaAlumnos) {
			System.out.println("alumno: " + alumno);			
		}
		
	}
}
