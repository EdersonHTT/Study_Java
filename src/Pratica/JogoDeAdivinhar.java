package Pratica;

import java.util.Scanner;

public class JogoDeAdivinhar {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int nuAleatorio = (int) ((Math.random()*100) +1);
        System.out.println("iniciar");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Adivinhe um número de 1 a 100:\n");

            if (i > 1 && i < 5) {
                System.out.println("\nTentativa: " + i + "\n");

            } else if (i == 5){
                System.out.println("\nÚltima Tentativa!\n");

            }

            int nu = entrada.nextInt();

            if (nu == nuAleatorio) {
                System.out.println("Acertou!!");
                Thread.sleep(1000);
                break;

            } else if (nu < nuAleatorio){
                System.out.println("O número é maior!");
                Thread.sleep(1000);

            } else if (nu > nuAleatorio){
                System.out.println("O número é menor!");
                Thread.sleep(1000);

            }

            if (i == 5) {
                System.out.println("Acabou as tentativas!");
                Thread.sleep(1000);

            }
        }
    }
}
