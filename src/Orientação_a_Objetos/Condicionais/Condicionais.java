package Orientação_a_Obijetos.Condicionais;

public class Condicionais {
    public static void main(String[] args) {
        int nu = 7;

        if ((nu % 2) == 0){
            System.out.println("Par");
        } else {
            System.out.println("Inpar");
        }

        System.out.println();
        System.out.println();

        double nota1 = 7.5;
        double nota2 = 8;
        double nota3 = 9;
        double media = (nota3 + nota2 + nota1) / 3;

        if (media >= 8.2){
            System.out.println("aprovado");
        } else if (media == 5.8) {
            System.out.println("recuperação");
        } else if (media <= 4.3) {
            System.out.println("reprovado");
        }

        System.out.println();
        System.out.println();

        int senha = 12345;

        if (senha == 12345) {
            System.out.println("Acesso permitido! ");
        } else {
            System.out.println("negado! ");
        }

        System.out.println();
        System.out.println();

        int nu1 = 10;
        int nu2 = 20;

        if(nu1 > nu2){
            System.out.println("O maior número é: " + nu1);
        } else {
            System.out.println("O maior número é: " + nu2);
        }

        System.out.println();
        System.out.println();

        double preco = 100.00;

        if (preco >= 100) {
            preco = preco - ((preco * 10) / 100);
            System.out.println("""
                    Desconto de 10% aplicado.
                    Novo valor: R$""" + preco);
        } else {
            System.out.println("""
                    Nenhum desconto aplicado.
                    Valor total: R$"""+preco);
        }

        System.out.println();
        System.out.println();

        String dia = "quarta";

        if (!dia.equalsIgnoreCase("Sabado") || !dia.equalsIgnoreCase("Domingo")){
            System.out.println("Dia util");
        }

        System.out.println();
        System.out.println();

        double valor2 = 6000;

        if (valor2 >= 1000 && valor2 <= 5000) {
            System.out.println("O valor "+valor2+", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor "+valor2+", não está dentro do intervalo permitido para empréstimo");
        }

        System.out.println();
        System.out.println();

        int lado1 = 3;
        int lado2 = 4;
        int lado3 = 5;
        int somaL1L2 = lado1 + lado2;

        if(somaL1L2 > lado3) {
            System.out.println("Forma um triangulo");
        } else {
            System.out.println("Nao forma um triangulo");
        }


        System.out.println();
        System.out.println();

        int idade = 17;
        double peso = 49;

        if (idade >= 18 || idade <= 65 && peso >= 50) {
            System.out.println("Doador compativel");
        } else {
            if (!(idade >= 18) || !(idade <= 65) && !(peso >= 50)) {
                System.out.println("""
                        O doador não é compatível.
                        Motivo: Deve ter entre 18 e 65 anos e pesar mais que 50kg.
                        """);
            } else if (peso < 50){
                System.out.println("""
                        O doador não é compatível.
                        Motivo: Deve pesar mais que 50kg.
                        """);
            } else {
                System.out.println("""
                        O doador não é compatível.
                        Motivo: Deve ter entre 18 e 65 anos.
                        """);
            }
        }

        System.out.println();
        System.out.println();

        int codigo = 2023;
        int nivel = 2;

        if (codigo == 2023 && nivel <=3) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso Negado!");
        }
    }
}

