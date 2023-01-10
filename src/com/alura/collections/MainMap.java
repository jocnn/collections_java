package com.alura.collections;

import com.alura.collections.model.Alumno;
import com.alura.collections.model.Curso;

import java.util.Optional;

public class MainMap {
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
		
		//curso1.getAlumnos().forEach(a -> System.out.println(a.getNombre()));
		
        // Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();		
		// if (alumno.isPresent()) {
		// 	System.out.println(alumno.get());
		// }

		// Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		// System.out.println(alumnoMap);

		curso1.getAlumnoMap().forEach((key, value) -> {
			System.out.println(value);
		});

	}
}
