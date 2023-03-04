
public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Hello, World!");

		int edad = 8;
		int cantidadPersonas = 1;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && cantidadPersonas >= 2;
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar && esPareja) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Su ingreso no esta permitido");
		}

	}
}
