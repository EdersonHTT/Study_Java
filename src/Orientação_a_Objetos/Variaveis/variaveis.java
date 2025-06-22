package Orientação_a_Obijetos.Variaveis;

public class variaveis {
    public static void main(String[] args) {
        String nome = "eder";
        int idade = 17;
        double altura = 1.78;
        boolean estuda = true;

        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %2f
                Estudante: %b
                """.formatted(nome, idade, altura, estuda));

        System.out.println();
        System.out.println();

        double entrada = 19.5;
        int inteiro = (int) entrada;

        System.out.println("O valor inteiro e: " + inteiro);

        System.out.println();
        System.out.println();

        double nota1 = 7.5;
        double nota2 = 8;
        double nota3 = 9;
        double media = (nota3 + nota2 + nota1) / 3;

        System.out.println("Media: " + media);

        System.out.println();
        System.out.println();

        int celsius = 20;
        int fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        System.out.println();
        System.out.println();

        String titulo = "One Piece";
        String autor = "Eiichiro Oda";
        int numroDePaginas = 200;
        double custo = 30.99;
        String categoria = "F";

        if (categoria.equalsIgnoreCase("F")) {
            System.out.println("""
                    Livro: %s
                    Autor: %s
                    Numero de paginas: %d
                    Custo: R$%2f
                    Categoria: Fantasia
                    """.formatted(titulo, autor, numroDePaginas, custo));
        }

        System.out.println();
        System.out.println();

        double valor = 100;

        if(valor <= 50.00){
            System.out.println("Categoria do produto: Economico");
        } else if(valor >= 50.01 && valor <= 200) {
            System.out.println("Categoria do produto: Intermediario");
        } else {
            System.out.println("Categoria do produto: Premium");
        }

        System.out.println();
        System.out.println();

        int nu = 7;

        if ((nu % 2) == 0){
            System.out.println("Par");
        } else {
            System.out.println("Inpar");
        }

        double valorReais = 451.50;
        double valorDolar = valorReais / 5.25;

        System.out.println("Valor Dolar: US$" + valorDolar);

        System.out.println();
        System.out.println();

        int idade2 = 17;
        String mensagem;

        if (idade2 >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);

        System.out.println();
        System.out.println();

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("""
                Autonomia máxima do veículo: %2f km
                Autonomia atual: %2f km""");

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Você conseguirá completar a viagem se abastecer.");
        }
    }
}
