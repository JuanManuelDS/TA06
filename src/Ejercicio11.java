import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {

		int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo que desee que tengan los arrays"));
		int array1[] = new int[largo];
		int array2[] = new int[largo];
		array1 = rellenarArray(array1);
		array2 = array1.clone();
		imprimirArray(array1);
		imprimirArray(array2);
	}
	
	public static void imprimirArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

	public static int[] rellenarArray(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = createRandomNumberFromRange();
		}
		return numeros;
	}

	public static int createRandomNumberFromRange() {
		Random random = new Random();
		return random.nextInt(100);
	}

}
