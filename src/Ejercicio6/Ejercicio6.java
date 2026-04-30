package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcion;
		int puntajeIngresado;
		int puntajeMax = 0;

		do {
			System.out.println("Eliga una opcion.");

			System.out.println("1. Registrar puntaje");

			System.out.println("2. Mostar mejor puntaje");

			System.out.println("3. Salir");

			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Ingrese su puntaje: ");
				puntajeIngresado = entrada.nextInt();

				if (puntajeIngresado > puntajeMax) {

					puntajeMax = puntajeIngresado;

				}

				break;

			case 2:
				System.out.println("El mejor puntaje es: " + puntajeMax);

				break;

			case 3:
				System.out.println("Saliste del menu, bot");

				break;

			default:
				System.out.println("Opcion incorrecta");

				break;

			}

		} while (opcion != 3);
	}

	}
