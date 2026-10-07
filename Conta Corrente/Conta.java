package contacorrente;
import java.util.Scanner;
public class Conta {
   
    String nome;
    float saldo;
    float limite;
    char tipo;
    
    // Construtor completo
    public Conta(String n, float s, float l, char t) {
        nome = n;
        saldo = s;
        limite = l;
        tipo = t;
    }
    // Construtor sem limite
    public Conta(String n, float s, char t) {
        nome = n;
        saldo = s;
        limite = 0;
        tipo = t;
    }
    // Construtor vazio
    public Conta() {}
    // Cadastra os dados
    public void cadastraDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = entrada.nextLine();

        System.out.print("Saldo: ");
        saldo = entrada.nextFloat();

        System.out.print("Limite: ");
        limite = entrada.nextFloat();

        System.out.print("Tipo: ");
        tipo = entrada.next().charAt(0);
    }
    // Imprime os dados
    public String imprimeDados() {
        return "Nome: " + nome
                + "\nSaldo: R$ " + saldo
                + "\nLimite: R$ " + limite
                + "\nTipo: " + tipo;
    }
    // Deposita
    public void depositar(float valor) {
        saldo = saldo + valor;
    }
    // Saca
    public void sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}