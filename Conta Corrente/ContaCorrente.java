package contacorrente;
public class ContaCorrente {

    public static void main(String[] args) {

        //construtor completo
        Conta conta1 = new Conta("Murilo", 100.0f, 500.0f, 'C');

        // Segundo construtor
        Conta conta2 = new Conta("Pedro", 500.0f, 'B');

        System.out.println("===== CONTA 1 =====");
        System.out.println(conta1.imprimeDados());

        System.out.println("\n===== CONTA 2 =====");
        System.out.println(conta2.imprimeDados());

        // Depósito na conta1
        System.out.println("\n===== DEPOSITO =====");
        conta1.depositar(300.0f);

        System.out.println(conta1.imprimeDados());

        // Saque na conta1
        System.out.println("\n===== SAQUE =====");
        conta1.sacar(2000.0f);

        System.out.println(conta1.imprimeDados());

        //construtor vazio
        System.out.println("\n===== CADASTRO =====");

        Conta conta3 = new Conta();

        conta3.cadastraDados();

        System.out.println("\n===== DADOS CADASTRADOS =====");
        System.out.println(conta3.imprimeDados());
    }
}