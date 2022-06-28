package exercici2;

import java.util.TreeSet;

public class Exercici2 {

	/*
	 * Restaurantes ordenados por nombre y puntuación de mayor a menor
	 */
	public static void main(String[] args) {

		TreeSet<Restaurante> ts = new TreeSet<Restaurante>();
		
		
		Restaurante r1 = new Restaurante("restaurante1", 10);
		Restaurante r2 = new Restaurante("restaurante2", 2);
		Restaurante r3 = new Restaurante("restaurante3", 3);
		Restaurante r4 = new Restaurante("restaurante4", 7);
		Restaurante r5 = new Restaurante("restaurante4", 6);
		Restaurante r6 = new Restaurante("restaurante1", 10);
		Restaurante r7 = new Restaurante("restaurante6", 7);
		
		ts.add(r1);
		ts.add(r2);
		ts.add(r3);
		ts.add(r4);
		ts.add(r5);
		ts.add(r6);
		ts.add(r7);
		
		
		
		for(Restaurante restaurante : ts) {
			System.out.println(restaurante);
		}
	}

}
