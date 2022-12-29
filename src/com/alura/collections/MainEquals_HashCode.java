package com.alura.collections;

import com.alura.collections.model.Alumno;
import com.alura.collections.model.Curso;

public class MainEquals_HashCode {
	public static void main(String[] args) {

		Curso curso1 = new Curso("Historia", 30);

		Alumno alumno1 = new Alumno("Luis Miguel", "001");
		Alumno alumno2 = new Alumno("Rei", "002");
		Alumno alumno3 = new Alumno("Maria Becerra", "003");
		Alumno alumno4 = new Alumno("Bad Bunny", "004");
		Alumno alumno5 = new Alumno("Becky G", "005");
		Alumno alumno6 = new Alumno("Sebastian yatra", "006");
	
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
	
		Alumno nuevoAlumno = new Alumno("Rei", "002");

		System.out.println(alumno2.equals(nuevoAlumno));
		System.out.println(curso1.verificaAlumno(nuevoAlumno));
	}
}
