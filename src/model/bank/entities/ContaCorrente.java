package model.bank.entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);

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
