package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {



		Scanner entrada = new Scanner(System.in);



		String nombAlumno = " ";

		int edadAlumno = 0;

		int cantInscriptos = 0;



		System.out.println("Cuantos alumnos se van a inscribir: ");

		cantInscriptos = entrada.nextInt();

	



		for (int i = 0; i < cantInscriptos; i++) {

			entrada.nextLine();

			System.out.println("Ingrese su nombre completo: ");

			nombAlumno = entrada.nextLine();



			while (nombAlumno.isBlank()) {

				System.err.println("Error: El nombre no puede quedar vacío. Inténtelo de nuevo!:");

				nombAlumno = entrada.nextLine();

 

			}

			System.out.println("Ingrese su edad: ");

			edadAlumno = entrada.nextInt();



			if (edadAlumno < 0 || edadAlumno > 100) {

				System.err.println("Error: Edad no válida. Ingrese una edad entre 0-100	:");

				edadAlumno = entrada.nextInt();

			}



		

		}



		System.out.println("---LISTA FINAL---");



		System.out.println("-Cantidad " + cantInscriptos + " de inscripciones");

		System.out.println("-Alumno/a: " + nombAlumno);

		System.out.println("-Edad: " + edadAlumno + " Años ");



		if (edadAlumno < 18) {

			System.out.println("-El alumno/a es menor de edad. ");

		}



		if (edadAlumno >= 18) {

			System.out.println("-El alumno/a es mayor de edad. ");

		}



	}



}