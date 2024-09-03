package model.bank.entities;

public class Poupanca extends Conta {

	private int digito;

	public Poupanca( double saldo) {
		super( saldo);

	}

	public int getDigito() {
		return digito;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor -5;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor ;
		
	}

	@Override
	public void transferencia(Conta contaDestino, double valor) {
	
		
	}

	

}
