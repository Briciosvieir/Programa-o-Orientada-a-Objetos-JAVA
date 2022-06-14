package PrimeiroPasso;
public class Pessoa {
    private String nome;
    private Integer idade;
    public String sexo;

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
  
}
