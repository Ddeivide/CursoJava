package br.senai.sp.informatica.objeto;

import javax.swing.JOptionPane;

public class CadCliente {
	public static void main(String[] args) {
		
		Cliente novo = new Cliente();
		String temp = JOptionPane.showInputDialog("Informe o nome");
		novo.setNome(temp);

		String temp = JOptionPane.showInputDialog("Informe o e-mail");
		novo.setEmail(temp);
		
		String temp = JOptionPane.showInputDialog("Informe o nome");
		novo.setIdade(Integer.parseInt(temp));
		
		System.out.println(novo.getNome());
	}
}
