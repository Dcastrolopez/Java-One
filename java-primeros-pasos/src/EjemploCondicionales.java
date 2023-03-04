
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Hello, World!");

		int edad = 8;
		int cantidad = 1;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero esta permitido su ingreso");
			} else {
				System.out.println("Su ingreso no esta permitido");
			}

		}
	}
}
