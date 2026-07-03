public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi construída, as características são:");
        System.out.println("Metragem: " + metragem);
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Número de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }
    public void pintar() {
        System.out.println("A casa foi pintada de: " + cor);
    }

}
