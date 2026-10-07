package testeadivinha;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    
    public void iniciarJogo() {
        Random aleatorio = new Random();
        int numsecreto = aleatorio.nextInt(21);
        Scanner ler = new Scanner(System.in);
        
        boolean acertou = false;
        
        System.out.println("Tente adivinhar o numero entre 0 e 20!");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = ler.nextInt();
            
            if (palpite == numsecreto) {
                System.out.println("Parabens! Voce acertou o numero.");
                acertou = true; 
            } else if (palpite > numsecreto) {
                System.out.println("O numero secreto e menor!");
            } else {
                System.out.println("O numero secreto e maior!");
            }
        }
    }
}