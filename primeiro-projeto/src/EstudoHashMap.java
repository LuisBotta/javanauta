import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Maria",7.5);
        notasAlunos.put("João",8.5);
        notasAlunos.put("Matheus",6.0);

        for(String aluno : notasAlunos.keySet()){
            double nota = notasAlunos.get(aluno);
            System.out.println(aluno + " " + nota );
        }

        double nota = notasAlunos.get("João");
        System.out.println("A nota do João é: " + nota);


        for(Map.Entry<String, Double> nota1: notasAlunos.entrySet()){
            String nome = nota1.getKey();
            Double valor = nota1.getValue();
            System.out.println(nome + " " + valor);

        }

        int tamanhoHash = notasAlunos.size();

        notasAlunos.remove("Maria");



    }


}
