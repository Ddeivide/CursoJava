package exercicios1;

import javax.swing.JOptionPane;

public class DigitaMes {

	public static void main(String[] args) {

		String numMes;
		int mes;
		
		numMes=  
		JOptionPane.showInputDialog
		(null,"Digite o mês desejado","Mês",
		JOptionPane.QUESTION_MESSAGE);
		mes = Integer.parseInt(numMes);
		
		
		
		
		
		switch(mes) {
		case 1: JOptionPane.showMessageDialog(null,"O mês desejado é Janeiro"); break;
		case 2: JOptionPane.showMessageDialog(null,"O mês desejado é Fevereiro"); break;
		case 3: JOptionPane.showMessageDialog(null,"O mês desejado é Março"); break;
		case 4: JOptionPane.showMessageDialog(null,"O mês desejado é Abril"); break;
		case 5: JOptionPane.showMessageDialog(null,"O mês desejado é Maio"); break;
		case 6: JOptionPane.showMessageDialog(null,"O mês desejado é Junho"); break;
		case 7: JOptionPane.showMessageDialog(null,"O mês desejado é Julho"); break;
		case 8: JOptionPane.showMessageDialog(null,"O mês desejado é Agosto"); break;
		case 9: JOptionPane.showMessageDialog(null,"O mês desejado é Setembro"); break;
		case 10: JOptionPane.showMessageDialog(null,"O mês desejado é Outubro"); break;
		case 11: JOptionPane.showMessageDialog(null,"O mês desejado é Novembro"); break;
		case 12: JOptionPane.showMessageDialog(null,"O mês desejado é Dezembro"); break;
		default: JOptionPane.showMessageDialog(null,"Não é um mês Válido!"); break;
		
	}
	}
}
