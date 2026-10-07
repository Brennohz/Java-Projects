import java.util.Scanner;
public class ExemploJava03 {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        n1 = ler.nextInt();
        System.out.println("Digite um numero inteiro: ");
        n2 = ler.nextInt();
        System.out.println("Digite um numero inteiro: ");
        n3 = ler.nextInt();
        
        if ((n1 > n2) && (n1 > n3)){
            System.out.println("O maior numero e: " + n1);
        }
        if ((n2 > n1) && (n2 > n3)){
            System.out.println("O maior numero e: " + n2);
        }
        else
        {
             System.out.println("O maior numero e: " + n3);
        }
    }
    
}
