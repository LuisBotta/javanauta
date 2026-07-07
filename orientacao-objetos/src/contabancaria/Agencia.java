package contabancaria;

public class Agencia {

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Luis",5000.0);

        System.out.println("O titular da conta é " + minhaConta.getTitular() + " e o saldo final é " + minhaConta.getSaldo());

        minhaConta.setTitular("Luis Felipe");
        minhaConta.setSaldo(minhaConta.getSaldo() + 100.0);

        String titualConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é " + titualConta + " e o saldo final é " + saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Maria");

        System.out.println("O titular da conta é " + contaMinhaMae.getTitular() + " e o saldo final é " + contaMinhaMae.getSaldo());

    }





}
