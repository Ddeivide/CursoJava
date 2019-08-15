package exercicios1;

import java.util.Arrays;

import java.util.Collections;

import javax.swing.JOptionPane;

public class SequenciaDescrescente {

	public static void main(String[] args) {
		String primeiro = "";
		String segundo ="";
		String chave = "";
		int[] numero = new int [5];
		
		
		
		
		
		
		for (int i = 0; i <numero.length; i++) {
		primeiro=
		
		JOptionPane.showInputDialog
		(null,"Digite um numero","Primeiro Numero",
		JOptionPane.QUESTION_MESSAGE);
		numero[i] = Integer.parseInt(primeiro);
		
		segundo += primeiro+" ";
		

		}
		Arrays.sort( numero );
		
		for(int i=0; i<numero.length; i++) {
			chave+=numero[i]+" ";
		}
		
		JOptionPane.showMessageDialog(null, chave
		,"resultado",
		JOptionPane.INFORMATION_MESSAGE);
		

		
		
		
		System.exit(0);
	}
}