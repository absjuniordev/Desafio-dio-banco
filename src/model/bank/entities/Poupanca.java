package model.bank.entities;

import model.clients.entities.Cliente;
import model.exceptions.DomainExceptions;

public class Poupanca extends Conta {

	public Poupanca(double saldo, Cliente cliente) {
		super(saldo, cliente);
		
	}

	private int digito;

	

	public int getDigito() {
		return digito;
	}

	@Override
	public void sacar(double valor) throws DomainExceptions {
		if (valor > saldo) {
			throw new DomainExceptions("Saldo insuficiente");
		}else {			
			saldo -= valor - 5;
		}

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferencia(Conta contaDestino, double valor) throws DomainExceptions {
		if (valor > saldo) {
			throw new DomainExceptions("Saldo insuficiente");
		}else {	
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	@Override
	public void imrprimirExtrato() {
		System.out.println("=== Extrato Poupança ===");
		imprimirItensComun();

	}

}
