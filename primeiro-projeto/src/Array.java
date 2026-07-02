public class Array {

    public static void main(String[] args) {
        // Declaração de Array
        int[] numeros = {10,20,30,50,1};
        String[] frutas;

        //inicializar
        frutas = new String[]{"maça","morango","banana"};

        //inicializando indicando as posições
        double[] salarios = new double[5];
        salarios[0] = 100.0;
        salarios[1] = 220.0;
        salarios[4] = 570.0;
        salarios[3] = 7.0;
        salarios[2] = 10.0;

        //iteração
        for (int posicao = 0;posicao < salarios.length;posicao++){
            System.out.println("Salario " + posicao + ": R$"+salarios[posicao]);
        }

        //for each
        for(double salario: salarios){
            System.out.println(salario);
        }

        //alterando o valor da posição 2 do array
        salarios[2] = 25.0;
        System.out.println(salarios[2]);




    }


}


