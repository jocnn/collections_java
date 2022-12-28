package com.alura.collections;

import java.util.Iterator;

import com.alura.collections.model.Alumno;
import com.alura.collections.model.Curso;

public class MainSetsIterators {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Historia", 30);

		Alumno alumno1 = new Alumno("Luis Miguel", 001);
		Alumno alumno2 = new Alumno("Rei", 002);
		Alumno alumno3 = new Alumno("Maria Becerra", 003);
		Alumno alumno4 = new Alumno("Bad Bunny", 004);
		Alumno alumno5 = new Alumno("Becky G", 005);
		Alumno alumno6 = new Alumno("Sebastian yatra", 006);
	
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
	
		//curso1.getAlumnos().forEach(a -> System.out.println(a.getNombre()));
		Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
		while (alumnoIterator.hasNext()) {
			System.out.println(alumnoIterator.next().getNombre());
		}
	}
}
