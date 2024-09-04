package model.bank.entities;

import model.Ibanck.IConta;
import model.clients.entities.Cliente;

public abstract class Conta implements IConta {
	protected static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(double saldo, Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = saldo;
		this.cliente = cliente;
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

	protected void imprimirItensComun() {
		System.out.println("| "+cliente.getNome() + "  " + cliente.getTelefone()+" | ");
		System.out.println(String.format("Agencia: %d", getAgencia()));
		System.out.printf("Numero: %d%n", getNumero());
		System.out.printf("Saldo:R$ %.2f%n", getSaldo());
	}

}
