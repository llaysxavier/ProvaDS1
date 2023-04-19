package UML;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca {
	
	private final double PREMIO = 0.2; 

	
	public Diretor(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao, Bonificacao bonificaco) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao, bonificaco);

	}

	public double getPREMIO() {
		return PREMIO;
	}

	public double getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + (salarioBase * Bonificacao.DIRETOR.valor) + (salarioBase * PREMIO);
		return salarioFinal;
	}

	
	@Override
	public String toString() {
		return  "\nDiretor" + 
				"\nNome = " + super.nome + 
				"\nCpf = " + super.cpf + 
				"\nGenero = " + super.genero.valor + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + Util.FormatarMoeda(getSalarioFinal(salarioBase));

	}
	
}
