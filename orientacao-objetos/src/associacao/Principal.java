package associacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Carro gol = new Carro(1800);

        gol.mostrarCilindradas();

        Funcionarios joao = new Funcionarios("João");
        Funcionarios maria = new Funcionarios("Maria");
        Funcionarios jorge = new Funcionarios("Jorge");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(jorge);
        listaDeFuncionarios.add(maria);

        Departamento ti = new Departamento("TI",listaDeFuncionarios);

        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());

        marketing.mostrarFuncionarios();



    }


}
