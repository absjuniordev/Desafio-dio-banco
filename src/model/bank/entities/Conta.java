package model.bank.entities;

import model.Ibanck.IConta;

public abstract class Conta implements IConta {
	protected static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	protected double saldo;

	public Conta(double saldo) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
