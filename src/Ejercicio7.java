import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {

		String moneda = JOptionPane
				.showInputDialog("Ingrese el nómbre de la moneda a la que quiere convertir \n Libras, Dólares, Yenes")
				.toLowerCase();
		double cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de euros que desea convertir a "+moneda));

		moneyConverter(cantidad, moneda);
	}

	public static void moneyConverter(double cantidad, String moneda) {

		final double LIBRA = 0.89;
		final double DOLAR = 1.28611;
		final double YEN = 129.852;
		double conversion = 0;
		boolean esMoneda = true;

		switch (moneda) {
		case "libras":
			conversion = cantidad * LIBRA;
			break;
		case "dólares":
			conversion = cantidad * DOLAR;
			break;
		case "yenes":
			conversion = cantidad * YEN;
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"La moneda ingresada no corresponde con niguna de las monedas que convertimos. Por favor, vuelva a ingresar una moneda");
			esMoneda = false;
			break;
		}

		if(esMoneda)
			JOptionPane.showMessageDialog(null, cantidad + " euros equivalen a " + conversion + " " + moneda);
	}

}
