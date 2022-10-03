import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		int numero = 0;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo"));
		} while(numero<0);
		int cifras = countFigures(numero);
		JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + cifras + " cifras");
	}
	
	public static int countFigures (int entero) {
		String numero = String.valueOf(entero);
		return numero.length();
	}

}
