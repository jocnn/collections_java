package com.alura.collections.model;

public class Aula {
	private String nombre;
	
	public Aula(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
}
