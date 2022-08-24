package ConversorDivisas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	ConvertirDivisas moneda = new ConvertirDivisas();
	public void ConvertirDivisas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE,null, new Object[]
						{"De Pesos Arg a Dólar", "De Pesos Arg a Euro", "De Pesos Arg a Libras Esterlinas", "De pesos Arg a Yen", "De Pesos Arg a Won Sur Coreano",
								"De Dólares a Pesos Arg", "De Euros a Pesos Arg", "De Libras a Pesos Arg", "De Yen a Pesos Arg",
								"De Won Coreano a Pesos Arg"},
				"Seleccion")).toString();	
		switch (opcion) {
			case "De Pesos Arg a Dólar":{
				moneda.ConvertirPesosArgentinosADolares(valor);
				break;
			}
			case "De Pesos Arg a Euro":{
				moneda.ConvertirPesosArgentinosEuros(valor);
				break;
			}
			case "De Pesos Arg a Libras Esterlinas":{
				moneda.ConvertirPesosArgentinosLibra(valor);
				break;
			}
			case "De pesos Arg a Yen":{
				moneda.ConvertirPesosArgentinosYen(valor);
				break;
			}
			case "De Pesos Arg a Won Sur Coreano":{
				moneda.ConvertirPesosArgentinosWonCoreano(valor);
				break;
			}
			case "De Dólares a Pesos Arg":{
				moneda.ConvertirDolaresAPesosArgentinos(valor);
				break;
			}
			case "De Euros a Pesos Arg":{
				moneda.ConvertirEurosAPesosArgentinos(valor);
				break;
			}
			case "De Libras a Pesos Arg":{
				moneda.ConvertirLibraAPesosArgentinos(valor);
				break;
			}
			case "De Yen a Pesos Arg":{
				moneda.ConvertirYenAPesosArgentinos(valor);
				break;
			}
			case "De Won Coreano a Pesos Arg":{
				moneda.ConvertirWonCoreanoAPesosArgentinos(valor);
				break;
			}
		}
	}
}
