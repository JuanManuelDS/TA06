import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {

		int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo que desee que tengan los arrays"));
		int array1[] = new int[largo];
		int array2[] = new int[largo];
		array2 = array1;
		array1 = rellenarArray(array1);
		
		int array3[] = multiplicarArrays(array1, array2);
		System.out.println("------- Array 1 ----------");
		imprimirArray(array1);
		System.out.println("------- Array 2 ----------");
		imprimirArray(array2);
		System.out.println("------- Array 3 ---------");
		imprimirArray(array3);
	}
	
	public static int[] multiplicarArrays(int arr1[], int arr2[]) {
		int[] newArray = new int[arr1.length];
		for(int i = 0; i<arr1.length;i++) {
			newArray[i] = arr1[i]*arr2[i];
		}
		return newArray;
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
