
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException ex) {
			String msg = ex.getMessage();
			System.out.println("ArithmeticException");
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (MiExepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

	public static void metodo2() throws MiExepcion {
		System.out.println("Ini do metodo2");

		System.out.println("Fim do metodo2");
		throw new MiExepcion("Mi Exepcion fue lanzada");

	}
}
