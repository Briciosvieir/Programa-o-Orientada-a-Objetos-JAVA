package model;

import interfaces.FuncaoRecepcionista;

public class Recepcionista extends Pessoa implements FuncaoRecepcionista {

	public Recepcionista(String name, String lastName, String cpf) {
		super(name, lastName, cpf);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void Atendimento() {
		System.out.println("Atendimento ao Cliente");
		System.out.println();
		
	}
    
}
