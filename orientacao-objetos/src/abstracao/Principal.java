package abstracao;

public class Principal {

    public static void main(String[] args) {

        Funcionario joao = new Funcionario("São Sebastião","Cruzeiro","110","SP","12345222","João","12212212221","Aprendiz");
        Cliente maria = new Cliente("Alameda Flor do Ipe","Cruzeiro","SP","13343354465","Maria","55544466678");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(maria);
        maria.mostrarEndereco();


    }


}
