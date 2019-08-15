package exercicios1;

import javax.swing.JOptionPane;

public class CalculoSalario {
	
	public static void main (String [] args) {
		String hrt, sht, dinss;
		int salHor, hrsTrab, salBrut, 
		salLiq, descINSS, dIN;
		
		hrt=
		JOptionPane.showInputDialog
		(null,"Digite a hora trabalhada","Hora trabalhada",
		JOptionPane.QUESTION_MESSAGE);
		hrsTrab = Integer.parseInt(hrt);
		
		sht=
		JOptionPane.showInputDialog
		(null,"Digite o salario por hora trabalhada","Salario Hora trabalhada",
		JOptionPane.QUESTION_MESSAGE);
		salHor = Integer.parseInt(sht);

		dinss=
		JOptionPane.showInputDialog
		(null,"Digite o percentual de desconto INSS","Desconto INSS",
		JOptionPane.QUESTION_MESSAGE);
		dIN = Integer.parseInt(dinss);		
		
		salBrut = salHor * hrsTrab;
		descINSS = salBrut * dIN;
		salLiq = salBrut - descINSS;
		
		JOptionPane.showMessageDialog(null, "Seu salário é de :" + salLiq);
		
	} ;
	
	
}
