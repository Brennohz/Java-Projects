public class ExemploJava01 {
    
    public static void main(String[] args) {
        float n1, n2;
        double media;
        n1 = 5;
        n2 = 5;
        
        media = (n1 + n2) / 2;
        
        System.out.println("Media = " + media);
        
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
    }
    
}
