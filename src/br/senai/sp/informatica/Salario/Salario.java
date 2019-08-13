package br.senai.sp.informatica.objeto;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		   
		   String NumDep, SalHor, HorTrab;
		   int Dependentes;
		   float SH, HT, dIR, SalBase;
		   double dINSS, SalLiq;
		 
		   NumDep=
		   JOptionPane.showInputDialog 
		   (null,"Digite número de dependentes","Número de Dependentes",
		   JOptionPane.QUESTION_MESSAGE);
		 
		   Dependentes = Integer.parseInt(NumDep);
		 
		   SalHor=
		   JOptionPane.showInputDialog 
		   (null,"Digite salário hora","Salário Hora",
		   JOptionPane.QUESTION_MESSAGE);
		 
		   SH = Float.parseFloat(SalHor);
		 
		   HorTrab=
		   JOptionPane.showInputDialog 
		   (null,"Digite número de horas trabalhadas","Número de Horas Trabalhadas",
		   JOptionPane.QUESTION_MESSAGE);
		    
		   HT = Float.parseFloat(HorTrab);
		 
		   SalBase = HT * SH + (50 * Dependentes);
		 
		 
		   if (SalBase <= 1000)
		    
		   dINSS = SalBase * 8.5 / 100;
		 
		   else
		    
		   dINSS = SalBase * 9 / 100;
		 
		 
		   if (SalBase <= 500)
		 
		   dIR = 0;
		      
		      if (SalBase > 500 && SalBase <= 1000)
		 
		      dIR = SalBase * 5 / 100;
		 
		      else
		       
		      dIR = SalBase * 7 / 100;
		 
		   SalLiq = SalBase - dINSS - dIR;

		   
		   {JOptionPane.showMessageDialog (
		   null, "Salátio Hora R$" + SalHor
		   + "\nNº de Horas: " + HT
		   + "\nNº de Dependentes: " + Dependentes
		   + "\nSalário Bruto R$ " + SalBase 
		   + "\nDesconto do IR R$ " + dIR 
		   + "\nDesconto do INSS R$ " + dINSS 
		   + "\nSalário Líquido R$ " + SalLiq ,
		   "Folha de Pagamento",
		   JOptionPane.INFORMATION_MESSAGE ); 
		   System.exit( 0 );}
		}
	}

