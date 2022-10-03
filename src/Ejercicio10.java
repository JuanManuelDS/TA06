import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {

		int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo que desee que tenga el array"));
		int rangoMin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango mínimo que desee que tengan los números del array"));
		int rangoMax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango máximo que desee que tengan los números del array."));
		int numeros[] = new int[largo];
		numeros = rellenarArray(numeros, rangoMin, rangoMax);
		imprimirArray(numeros);
		printMax(numeros);
		
	}
	
	public static int[] rellenarArray(int numeros[],int min, int max) {
		for(int i = 0; i<numeros.length; i++) {
			boolean primo = false;
			//La función reasigna un valor aleatorio hasta que este coincida con un número primo
			do {
				numeros[i] = createRandomNumberFromRange(min, max);
				primo = isPrime(numeros[i]);
			}while(!primo);
			
		}
		return numeros;
	}
	
	public static void imprimirArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	
	public static boolean isPrime(int numero) {
		boolean prime = true;
		if(numero >1) {
			for(int i = 2; i<numero; i++) {
				if(numero%i == 0)
					prime=false;
			}
		} else 
			prime=false;
		
		return prime;
	}
	
	public static void printMax(int arr[]) {
		Arrays.sort(arr);
		System.out.println("El valor más alto dentro del array es " + arr[arr.length -1]);
	}
	
	public static int createRandomNumberFromRange(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

}
