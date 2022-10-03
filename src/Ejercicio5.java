import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número y lo convertiremos a binario"));
		String binario = parseBinary(numero);
		JOptionPane.showMessageDialog(null, "El " + numero + " convertido a binario es " + binario);
		
	}
	
	public static String parseBinary(int numDecimal) {
		
		String numBinario = "";
		
		do {
			numBinario = numDecimal%2 + numBinario;
			numDecimal /= 2;
			if(numDecimal<=1)
				numBinario = numDecimal + numBinario;
		} while(numDecimal>1);
		
		return numBinario;
	}

}
