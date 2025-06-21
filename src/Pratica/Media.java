package Pratica;

public class Media {
    public static void main(String[] args){
        // 1)
        System.out.println("Media: " + ((6 + 8) / 2) + "\n");

        // 2)
        int varInteira;
        double varDouble = 6.5;
        varInteira = (int) varDouble;

        System.out.println(varInteira + "\n");

        // 3)
        char letra = 'E';
        String texto = "der";

        System.out.println(letra + texto + "\n");

        // 4)
        double precoProduto = 1.5;
        int quantidade = 5;
        double calc = precoProduto * quantidade;

        System.out.println("Custo: " + calc + "\n");

        // 5)

        double valorDolar = 3.5;
        double valorReais = 5.63;
        double calcDolarPReais = valorDolar * valorReais;

        System.out.println("Dolar hoje: " + calcDolarPReais + "\n");

        double precoOriginal = 6.99;
        int desconto = 10;
        double calcDesconto = (precoOriginal /100) * desconto;

        System.out.println("Preco %2f com desconto de %d: %2f".formatted(precoOriginal, desconto, calcDesconto));
    }
}
