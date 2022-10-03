import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {

		int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo que desee que tenga el array"));
		int rangoMin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango mínimo que desee que tengan los números del array"));
		int rangoMax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango máximo que desee que tengan los números del array."));
		int numeros[] = new int[largo];
		
		numeros = rellenarArray(numeros, rangoMin, rangoMax);
		imprimirArray(numeros);
		imprimirTotal(numeros);
		
	}
	
	public static int[] rellenarArray(int numeros[],int min, int max) {
		for(int i = 0; i<numeros.length; i++) {
			numeros[i] = createRandomNumberFromRange(min, max);
		}
		return numeros;
	}
	
	public static void imprimirArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	
	public static void imprimirTotal(int arr[]) {
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("El total de la suma de los elementos del array es igual a " + total);
	}
	
	public static int createRandomNumberFromRange(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}


}
