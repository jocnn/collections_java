package com.alura.collections;

import com.alura.collections.model.Aula;
import com.alura.collections.model.Curso;
import java.util.ArrayList;

public class MainAula {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Java", 40, new ArrayList<>());
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getAulaList());
		
	}
}
