package excecao.naoverificada;

import java.util.Scanner;

public class VerificaCPF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu CPF: ");
        String verificaCPF = verificarCPF(scanner.nextLine());
        System.out.println(verificaCPF);


    }

    public static String verificarCPF(String cpf) {
        try {
            if (cpf.equals("0001234500045")) {
                throw new RuntimeException("CPF já cadastrado" + cpf);
            } else {
                return "CPF válido, usuário cadastrado";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF já cadastrado " + cpf);
        }
    }


}
