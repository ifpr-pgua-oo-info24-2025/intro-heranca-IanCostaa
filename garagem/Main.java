package garagem;

public class Main {
    public static void main(String[] args) {

        Moto moto1 = new Moto("Cafe racer ", "Honda ", "CG Start 16 ", 2002);
        Carro carro1 = new Carro(3, "Hyundai ", "Veloster ", 2012);
        
        
        System.out.println("== Detalhes do Carro ==");
        System.out.println(carro1.exibirDetalhes());

        System.out.println("\n== Detalhes da Moto ==");
        System.out.println(moto1.exibirDetalhes());
    }
}
