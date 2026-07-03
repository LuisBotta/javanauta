import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {

    public static void main(String[] args) {
        TreeMap<String,Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice",9.9);
        notasAlunos.put("Matheus",8.5);
        notasAlunos.put("Maria",5.4);

        for(String aluno : notasAlunos.keySet()){
            double nota = notasAlunos.get(aluno);
            System.out.println(aluno + " " + nota );
        }

        double nota = notasAlunos.get("Maria");
        System.out.println("A nota da Maria é: " + nota);


        for(Map.Entry<String, Double> nota1: notasAlunos.entrySet()){
            String nome = nota1.getKey();
            Double valor = nota1.getValue();
            System.out.println(nome + " " + valor);

        }

        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Última chave: " + notasAlunos.lastKey());



    }

}
