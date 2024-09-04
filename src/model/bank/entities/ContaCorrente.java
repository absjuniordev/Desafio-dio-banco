package model.bank.entities;

import model.clients.entities.Cliente;
import model.exceptions.DomainExceptions;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, Cliente cliente) {
		super(saldo, cliente);

	}

	@Override
	public void sacar(double valor) throws DomainExceptions {
		if (valor > saldo) {
			throw new DomainExceptions("Saldo insuficiente");
		} else {
			saldo -= valor;
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
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	@Override
	public void imrprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		imprimirItensComun();

	}

}
