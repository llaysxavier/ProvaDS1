package UML;

import java.time.LocalDate;

public  abstract class CargoDeConfianca extends Funcionario {
	
	Bonificacao bonificaco;

	public CargoDeConfianca(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao, Bonificacao bonificaco) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
		this.bonificaco = bonificaco;
	}

	public Bonificacao getBonificaco() {
		return bonificaco;
	}

	public void setBonificaco(Bonificacao bonificaco) {
		this.bonificaco = bonificaco;
	}
	
}
