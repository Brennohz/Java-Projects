package testealuno;

public class Aluno {
    int id;
    String nome;
    String curso;
    double valor;

    public Aluno() {
    }

    public Aluno(int id, String nome, String curso, double valor) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.valor = valor;
    }

    public void imprimeDados() {
        System.out.println("--- Dados do Aluno ---");
        System.out.println("ID....: " + id);
        System.out.println("Nome..: " + nome);
        System.out.println("Curso.: " + curso);
        System.out.println("Valor.: " + valor);
        System.out.println("----------------------");
    }
}