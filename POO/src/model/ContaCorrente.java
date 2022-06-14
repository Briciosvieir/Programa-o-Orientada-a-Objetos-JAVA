
package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String numeroConta, Integer digito, double saldoInicial) {
        super(numeroConta, numeroConta, digito, saldoInicial, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("************************");
        System.out.println("****Extrato Corrente****");
        System.out.println("************************");
        System.out.println();
        System.out.println("Gerado em: "+DataUtil.converterDataEHora(new Date()));
        System.out.println();
        for (move move : this.Moviments) {
           System.out.println(move); 
        }
        System.out.println();
        System.out.println("************************");
        System.out.println("************************");
    }

}
