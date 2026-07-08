package polimorfismo;

public class Principal {

    public static void main(String[] args) {

        int sabaoPo = 29;
        int mamao = 7;
        double sabonete = 2.5;
        double arroz = 15.4;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 10;

        int total = Calculadora.somar(sabaoPo,mamao);
        double totalDouble = Calculadora.somar(sabonete,arroz);
        Integer totalInteger = Calculadora.somar(batata,cenoura,melancia);

        System.out.println(total);
        System.out.println(totalDouble);
        System.out.println(totalInteger);


        Carro gol = new Carro();

        gol.mover();


    }

}
