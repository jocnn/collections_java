package com.alura.collections;

import java.util.ArrayList;

public class Ejemplo1 {
	public static void main(String[] args) {
		String variable1 = "ejemplo1";
		String variable2 = "ejemplo2";
		String variable3 = "ejemplo3";
		String variable4 = "ejemplo4";

		System.out.println();
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);

		lista.remove(2);
		System.out.println(lista);

		lista.set(0, "ejemplo11");
		System.out.println(lista);
	}
}
