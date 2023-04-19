package UML;

import java.time.LocalDate;

public class Motorista extends Funcionario {
	
	private String carteiraDeHabilitacao;

	public Motorista(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao, String carteiraDeHabilitacao) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	public String getCarteiraDeHabilitacao() {
		return carteiraDeHabilitacao;
	}

	public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	public double getSalarioFinal () {
		
		return salarioBase;
	}

	public String toString() {
		return "\nMotorista = " + 
				"\ncarteiraDeHabilitacao" + this.carteiraDeHabilitacao +
		"\nNome = " + super.nome +
		"\nCpf = " + super.cpf + 
		"\nGenero =" + super.genero.texto +
		"\nSalario Base = " + Util.FormatarMoeda(getSalarioBase()) + 
		"\nData de Admissão = " + Util.FormatarData(getDataAdmissao()) + 
		"\nSalario Final = " + Util.FormatarMoeda(getSalarioFinal(salarioBase));
				
    }
	
}
