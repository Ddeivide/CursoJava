package br.senai.sp.informatica.objeto;

//import lombok.Data;

//@Data
public class Cliente {
	private String nome;
	private String email;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "nome: " + nome + " email: " + email + " idade: " + idade;
	}

	
	
}
