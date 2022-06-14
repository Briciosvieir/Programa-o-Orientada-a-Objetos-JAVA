package model;

import interfaces.FuncaoCamareira;
import interfaces.FuncaoGerente;
import interfaces.FuncaoRecepcionista;

public class Gerente extends Pessoa implements FuncaoGerente, FuncaoCamareira, FuncaoRecepcionista {

	public Gerente(String name, String lastName, String cpf) {
		super(name, lastName, cpf);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void ArrumarACama() {
		System.out.println("Sei arrumar a cama");
		System.out.println();	
	}

	@Override
	public void LimparOQuarto() {
		System.out.println("Sei Limpar o Quarto");
		System.out.println();	
	}

	@Override
	public void FalarIngles() {
		System.out.println("Falo Inglês");
		System.out.println();	
	}

	@Override
	public void AssinarDocumentos() {
		System.out.println("Responsável pelas documentações");
		System.out.println();	
	}

	@Override
	public void Admissao() {
		System.out.println("Admissão de Novos funcionários");
		System.out.println();	
	}

	@Override
	public void Demissao() {
		System.out.println("Demissão funcionários");
		System.out.println();	
	}

	@Override
	public void Atendimento() {
		System.out.println("Realiza atendimento ao Cliente");
		System.out.println();
	}

    
}
