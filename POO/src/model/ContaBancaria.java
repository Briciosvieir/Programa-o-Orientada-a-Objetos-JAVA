package src.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    //#region atributos
    private String agencia;
    private String numeroConta;
    private Integer digito;
    private Double saldo;
    private double VALOR_MINIMO_DEPOSITO = 10.0;
    private Date DataAbertura;
    protected ArrayList<move>Moviments;


//#endregion

    //#region construtor
    public ContaBancaria(String agencia, String numeroConta, Integer digito, Double saldo, double vALOR_MINIMO_DEPOSITO) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.digito = digito;
        this.saldo = saldo;
        this.DataAbertura = new Date();
        this.Moviments = new ArrayList<move>();     //arraylist vai ser todo representado no construtor
        
        //criando a primeira movimentação que é abertura de conta
        move movimentacao = new move("Conta Abertura", this.getSaldo());      
        this.Moviments.add(movimentacao); //adicionando a movimentação no array
    }
    //#endregion

    //#region Settres
    public void setAgencia(String agencia){
        this.agencia=agencia;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta=numeroConta;
    }
    public void setDigito(Integer digito){
        this.digito=digito;
    }
   
    //#endregion

    //#region Gettres
    public String getAgencia(){
        return agencia;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public Integer getDigito(){
        return digito;
    }
    public double getSaldo(){
        return saldo;
        
    }
    public Date getDataAbertura() {
        return DataAbertura;
    }
    //#endregion


    //#region Metodos 
    public void depositar(double valor){
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("Depósito apenas no valor a partir de R$:"+VALOR_MINIMO_DEPOSITO);
            
        }
        this.saldo += valor;
        move movimentacao = new move("Depositar", valor);
        this.Moviments.add(movimentacao);
        
    }
    //no lugar do Void eu vou colocar double mas tem que retornar para amostrar o valor final
    public double sacar(double valor){
        if (this.saldo < valor) {
            throw new InputMismatchException("Valor Insuficiente");   
        }
        this.saldo -= valor;
        move movimentacao = new move("Retirada de valor", valor);
        this.Moviments.add(movimentacao);

        //retorna o valor sacado por causa do double depois do public
        return valor;
    }

    public void transferir(double valor, ContaBancaria contaDestino){

        //efetua um saque na conta atual.
        this.sacar(valor);

        //deposita o na contaDestino.
        contaDestino.depositar(valor);

    }

    //#endregion

    public abstract void imprimirExtrato();


}
