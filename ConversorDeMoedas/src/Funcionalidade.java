import javax.swing.JOptionPane;

public class Funcionalidade {
	Conversor moeda = new Conversor();
	public void converter(double valor) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha o tipo de conversão ", "Moedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Reais para Dólares", "De Reais para Euros",
						"De Reais para Libras", "De Reais para Peso Argentino", "De Reais para Peso Chileno",
						"De Dolar para Reais", "De Dolar para Libra", "De Dolar para Euro", "De Dolar para Peso Mexicano"
						}, "Escolha")).toString();
		
		switch (opcao) {
			case "De Reais para Dólares": 
				moeda.RealParaDolar(valor);
				break;
			case "De Reais para Euros": 
				moeda.RealParaEuro(valor);
				break;
			case "De Reais para Libras": 
				moeda.RealParaLibra(valor);
				break;
			case "De Reais para Peso Argentino": 
				moeda.RealParaPesoAr(valor);
				break;
				
			case "De Reais para Peso Chileno": 
				moeda.RealParaPesosCh(valor);
				break;	
			
			case "De Dolar para Reais": 
				moeda.DolarParaReal(valor);
				break;
				
			case "De Dolar para Libra": 
				moeda.DolarParaLibra(valor);
				break;
				
			case "De Dolar para Euro": 
				moeda.DolarParaEuro(valor);
				break;
				
			case "De Dolar para Peso Mexicano": 
				moeda.DolarParaPesoMex(valor);
				break;
		}
	}
}
