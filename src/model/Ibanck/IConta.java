package model.Ibanck;

import model.bank.entities.Conta;
import model.exceptions.DomainExceptions;

public interface IConta {

	 void sacar(double valor) throws DomainExceptions;

	 void depositar(double valor);

	 void transferencia(Conta contaDestino , double valor) throws DomainExceptions;
	
	 void imrprimirExtrato();

}
