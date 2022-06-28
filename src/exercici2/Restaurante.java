package exercici2;

public class Restaurante implements Comparable<Restaurante>{
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
	public int compareTo(Restaurante o) {
		int comparacion=nombre.compareTo(o.nombre);
        if(comparacion==0){
            if(puntuacion<o.puntuacion)
                return 1;
            else
                if(puntuacion==o.puntuacion)
                    return 0;
                else
                    return -1;
        }
        else
            return comparacion;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + ", puntuacion: " + puntuacion;
	}

	
	
	
}
