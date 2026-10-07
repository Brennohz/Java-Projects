package testealuno;

import java.util.Scanner;

public class GerenciaAluno {

    private int posicao = 0;
    private int tamanho = 5;
    private Aluno[] alunos = new Aluno[tamanho];
    private Scanner ler = new Scanner(System.in);

    public void executar() {
        int opcao;
        
        do {
            imprimeMenu();
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    contarCurso();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("ERRO: Opcao invalida!!!");
            }

        } while (opcao != 4);
    }

    public void contarCurso() {
        System.out.println("Digite o nome do curso:");
        ler.nextLine();
        String curso = ler.nextLine();
        
        int qtde = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].curso.equalsIgnoreCase(curso)) {
                qtde = qtde + 1;
            }
        }
        System.out.println("Qtde de alunos no curso " + curso + " = " + qtde);
    }

    public void listarAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                alunos[i].imprimeDados();
            }
        }
    }

    public void cadastrarAluno() {
        System.out.println("--- Cadastro ---");
        
        if (posicao < tamanho) {
            System.out.println("ID: ");
            int id = ler.nextInt();
            ler.nextLine();
            
            System.out.println("Nome: ");
            String nome = ler.nextLine();
            
            System.out.println("Curso: ");
            String curso = ler.nextLine();
            
            System.out.println("Valor: ");
            double valor = ler.nextDouble();

            alunos[posicao] = new Aluno(id, nome, curso, valor);
            posicao = posicao + 1;
            
            if (posicao == tamanho) {
                System.out.println("Chegou no limite !!!!");
            }
        } else {
            System.out.println("ERRO: Limite de " + tamanho + " alunos");
        }
    }

    public void imprimeMenu() {
        System.out.println("--- Menu Principal ---");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Contar quantos alunos de um determinado curso");
        System.out.println("4 - Sair ");
        System.out.println("-----------------------");
        System.out.println("Digite a Opcao: ");
    }
}