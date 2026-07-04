import etapaConstrucao.PlantaCasa;

public class Casa {

    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variáveis) da casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        //Chamando os métodos
        casa.construir();
        casa.pintar();
        casa.somarMetragem();

        casa.mudarCorParede("Azul");

        casa.alterarCaracteristicas(100,4,2,"Madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 2;
        casaVizinho.material = "Lajota";
        casaVizinho.metragem = 20;
        casaVizinho.cor = "Verde";

        casaVizinho.construir();
        casaVizinho.pintar();


    }

}
