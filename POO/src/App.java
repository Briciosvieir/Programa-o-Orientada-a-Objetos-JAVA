package src;

import src.model.ContaCorrente;
import src.model.move;
import src.utils.DataUtil;

public class App {

    public static void main(String[] args) {
        System.out.println("Criando um Banco Digital");
        System.out.println();


      ContaCorrente conta1 = new ContaCorrente("15999", "512342", 1, 140);
        
        System.out.println(conta1.getSaldo());
        conta1.depositar(150);
        System.out.println();
        System.out.println(conta1.getSaldo());
        conta1.sacar(155.10);
        System.out.println(conta1.getSaldo());
    
        
        ContaCorrente conta2 = new ContaCorrente("14993", "621112", 3, 100.0);
        conta2.transferir(15.0, conta1);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        var data=DataUtil.converterDataEHora(conta2.getDataAbertura());
        System.out.println(data);

        System.out.println();

        move move =new move("Saque", 100.0);
        System.out.println(move);

        conta1.imprimirExtrato();
    }


    
}
