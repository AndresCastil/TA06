import javax.swing.JOptionPane;
public class Ej2App {
    public static void main(String[] args) {
    	
    	/*Pregunta al usuario para ingresar números y generar a través de un método, 
    	 * números aleatorios
    	 */
    	
    	
    	String texto= JOptionPane.showInputDialog("Piensa en un rango de números.Introduce un número (límite del rango)");
    	   int numL= Integer.parseInt(texto);
    	   
    	String texto1= JOptionPane.showInputDialog("Introduce primer número");
    	   int num1= Integer.parseInt(texto1);
    	
    	String texto2= JOptionPane.showInputDialog("Introduce segundo número");
    	   int num2= Integer.parseInt(texto2);
    	
    	   
    	   for (int i=0; i<numL; i++) {
    		System.out.println(genNum(num1, num2));
    	}
    }
    
     	public static int genNum (int n1, int n2) {
     		return ((int)Math.floor( (Math.random()*(n2-n1))));
     	}    
    
    
}
