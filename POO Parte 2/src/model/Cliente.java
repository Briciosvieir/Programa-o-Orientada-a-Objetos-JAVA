package model;

public class Cliente extends Pessoa {

    private String passaporte;
    private String telefone;

	public Cliente(String name, String lastName, String cpf) {
		super(name, lastName, cpf);
		//TODO Auto-generated constructor stub
	}

    public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
    public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
}
