package model.bank.entities;

import model.Ibanck.IConta;

public abstract class Conta implements IConta {
	private int agencia;
	private int numero;
	protected double saldo;

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
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
