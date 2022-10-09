import javax.swing.JOptionPane;

public class Ej1App {

	public static void main(String[] args) {
		
		String texto="";
		double resultado=0;
		
		String figura=JOptionPane.showInputDialog("Introduce una figura (círculo, triángulo, cuadrado) del área a calcular:");
		switch (figura) {
		case "círculo":
			texto=JOptionPane.showInputDialog("Introduce el radio");
			int radio=Integer.parseInt(texto);
			resultado =areaCirculo( radio);
			System.out.println("El área del círculo es " +areaCirculo(radio));
			break;
		case "triángulo":
			texto=JOptionPane.showInputDialog("Introduce la base");
			int base=Integer.parseInt(texto);
			texto=JOptionPane.showInputDialog("Introduce la altura");
			int altura=Integer.parseInt(texto);
			resultado =areaTriangulo(base, altura);
			System.out.println("El área del triángulo es: "+areaTriangulo(base, altura));
			break;
		case "cuadrado":
			texto=JOptionPane.showInputDialog("Introduce el lado");
			int lado=Integer.parseInt(texto);
			resultado =areaCuadrado(lado);
			System.out.println("El área del cuadrado es " +areaCuadrado(lado));
			break;
		default:
			System.out.println("Opción no válida."); 
			
			
		}
	}
        static double areaCirculo(int radio) {
	    	return Math.pow(radio, 2)*3.1416;
	    }
	        
	
	    static double areaTriangulo(int base, int altura) {
	    	return (base*altura)/2;
	    }
	
	    static double areaCuadrado(int lado) {
	    	return lado*lado;
	    }
}
	



		
				
				