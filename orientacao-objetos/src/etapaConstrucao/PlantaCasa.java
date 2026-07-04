//Public - Disponível em qualquer lugar;
//Private - Disponível apenas dentro da classe;
//Protected - Disponível dentro da pasta;
package etapaConstrucao;

public class PlantaCasa {
    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

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

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();

    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = mat;
        construir();

    }



}
