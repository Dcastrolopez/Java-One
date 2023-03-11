package model;


public class Clase implements Comparable<Clase>{

		
	private String nombre;
	
	public Clase(String nombre) {
	    this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Clase o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
}
