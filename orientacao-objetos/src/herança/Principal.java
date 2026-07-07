package herança;

//A diferença entre herança (extends) de interface (implements) é que a interface pode ser feita várias na mesma classe
//E obrigatóriamente você precisa utilizar todos os métodos, enquanto a herança é única e não tem a necessidade de utilizar
//Todos os métodos.

public class Principal {

    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Biscoitos Scooby");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha chica = new Galinha();
        chica.ciscar();
        chica.beberAgua();
        chica.comer("Titica");
        chica.dormir();


    }


}
