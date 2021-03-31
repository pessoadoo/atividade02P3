package br.cesed.si.p3.exercicio02;

import javax.swing.JOptionPane;

public class ContaCorrenteMain {
	
	public static void main(String[] args) throws SaldoInsuficienteExcecao {
		
		ContaCorrente novaConta = new ContaCorrente(1000,1,2000);
		
		
		try {
			novaConta.sacar(-2);
		} catch (IllegalArgumentException e1) {
			JOptionPane.showInternalMessageDialog(null,"Por gentileza coloque valores positivos e maiores que zero!");
		}
		
		
		try {
			novaConta.sacar(100);
		} catch (SaldoInsuficienteExcecao e) {
			JOptionPane.showInternalMessageDialog(null, "Liso que dói na vista");
		}
		
		try {
			novaConta.depositar(-50);
		} catch (BoteDinheiroException e) {
			JOptionPane.showInternalMessageDialog(null, "Você deve ta de onda, só pode...");
		}
		
		try {
			novaConta.setValorLimite(-1000);
		} catch (NoLimitException e) {
			JOptionPane.showInternalMessageDialog(null, "Teu limite já não é bom, quer piorar mais é?");
		}
	}

}
