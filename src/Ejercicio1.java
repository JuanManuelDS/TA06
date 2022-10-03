import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String figura = "";
		boolean isFigura = true;
		double area = 0;
		
		//le pido al cliente que vuelva a introducir un nombre de figura hasta que sea uno válido
		do {
			figura =  JOptionPane.showInputDialog("Introduzca el nombre de la figura de la que desee calcular el área.\n(Recuerde utilizar tildes)").toLowerCase();
			switch(figura) {
			case "círculo":
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio"));
				area = calcularAreaCirculo(radio);
				isFigura=true;
				break;
			case "triángulo":
				double base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura"));
				area = calcularAreaTriangulo(base, altura);
				isFigura=true;
				break;
			case "cuadrado":
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el lado"));
				area = calcularAreaCuadrado(lado);
				isFigura=true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "El nombre introducido no se corresponde con alguna figura que podamos calcular");
				isFigura = false;
			}
		} while (isFigura == false);
		
		JOptionPane.showMessageDialog(null, "El área del " + figura + " es " + area);
		
	}
	
	public static double calcularAreaCirculo(double radio) {
		final double PI = 3.14;
		double resultado = Math.pow(radio, 2) * PI;
		return resultado;
	}
	
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}
	
	public static double calcularAreaCuadrado(double lado) {
		return lado*lado;
	}
}