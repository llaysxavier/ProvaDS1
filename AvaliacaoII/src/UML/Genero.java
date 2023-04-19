package UML;

public enum Genero {
	
	MASCULINO('M', "Masculino"),
	FEMININO ('F', "Feminino");
	
	protected char valor;
	protected String texto;

	private Genero(char valor, String texto) {
		this.valor = valor;
		this.texto = texto;
	}

	public char getValor() {
		return valor;
	}
		
	public String getTexto() {
		return texto;
	}

}