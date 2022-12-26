package com.alura.collections;

import java.util.ArrayList;

public class Ejemplo2 {
	public static void main(String[] args) {
		String variable1 = "example 1";
		String variable2 = "example 2";
		String variable3 = "example 3";
		String variable4 = "example 4";

		System.out.println();
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		
		System.out.println("usando println para imprimir lista");
		System.out.println(listaString);

		System.out.println("usando for tradicional para imprimir lista");
		for (int i = 0; i < listaString.size(); i++) {
			System.out.println(listaString.get(i));
		}

		System.out.println("usando forEach para imprimir lista");
		for (var lista : listaString) {
			System.out.println(lista);
		}
		
		System.out.println("usando lambda para imprimir lista");
		listaString.forEach(listaLambda -> System.out.println(listaLambda));
	}
}
