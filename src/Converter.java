public class Converter {
    public static void main(String[] args) {
        int celcius = 19;
        int calcParaF = (int) (((celcius*9) / 5) +32);

        System.out.println("%d C graus para F: %d".formatted(celcius, calcParaF));
    }
}
