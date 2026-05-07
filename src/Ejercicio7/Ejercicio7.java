package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cantProductos;
		 String producto;
		 int stockProductos;
		
		System.out.println("Ingrese la cantidad de productos: ");
		
		cantProductos = entrada.nextInt();

		for (int i = 1; i <= cantProductos; i++) {

			System.out.print("Producto " + i + ": ");

			producto = entrada.nextLine();
			
			while (producto.isBlank()) {
	            System.err.println("Error: El nombre del producto no puede quedar vacío. Inténtelo de nuevo:");
	            producto = entrada.nextLine();
	        }
			
			System.out.println("Ingrese la cantidad de unidades de este producto: ");
	
			stockProductos = entrada.nextInt();
			
			while (stockProductos < 0) {
	            System.err.println("Error: cantidad de productos no válida. Ingrese un valor mayor a 0:");
	            stockProductos = entrada.nextInt();
	        }
			
			if (stockProductos <= 5) {
				
				System.out.println("Alerta! Este producto esta en peligro de extincion.");
				
			}
			
			System.out.println("Ultimo producto: "+producto);
			System.out.println("Stock: "+stockProductos);
		}
		
	}
	
}
