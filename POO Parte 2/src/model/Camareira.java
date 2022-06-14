package model;

import interfaces.FuncaoCamareira;

public class Camareira extends Pessoa implements FuncaoCamareira {

	public Camareira(String name, String lastName, String cpf) {
		super(name, lastName, cpf);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void ArrumarACama() {
		System.out.println("Cama arrumada");
		System.out.println();
		
	}

	@Override
	public void LimparOQuarto() {
		System.out.println("Quarto Limpo");
		System.out.println();
		
	}
    
}
