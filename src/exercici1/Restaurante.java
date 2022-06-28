package exercici1;

import java.util.Objects;

public class Restaurante {
	private String nombre;
	private int puntuacion;
	
	public Restaurante(String nombre, int puntuacion) {
		this.nombre     = nombre;
		this.puntuacion = puntuacion;
	}

	public float getPuntuacion() {
		return this.puntuacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntuacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(nombre, other.nombre) && puntuacion == other.puntuacion;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + ", puntuacion: " + puntuacion;
	}

}
