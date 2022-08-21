
package punto1;

import java.io.IOException;

public class Punto1 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CONVIERTE EUROS A D�LARES Y PESOS COLOMBIANOS\n");

		// Declaraci�n de las variables
		double dolares, pesos, euros;

		// Asignaci�n de las variables
		euros = -1;
		pesos = Math.round((euros * 4465.87) * 100) / 100.0;
		dolares = Math.round((euros * 1.15) * 100) / 100.0;

		// Salida por pantalla
		if (euros >= 0) {
			System.out.println("\tLos euros introducidos son: " + euros);
			System.out.println("\n\tConvertido a d�lares es: " + dolares);
			System.out.println("\tConvertido a pesos es: " + pesos);
		} else {
			System.out.println("\tIngresa una cantidad positiva");
		}

	}

}
