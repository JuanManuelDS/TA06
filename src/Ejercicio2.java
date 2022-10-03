import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int cantidadNs = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números aleatorios que desea"));
		int rangoMin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor mínimo (inclusivo) que quiere que estos números adquieran"));
		//Le sumo uno al rango máximo para que sea inclusivo
		int rangoMax =1+Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor máximo (inclusivo) que quiere que adquieran estos números"));
		
		for(int i = 1; i<=cantidadNs; i++) {
			int randomNumber = createRandomNumberFromRange(rangoMin, rangoMax);

			JOptionPane.showMessageDialog(null, "El "+i+"° número aleatorio es " + randomNumber);
		}
		
	}
	
	public static int createRandomNumberFromRange(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

}
