package model.bank.entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo) {
		super(saldo);

	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;

	}

	@Override
	public void transferencia(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub

	}

}
