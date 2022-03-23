package model;

public abstract class Conta {
	protected int numero;
	protected double saldo;
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Numero: "+numero+"\nSaldo: R$"+saldo;
	}
	
	public void depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}
}
