package examen;

public class Funciones {

	static final int TAMCIRCUITO = 11;
	static int minDado, maxDado;
	static int fichaJ1, fichaJ2;

	static int tiraDados() {
		return (int) (Math.random() * (maxDado - minDado) + minDado);
	}

	static void pintaPista() {
		for (int i = 1; i <= TAMCIRCUITO; i++) {
			System.out.print(" " + i);
		}
		System.out.println();
		for (int i = 1; i <= fichaJ1; i++) {
			System.out.print(" ");
		}
		System.out.print("J1");
		System.out.println();

		for (int i = 1; i <= fichaJ2; i++) {
			System.out.print(" ");
		}
		System.out.print("J2");
		System.out.println();
	}

	static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {

		int suma = tirada1 + tirada2;
		boolean primo = true;

		for (int i = 2; i < suma; i++) {
			if (suma % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}

	void imprimeComoVaLaCarrera(String nombreJ1, String nombreJ2) {

		if (fichaJ1 > fichaJ2) {
			System.out.println(nombreJ1 + " va ganando.");
		} else if (fichaJ2 > fichaJ1) {
			System.out.println(nombreJ2 + " va ganando.");
		} else {
			System.out.println("Los jugadores van empatados");
		}
	}

	String esGanador(String nombreJ1, String nombreJ2) {

		String ganador = " ";

		if (fichaJ1 >= TAMCIRCUITO) {
			ganador = nombreJ1;
		} else if (fichaJ2 >= TAMCIRCUITO) {
			ganador = nombreJ2;
		}
		return ganador;
	}
}
