import java.util.Scanner;

public class ExemploJava02 {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = ler.nextDouble();
        
         media = (n1 + n2) / 2;
         
         if (media >= 6) {
            System.out.println("Aprovado!!");
        }
        else
        {
            if (media < 4) {
                System.out.println("Reprovado!!!");
            }
            else
            {
                System.out.println("Recuperacao");
            }
        }
        
        System.out.println("--- Programa 02 - Ler dados ---");
        System.out.println("nota 1 = " + n1);
        System.out.println("nota 2 = " + n2);
        System.out.println("Media = " + media);
        
    }
    
}