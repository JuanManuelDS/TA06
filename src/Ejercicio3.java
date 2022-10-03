import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número y le diremos si es primo o no"));
		boolean esPrimo = isPrime(numero);
		if(esPrimo)
			JOptionPane.showMessageDialog(null, "El " + numero + " es primo");
		else
			JOptionPane.showMessageDialog(null, "El " + numero + " no es primo");
	}

	
	public static boolean isPrime(int numero) {
		boolean prime = true;
		for(int i = 2; i<numero; i++) {
			if(numero%i == 0)
				prime=false;
		}
		return prime;
	}
}
