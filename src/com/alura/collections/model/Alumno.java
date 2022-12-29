package com.alura.collections.model;

public class Alumno {
	private String nombre;
	private String codigo;
	
	public Alumno(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public boolean equals(Object obj) {
		Alumno a = (Alumno) obj;
			return this.nombre.equals(a.getNombre());
	}

	@Override
	public int hashCode() {
		return this.nombre.hashCode();
	}
	
}
