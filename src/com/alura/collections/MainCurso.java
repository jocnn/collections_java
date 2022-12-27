package com.alura.collections;

import java.util.ArrayList;

public class MainCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Geometria", 40);
		Curso curso2 = new Curso("Historia", 20);
		Curso curso3 = new Curso("Fisica", 35);
		Curso curso4 = new Curso("Geografia", 25);

		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		System.out.println(cursos.toString());
	}
}
