package testaproduto;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaProduto {
    private ArrayList<Produto> listaProdutos;
    private Scanner ler;

    public GerenciaProduto() {
        this.listaProdutos = new ArrayList<>();
        this.ler = new Scanner(System.in);
    }

public void executar() {
        int opcao = 0;
        
        do {
            exibirMenu();
            
            opcao = ler.nextInt();
            ler.nextLine();
            
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    private void exibirMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produto");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opcao: ");
    }
    
    private void cadastrarProduto() {
        System.out.print("Digite a marca do produto: ");
        String marca = ler.nextLine();
        
        System.out.print("Digite o fabricante: ");
        String fabricante = ler.nextLine();
        
        System.out.print("Digite o codigo de barras: ");
        String codBarras = ler.nextLine();
        
        System.out.print("Digite o preco: ");
        float preco = ler.nextFloat();
        ler.nextLine();

        if (listaProdutos.size() % 2 == 0) {
            Produto p1 = new Produto();
            p1.definirMarca(marca);
            p1.definirFabricante(fabricante);
            p1.definirCodBarras(codBarras);
            p1.definirPreco(preco);
            
            listaProdutos.add(p1);
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            Produto p2 = new Produto(marca, fabricante, codBarras, preco);
            
            listaProdutos.add(p2);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }

    private void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado no momento.");
        } else {
            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.print("Produto " + (i + 1) + ": ");
                listaProdutos.get(i).exibirDados();
            }
        }
    }
}