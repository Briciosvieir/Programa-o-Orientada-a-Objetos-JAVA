import model.Cliente;
import model.Recepcionista;

public class App {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Fabricio", "Vieira", "98765432188");
        System.out.println( cliente1.getName());
        
        Recepcionista recepcionista1 = new Recepcionista ("Claudia", "Andrade", "06678248621");
        recepcionista1.Atendimento();

        

    }

    
    
}
