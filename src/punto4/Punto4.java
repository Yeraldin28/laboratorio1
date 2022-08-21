
package punto4;

import java.io.IOException;

public class Punto4 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CALCULA EL VOLUMEN DE UN CONO\n");

		// Declaraci�n de las variables
		double radio, altura, volumen;

		// Asignaci�n de las variables
		radio = 1;
		altura = 1;
		volumen = Math.round(((Math.PI * Math.pow(radio, 2) * altura) / 3) * 100) / 100.0;

		// Salida por pantalla
		if (radio < 0 || altura < 0) {
			System.out.println("\tIntroduce n�meros positivos en las medidas del cono");
		} else {
			System.out.println("\tLas medidas introcucidas son: \n\n" + "\tRadio: " + radio + "\n\tAltura: " + altura
					+ "\n\n\t Y el volumen del cono es: " + volumen);
		}
	}
}
