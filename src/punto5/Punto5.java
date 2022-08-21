
package punto5;

import java.io.IOException;

public class Punto5 {
	public static void main(String arg[]) throws IOException {
		System.out.println("\n\n\tESTE PROGRAMA CONIERTE SEGUNDOS A D�AS, HORAS, MINUTOS Y SEGUNDOs\n");

		// Declaraci�n de las variables
		int segundos, minutos, horas, dias, segundosFinales;

		// Asignaci�n de las variables
		segundos = 957000;
		dias = segundos / 86400;
		horas = (segundos - (dias * 86400)) / 3600;
		minutos = (segundos - ((dias * 86400) + (horas * 3600))) / 60;
		segundosFinales = segundos - ((dias * 86400) + (horas * 3600) + (minutos * 60));

		// Salida por pantalla
		if (segundos < 0) {
			System.out.print("Escribe los segundos como un n�mero positivo");
		} else {
			System.out.print("\n\tLos segundos introducidos son: " + segundos + " que pueden ser expresados como: "
					+ "\n\n\tD�as: " + dias + "\n\tHoras: " + horas + "\n\tMinutos: " + minutos + "\n\tSegundos: "
					+ segundosFinales);
		}
	}
}
