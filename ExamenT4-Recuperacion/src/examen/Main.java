package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tirada1;
		int tirada2;
		String nomJ1;
		String nomJ2;
		
		Scanner lectura = new Scanner(System.in);
		
		Funciones funciones = new Funciones();
		
		System.out.println("El mínimo del dado");
		Funciones.minDado = lectura.nextInt();
		
		System.out.println("El máximo del dado");
		Funciones.maxDado = lectura.nextInt();
		
		System.out.println("Introduzca el nombre del jugador 1:");
		nomJ1 = lectura.next();
		System.out.println("Introduzca el nombre dle jgador 2");
		nomJ2 = lectura.next();
		
		while (nomJ1.equals(nomJ2)) {
			System.out.println("Los dos jugadores no pueden poner el mismo nombre");
			System.out.println("Introduzca el nombre del jugador 2");
			nomJ2 = lectura.next();
		}
		Funciones.pintaPista();
		
		while (funciones.esGanador(nomJ1, nomJ2).equals(" ")) {
			System.out.println("Pulsa alguna letra para continuar");
			String para = lectura.next();
			System.out.println("Turno del jugador 1 " + nomJ1);
			
			tirada1 = Funciones.tiraDados();
			tirada2 = Funciones.tiraDados();
			
			System.out.println("En la primera tirada ha sacado " + tirada1);
			System.out.println("En la segunda tirada ha sacado " + tirada2);
			
			if (!Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2)) {
				System.out.println("La tirada no es válida porque la suma de los números no es primo");
			} else {
				System.out.println("Tirada válida");
				int sumaTiradas = tirada1 + tirada2;
				Funciones.fichaJ1 += sumaTiradas;
			}
			
			Funciones.pintaPista();
			funciones.imprimeComoVaLaCarrera(nomJ1, nomJ2);
			
			System.out.println("Turno del jugador 2 " + nomJ2);
			
			tirada1 = Funciones.tiraDados();
			tirada2 = Funciones.tiraDados();
			
			System.out.println("En la primera tirada ha sacado " + tirada1);
			System.out.println("En la segunda tirada ha sacado " + tirada2);
			

			if (!Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2)) {
				System.out.println("La tirada no es válida porque la suma de los números no es primo");
			} else {
				System.out.println("Tirada válida");
				int sumaTiradas = tirada1 + tirada2;
				Funciones.fichaJ2 += sumaTiradas;
			}
			Funciones.pintaPista();
			funciones.imprimeComoVaLaCarrera (nomJ1, nomJ2);
			
		}
		System.out.println("Ha ganado: " + funciones.esGanador(nomJ1, nomJ2));
		lectura.close();
	}

}
