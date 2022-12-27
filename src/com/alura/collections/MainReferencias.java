package com.alura.collections;

import java.util.ArrayList;
import java.util.List;

import com.alura.collections.model.Aula;
import com.alura.collections.model.Curso;

public class MainReferencias {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Java", 40, new ArrayList<>());
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		curso1.addAula(new Aula("Inmutable"));
		
		List<Aula> aulaList = curso1.getAulaList();
		//aulaList.add(new Aula("inmutable"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(aulaList);
		
	}
}
