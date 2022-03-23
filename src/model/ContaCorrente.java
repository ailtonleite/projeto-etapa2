package model;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, double saldo) {
		super();
		super.numero = numero;
		super.saldo = saldo;
	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor < getSaldo()) {
			return super.sacar(valor);
		}
		return false;
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
}
