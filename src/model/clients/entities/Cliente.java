package model.clients.entities;

public class Cliente {
	private String nome;
	private String telefone;

	public Cliente(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}
	
	

}
