package exercicios1;

import javax.swing.JOptionPane;

public class DigitaMes {

	public static void main(String[] args) {

		String numMes;
		int mes;
		
		numMes=  
		JOptionPane.showInputDialog
		(null,"Digite o m�s desejado","M�s",
		JOptionPane.QUESTION_MESSAGE);
		mes = Integer.parseInt(numMes);
		
		
		
		
		
		switch(mes) {
		case 1: JOptionPane.showMessageDialog(null,"O m�s desejado � Janeiro"); break;
		case 2: JOptionPane.showMessageDialog(null,"O m�s desejado � Fevereiro"); break;
		case 3: JOptionPane.showMessageDialog(null,"O m�s desejado � Mar�o"); break;
		case 4: JOptionPane.showMessageDialog(null,"O m�s desejado � Abril"); break;
		case 5: JOptionPane.showMessageDialog(null,"O m�s desejado � Maio"); break;
		case 6: JOptionPane.showMessageDialog(null,"O m�s desejado � Junho"); break;
		case 7: JOptionPane.showMessageDialog(null,"O m�s desejado � Julho"); break;
		case 8: JOptionPane.showMessageDialog(null,"O m�s desejado � Agosto"); break;
		case 9: JOptionPane.showMessageDialog(null,"O m�s desejado � Setembro"); break;
		case 10: JOptionPane.showMessageDialog(null,"O m�s desejado � Outubro"); break;
		case 11: JOptionPane.showMessageDialog(null,"O m�s desejado � Novembro"); break;
		case 12: JOptionPane.showMessageDialog(null,"O m�s desejado � Dezembro"); break;
		default: JOptionPane.showMessageDialog(null,"N�o � um m�s V�lido!"); break;
		
	}
	}
}
