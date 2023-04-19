package UML;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Motorista m1 = new Motorista("julio", "794.654.635-15", LocalDate.of(1997, 3, 21), Genero.MASCULINO, 5000, LocalDate.of(2023, 2, 11), "45698721");
		Diretor d1 = new Diretor("Lays", "045.896.335-66", LocalDate.of(1997, 3, 24), Genero.FEMININO, 11000, LocalDate.of(2023, 12, 03), 100);
		Gerente g1 = new Gerente("Yuri", "794.653.152-99", LocalDate.of(2000, 1, 27), Genero.MASCULINO, 8000, LocalDate.of(2023, 11, 04), 50);
		
		System.out.println(m1.toString());
		System.out.println(d1.toString());
		System.out.println(g1.toString());
	
		
	}

}
