package model.Ibanck;

import model.bank.entities.Conta;

public interface IConta {

	public void sacar(double valor);

	public void depositar(double valor);

	public void transferencia(Conta contaDestino , double valor);

}
