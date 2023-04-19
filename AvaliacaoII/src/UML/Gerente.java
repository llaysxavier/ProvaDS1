package UML;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

	public Gerente(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao, Bonificacao bonificaco) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao, bonificaco);
	}

	public double getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + (salarioBase * Bonificacao.GERENTE.valor);
		return salarioFinal;
	}

	@Override
	public String toString() {
		return  "\nGerente" + 
				"\nNome = " + super.nome + 
				"\nCpf = " + super.cpf + 
				"\nGenero = " + super.genero.texto + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + Util.FormatarMoeda(getSalarioFinal(salarioBase));

	}
	
}