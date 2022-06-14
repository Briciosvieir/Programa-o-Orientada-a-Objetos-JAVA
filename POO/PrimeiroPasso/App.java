package PrimeiroPasso;
public class App {
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com java");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Fabricio");
        pessoa1.setIdade(28);
        pessoa1.sexo = "Masculino";

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.sexo);
        
        Carro carro1 = new Carro();
        
        carro1.setNomeCar("Gol bola ");
        carro1.setCor("Vermelho ");
        carro1.setAno(2009);

        System.out.println("Carro:"+carro1.getNomeCar()+"Cor:" + carro1.getCor() +"Ano:"+ carro1.getAno());
    
        // Objeto personalizados  
        Carro carro2 = new Carro("Palio", "Azul", 2013);

        System.out.println(carro2.getNomeCar()+carro2.getCor()+carro2.getAno());
    }
  
}