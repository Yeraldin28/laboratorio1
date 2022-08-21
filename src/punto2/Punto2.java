
package punto2;

import java.io.IOException;

public class Punto2 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA COMPRUEBA SI UN N�MERO ES M�LTIPLO DE OTRO\n");

		// Declaraci�n de las variables
		int numeroMayor, numeroMenor, numeroDeApoyo;

		// Asignaci�n de las variables
		numeroMayor = 5;
		numeroMenor = 20;

		// Comprobaci�n del numero mayor
		if (numeroMenor > numeroMayor) {
			numeroDeApoyo = numeroMenor;
			numeroMenor = numeroMayor;
			numeroMayor = numeroDeApoyo;
		}

		// Salida por pantalla
		System.out.println("\tLos n�meros introcucidos son: \n\n" + "\tN�mero mayor: " + numeroMayor
				+ "\n\tN�mero menor: " + numeroMenor);
		if (numeroMayor % numeroMenor == 0) {
			System.out.println("\n\n\tEl n�mero " + numeroMayor + " si es m�ltiplo de " + numeroMenor);
		} else {
			System.out.println("\n\n\tEl n�mero " + numeroMayor + " no es m�ltiplo de " + numeroMenor);
		}
	}
}
