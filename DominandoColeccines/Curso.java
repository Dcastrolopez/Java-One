import java.util.ArrayList;
import java.util.List;

import model.Clase;

public class Curso implements Comparable<Curso>{

		
	private String nombre;
	private int tiempo;
	
	
	public Curso(String nombre, int tiempo) {
	    this.nombre = nombre;
	    this.tiempo = tiempo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Curso o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
}
