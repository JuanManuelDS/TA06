import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		String input = "";
		int numero = 0;
		do {
			input = JOptionPane.showInputDialog("Ingrese un número entero positivo");
			if(input.matches("[0-9]+")) {
				numero = Integer.parseInt(input);
			} else {
				JOptionPane.showMessageDialog(null, "Los caracteres ingresados no corresponden a un número entero positivo");
			}
		} while(numero<=0);
		int cifras = countFigures(numero);
		JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + cifras + " cifras");
	}
	
	public static int countFigures (int entero) {
		String numero = String.valueOf(entero);
		return numero.length();
	}

}
