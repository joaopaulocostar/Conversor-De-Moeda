import javax.swing.JOptionPane;
public class Executor {

	public static void main(String[] args) {
		Funcionalidade moeda = new Funcionalidade();
		
		while(true) {
			String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de moeda"},
					"Escolha").toString();
			switch (opcao) {
			case "Conversor de moeda": 
				String input = JOptionPane.showInputDialog("Insira um valor: (Sem pontos e virgulas) ");
				if(validar(input)) {
					double valor = Double.parseDouble(input);
					moeda.converter(valor);
					
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja ontinuar?");
					if(JOptionPane.OK_OPTION == resposta) {
						System.out.println("Escolha a proxima ação");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor Inválido");
				}
				
				break;
			
			
			}
		}

	}
	
	public static boolean validar(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}

}
