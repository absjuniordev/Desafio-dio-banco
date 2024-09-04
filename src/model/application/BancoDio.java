package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.bank.entities.Conta;
import model.bank.entities.ContaCorrente;
import model.bank.entities.Poupanca;
import model.clients.entities.Cliente;
import model.exceptions.DomainExceptions;

public class BancoDio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Digite o telefone do cliente: ");
		String telefone = sc.nextLine();
		Cliente cliente = new Cliente(nome, telefone);

		System.out.println();
		System.out.println("Insira um deposito inicial: ");
		double saldo = sc.nextDouble();

		Conta contaCorrent = new ContaCorrente(saldo, cliente);
		Conta poupanca = new Poupanca(saldo, cliente);

		try {

			contaCorrent.imrprimirExtrato();
			poupanca.imrprimirExtrato();

			contaCorrent.transferencia(poupanca, 600);
			poupanca.imrprimirExtrato();
			contaCorrent.imrprimirExtrato();
		} catch (DomainExceptions e) {
			System.out.println("Erro: " + e.getMessage());

		}
		sc.close();

	}

}
