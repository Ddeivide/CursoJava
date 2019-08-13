package br.senai.sp.informatica.objeto;

import javax.swing.JOptionPane;

public class MediaAluno {

	public static void main(String[] args) {
		
		String n1, n2;
		double nota1, nota2, media;
		

		//Recebe a string nota
		n1 = JOptionPane.showInputDialog("Digite a p1");
		//converte a String em double
		nota1 = Double.parseDouble(n1);
		
		n2 = JOptionPane.showInputDialog("Digite a p2");
		nota2 = Double.parseDouble(n2);
		
		media = (nota1+nota2)/2;
		
		if (media<=60)
		{
		JOptionPane.showMessageDialog
		(null,"A média do aluno é Insuficiente \nNota Final: " + media,
		"Média Aluno",
		JOptionPane.INFORMATION_MESSAGE);
		}
		else if (media<=80)
		{
		JOptionPane.showMessageDialog
		(null,"A média do aluno é Satisfatória \nNota Final: " + media,
		"Média Aluno",
		JOptionPane.INFORMATION_MESSAGE);
		}
		else if (media<=90)
		{
		JOptionPane.showMessageDialog
		(null,"A média do aluno é Boa \nNota Final: " + media,
		"Média Aluno",
		JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
		JOptionPane.showMessageDialog
		(null,"A média do aluno é Excelente \nNota Final: " + media,
		"Média Aluno",
		JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}

	

}