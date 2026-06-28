public class TrabalhandoComStrings {

    public static void main(String[] args) {

        String nome = "Luis";
        String nome2 = "Felipe";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nome2);

        System.out.println("Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguais);


    }
}
