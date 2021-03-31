package br.cesed.si.p3.exercicio02;

public class ContaCorrente {
	
	private float limite;
	
	private float saldo;
	
	private float valorLimite;
	
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getValorLimite() {
		return valorLimite;
	}
	
	public void setValorLimite(float valorLimite) throws NoLimitException {
		
		if(valorLimite <= 0) {
			throw new NoLimitException();
		} else {
			this.valorLimite = valorLimite;
		}
	}
	
	public ContaCorrente(float limite, float saldo, float valorLimite) {
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}
	
	public void sacar(float valor) throws IllegalArgumentException, SaldoInsuficienteExcecao{
		
		if(valor < 1) {
			throw new IllegalArgumentException();
		} if (saldo < valor) {
			System.out.println("Saldo: R$" +saldo);
			throw new SaldoInsuficienteExcecao();
		} else {
			saldo -= valor;
		}
			
		
	}

	public void depositar(float valor) throws BoteDinheiroException {
		
		if(valor <= 0) {
			throw new BoteDinheiroException();
		} else {
			saldo += valor;
		}
	}
	
	
	
}

