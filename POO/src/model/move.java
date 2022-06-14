package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class move {

    private String descricao;
    private Date data;
    private double valor;
    
    public move(String descricao, double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        String formatando = DataUtil.converterDataEHora(this.getData());
        return this.getDescricao()+" \n"+formatando+" - R$: "+this.getValor();
    }
    
}
