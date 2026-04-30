package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cantProductos;
		 String producto;
		 int stockProductos;
		int stockBajo;
		
		System.out.println("Ingrese la cantidad de productos: ");
		
		cantProductos = entrada.nextInt();

		for (int i = 1; i <= cantProductos; i++) {

			System.out.print("Producto " + i + ": ");

			producto = entrada.next();
			
			System.out.println("Ingrese la cantidad de unidades de este producto: ");
	
			stockProductos = entrada.nextInt();
			
			if (stockProductos <= 5) {
				
				stockBajo = stockProductos;
				System.out.println("Alerta! Este producto esta en peligro de extincion.");
				
			}
			
		}

		
		
		
		
		
		
		
		
		

		
		
	}
	
}
