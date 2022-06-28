package exercici1;

import java.util.HashSet;

public class Exercici1 {
	/*
	 * No acepta restaurantes con el mismo nombre y la misma puntuación 
	 */

	public static void main(String[] args) {
		HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();
		
		restaurantes.add(new Restaurante("Restaurante 1", 10));
		restaurantes.add(new Restaurante("Restaurante 1", 10));
		restaurantes.add(new Restaurante("Restaurante 2", 2));
		restaurantes.add(new Restaurante("Restaurante 3", 3));
		restaurantes.add(new Restaurante("Restaurante 4", 4));
		restaurantes.add(new Restaurante("Restaurante 5", 5));
		restaurantes.add(new Restaurante("Restaurante 6", 6));
		restaurantes.add(new Restaurante("Restaurante 7", 7));
		restaurantes.add(new Restaurante("Restaurante 8", 9));
		restaurantes.add(new Restaurante("Restaurante 1", 9));
		
		
		for(Restaurante restaurante : restaurantes) {
			System.out.println(restaurante);
		}

	}

}
