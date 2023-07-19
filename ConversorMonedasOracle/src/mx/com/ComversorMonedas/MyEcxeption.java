package mx.com.ComversorMonedas;

import javax.swing.JOptionPane;

public class MyEcxeption extends RuntimeException {

	  public MyEcxeption(int n) {
		if(n == 0) {
			JOptionPane.showMessageDialog(null, "Error: No has ingresado ningun valor en alguno de los campos requeridos");
		} else if(n == 1) {
			JOptionPane.showMessageDialog(null, "Error: No puedes ingresar ' 0 ' como valor a convertir en ningun campo");
		} else if(n == 2) {
			JOptionPane.showMessageDialog(null, "Error: No puedes ingresar palabras o letras como valor en ningun campo");
		}
		  
	}
}
