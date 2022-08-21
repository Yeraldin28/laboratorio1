
package punto3;

import java.io.IOException;

public class Punto3 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CALCULA EL �REA DE UN TRAPECIO\n");

		// Declaraci�n de las variables
		double baseMayor, baseMenor, altura, numeroDeApoyo, area;

		// Asignaci�n de las variables
		baseMayor = 2;
		baseMenor = 1;
		altura = 1;
		area = Math.round((((baseMayor + baseMenor) / 2) * altura) * 100) / 100.0;

		// Comprobaci�n del n�mero mayor en las bases
		if (baseMenor > baseMayor) {
			numeroDeApoyo = baseMenor;
			baseMenor = baseMayor;
			baseMayor = numeroDeApoyo;
		}

		// Salida por pantalla
		if (baseMayor < 0 || baseMenor < 0 || altura < 0) {
			System.out.println("\tIntroduce n�meros positivos en las medidas del trapacio");
		} else {
			System.out
					.println("\tLas medidas introducidas son: \n\n" + "\tBase mayor: " + baseMayor + "\n\tBase menor: "
							+ baseMenor + "\n\tAltura: " + altura + "\n\n\t Y el �rea del trapecio es: " + area);
		}
	}
}
