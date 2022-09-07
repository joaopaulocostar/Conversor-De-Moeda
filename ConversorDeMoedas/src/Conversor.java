import javax.swing.JOptionPane;

public class Conversor{
	
	public void RealParaDolar(double valor) {
		double dolar = valor / 5.17;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: " + "US$" + dolar + " Dólares!");
	}
	
	public void RealParaEuro(double valor) {
		double euro = valor / 10.85;
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: "  + euro + "€ Euros!");
	}
	
	public void RealParaLibra(double valor) {
		double libra = valor / 6.33;
		libra = (double) Math.round(libra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: " + "£ " + libra + " Libras!");
		
	}
	
	public void RealParaPesoAr(double valor) {
		double pesoAr = valor / 0.039;
		pesoAr = (double) Math.round(pesoAr * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: " + "$" + pesoAr + " Pesos Argentinos!");
	}
	
	public void RealParaPesosCh(double valor) {
		double pesoCh = valor /0.0040;
		pesoCh = (double) Math.round(pesoCh * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: " + "$" + pesoCh + " CLP Pesos Chilenos!");
	}
	
	public void DolarParaReal(double valor) {
		double real = valor * 5.17;
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: " + "R$" + real + " Reais!");

	}
	
	public void DolarParaLibra(double valor) {
		double libra = valor * 1.15;
		libra = (double) Math.round(libra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: " + "£ " + libra + " Libras!");

	}
	
	public void DolarParaEuro(double valor) {
		double euro = valor * 1;
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: "  + euro + "€ Euros!");

	}
	
	public void DolarParaPesoMex(double valor) {
		double pesoMex = valor * 19.95;
		pesoMex = (double) Math.round(pesoMex * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: $"  + pesoMex + " Pesos Mexicanos");

	}
	
	
	
}
