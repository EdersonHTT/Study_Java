package Orientação_a_Obijetos.Loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");

        System.out.println();
        System.out.println();

        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int nu: numeros){
            soma += nu;
        }
        System.out.println("A soma total das receitas é: "+ soma);

        System.out.println();
        System.out.println();

        int somaPares = 0;

        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                somaPares += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + somaPares);

        int nuFatorar = 5;

        for (int i = 4; i > 0; i--) {
            nuFatorar *= i;
        }
        System.out.println("O fatorial de 5 é: " + nuFatorar);

        System.out.println();
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]){
                    int nu = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = nu;
                }
            }
        }

        System.out.println("O maior número é: " + numeros[0]);

        Scanner ler = new Scanner(System.in);

//        for (int i = 1; i <= 3; i++) {
//            System.out.println();
//            System.out.println();
//            System.out.println("Senha:");
//            int senha = ler.nextInt();
//
//            if (senha == 1234) {
//                System.out.println("Bem vindo!");
//                break;
//            } else {
//                System.out.println("Senha incorreta\nVocê tem "+(3-i)+" tentativa restante.");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//
//        while (true) {
//            System.out.println();
//            System.out.println("Nome para cadastro:");
//            String nome = ler.nextLine();
//
//            if (nome.length() >= 3) {
//                System.out.println("Cadastrado como: " + nome);
//                break;
//            } else {
//                System.out.println("Nome invalido");
//            }
//        }

//        int negativos = 0;
//        int positivos = 0;
//
//        while (true) {
//            System.out.println();
//            System.out.println("Um numero:");
//            int nu = ler.nextInt();
//
//            if (nu == 0) {
//                System.out.println("Fim");
//                break;
//            } else if (nu >0){
//                positivos++;
//            } else {
//                negativos++;
//            }
//        }
//
//        System.out.println("""
//                Negativos: %d
//                Positivos: %d
//                """.formatted(negativos, positivos));
//
//        System.out.println();
//        System.out.println();

//        System.out.println("Digite um numero");
//        int numero = ler.nextInt();
//
//        for (int i = 1; i <= numero; i++) {
//            if (i != 5 && (i % 10) != 5) {
//                System.out.println(i);
//            }
//        }


        System.out.println();
        System.out.println();

        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println();


            System.out.println("""
                    ====> Lista Convidados <====
                    
                    - Ver
                    - Adicionar
                    - Sair
                    """);
            String acao = ler.nextLine();

            if (acao.equalsIgnoreCase("ver")) {
                System.out.println(nomes);
            } else if (acao.equalsIgnoreCase("adicionar")){
                System.out.println();
                System.out.println();
                System.out.println("Um nome:");
                String nome = ler.nextLine();

                if(!nomes.contains(nome)){
                    nomes.add(nome);
                    System.out.println();
                    System.out.println();
                    System.out.println("Nome adicionado");
                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("Ja tem");
                }
            } else if (acao.equalsIgnoreCase("sair")) {
                System.out.println();
                System.out.println();
                System.out.println("Saindo...");
                break;
            }
        }
    }
}
