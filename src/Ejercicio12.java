import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo que desee que tenga el array"));
		int numeros[] = new int[largo];
		numeros = rellenarArray(numeros);
		int digitoFinal = Integer.parseInt(JOptionPane.showInputDialog("Indique el último dígito que desea que posean los elementos del array a buscar"));
		if(esNumeroIndividual(digitoFinal)) {
			int numerosFiltrados[] = filtrarPorUltimoDigito(numeros, digitoFinal);
			System.out.println("Array sin filtrado: ");
			imprimirArray(numeros);
			System.out.println("Array filtrado: ");
			imprimirArray(numerosFiltrados);
		} else {
			JOptionPane.showMessageDialog(null, "El caracter ingresado no corresponde a un número de un dígito");
		}
		
		
	}

	public static boolean esNumeroIndividual(int numero) {
		String num = Integer.toString(numero);
		String numeros = "0123456789";
		if (numeros.contains(num) && num.length() == 1)
			return true;
		else
			return false;
	}

	public static int[] filtrarPorUltimoDigito(int arr[], int ultimoDigito) {
		String digitoFinal = Integer.toString(ultimoDigito);

		// Primero necesito saber cuántos números en el array terminan con el dígito
		// indicado, así sabemos el largo del nuevo array a devolver
		int contador = 0;

		for (int i = 0; i < arr.length; i++) {
			String num = Integer.toString(arr[i]);
			if (num.endsWith(digitoFinal)) {
				contador++;
			}
		}

		int arrayFiltrado[] = new int[contador];

		for (int i = 0, j = 0; i < arr.length; i++) {
			String num = Integer.toString(arr[i]);
			if (num.endsWith(digitoFinal)) {
				arrayFiltrado[j] = arr[i];
				j++;
			}
		}
		return arrayFiltrado;
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
		//Le sumo 1 para que el número esté entre 1 y 300, porque de lo contrario estaría entre 0 y 299
		return random.nextInt(300)+1;
	}

}
