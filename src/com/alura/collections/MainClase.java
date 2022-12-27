package com.alura.collections;

import java.util.ArrayList;

import com.alura.collections.model.Clase;
import com.alura.collections.model.Curso;

public class MainClase {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Java", 40, new ArrayList<>());
		curso1.addClase(new Clase("ArrayList"));
		curso1.addClase(new Clase("List"));
		curso1.addClase(new Clase("LinkedList"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getClaseList());
		
	}
}
