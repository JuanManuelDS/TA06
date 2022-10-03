import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		numeros = rellenarArray(numeros);
		imprimirArray(numeros);
	}
	
	public static int[] rellenarArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		}
		return arr;
	}
	
	public static void imprimirArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}

}
