package Principal;

import javax.swing.*;

import ConversorDivisas.OpcionesConversion;

public class Principal {
	public static void main(String[] args) {
		OpcionesConversion conversion = new OpcionesConversion();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object [] {"Conversor de Divisas", "Conversor de Temperaturas"}, "Elegir").toString();
			switch(opciones) {
			case "Conversor de Divisas":
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirDivisas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opción Afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
			}
		}
	}
}
