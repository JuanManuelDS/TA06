import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número y le diremos si es primo o no"));
		int factorial = getFactorial(numero);
		System.out.println("El factorial es " + factorial);
	}
	public static int getFactorial (int num) {
		int factorial = 1;
		for(int i = num; i>0; i--) {
			factorial*=i;
		}
		return factorial;
	}
}
