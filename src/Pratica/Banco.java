package Pratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> historico = new ArrayList<>();

    static double depositar (double saldo) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            System.out.println();

        }

        System.out.println(" - Digite um valor para depositar:");
        double deposito = entrada.nextInt();
        String fixa = """
            ===============================
            ---> Ação Feita: Deposito
            
             - %2fR$ Depositados
            
            ===============================
            """.formatted(deposito);

        if (deposito <= saldo) {
            historico.add(fixa);

            for (int i = 0; i < 50; i++) {
                System.out.println();

            }

            System.out.println(fixa);
            Thread.sleep(3000);
            return deposito;
        }

        return -1;
    }

    static double retirar (double saldo) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            System.out.println();

        }

        System.out.println(" - Digite um valor para ser Retirado:");
        double retirada = entrada.nextInt();
        String fixa = """
                    ===============================
                    ---> Ação Feita: Retirada
                    
                     - %2fR$ Retirados
                    
                    ===============================
                    """.formatted(retirada);

        if (retirada <= saldo) {
            historico.add(fixa);


            for (int i = 0; i < 50; i++) {
                System.out.println();

            }

            System.out.println(fixa);
            Thread.sleep(3000);
            return retirada;
        }

        return -1;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Diga seu saldo: ");

        double saldo = entrada.nextDouble();
        boolean continua = true;

        while(continua){

            for (int i = 0; i < 50; i++) {
                System.out.println();

            }

            System.out.println(
                    """
                    =============> Banco Digital <=============
                    
                    Saldo: %2f
                    
                    [1] - Depositar
                    [2] - Retirar
                    [3] - Histórico
                    [4] - Depositar
                    
                    \n""".formatted(saldo)
            );

            System.out.println(" - Ação:");
            switch (entrada.nextInt()) {
                case 1:
                    saldo += depositar(saldo);
                    break;
                case 2:
                    double retirada = retirar(saldo);

                    if (retirada != -1) {
                        saldo -= retirada;
                    } else {
                        for (int i = 0; i < 50; i++) {
                            System.out.println();

                        }

                        System.out.println(" - Saldo Insuficiente");

                        Thread.sleep(3000);
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50; i++) {
                        System.out.println();

                    }

                    historico.forEach(System.out::println);
                    Thread.sleep(3000);
                    break;
                case 4:
                    for (int i = 0; i < 50; i++) {
                        System.out.println();

                    }

                    System.out.println(" - Saindo...");
                    Thread.sleep(3000);
                    continua = false;
                    break;
                default:
                    for (int i = 0; i < 50; i++) {
                        System.out.println();

                    }

                    System.out.println(" - Escolha invalida");
                    Thread.sleep(3000);
            }
        }
    }

}
