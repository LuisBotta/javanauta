import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {

    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Abacate");
        listaDeCompras.add("Detergente");
        listaDeCompras.add("Molho");

        for (String item:listaDeCompras) System.out.println(item);

        listaDeCompras.add(1,"Escova de Dentes");

        for (String item:listaDeCompras) System.out.println(item);

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        listaDeCompras.remove("Abacate");

        for (String item2:listaDeCompras) System.out.println(item2);

        boolean eVazia = listaDeCompras.isEmpty();
        System.out.println(eVazia);

        int tamanhoLista = listaDeCompras.size();
        System.out.println(tamanhoLista);

        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println(contem);


        listaDeCompras.forEach(produto -> System.out.println(produto));

        listaDeCompras.clear();
        System.out.println("A lista esta vazia ? " + listaDeCompras.isEmpty());

    }

}
