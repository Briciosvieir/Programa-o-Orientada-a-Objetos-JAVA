package PrimeiroPasso;
public class Carro {
    //#region Atributos
    private String nomeCar;
    private String cor;
    private Integer ano;
    //#endregion
    
    //#region contrutor
    public Carro(){} //padrão


    //personalizado
    public Carro(String nomeCar, String cor, Integer ano){
        this.nomeCar=nomeCar;
        this.cor=cor;
        this.ano=ano;

    }
    //#endregion

    //#region settres
    public void setNomeCar(String nome){
        this.nomeCar = nome;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    //#endregion
    
    //#region Gettres
    public String getNomeCar(){
        return nomeCar;
    }
    
    public String getCor(){
        return cor;
    }

    public int getAno(){
        return ano;
    }
    //#endregion
}
