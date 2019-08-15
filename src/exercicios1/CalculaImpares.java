package exercicios1;

import javax.swing.JOptionPane;

public class CalculaImpares {

	public static void main(String[] args) {
		String saida = " ";
		int resultado = 1;
		String impar = " ";
		for(int i=1; i<=15 ; i=i+=2) {
			resultado = i * resultado;
			saida = saida + " " + resultado;
			impar = impar + i + " ";
		}
		
		
		
		saida = "Os numeros são: " + impar + 
				"\nO resultado é: " + resultado;
		
		JOptionPane.showMessageDialog(null, saida
		,"resultado",
		JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}

}
