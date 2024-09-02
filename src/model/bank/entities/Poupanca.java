package model.bank.entities;

public class Poupanca extends Conta {
	
	private int digito;
	
	public Poupanca(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
		
	}

	public int getDigito() {
		return digito;
	}
	
	
	@Override
	public void sacar(double valor) {		
		super.sacar(valor - 5) ;
	}


}
