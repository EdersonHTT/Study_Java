package Orientação_a_Obijetos.Data_e_Hora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println("Data: " + dataAtual);
        System.out.println("Hora: " + horaAtual);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println();
        System.out.println();
        System.out.println("Data Formatada: " + dataAtual.format(formatoData));
        System.out.println("Hora Formatada: " + horaAtual.format(formatoHora));

        LocalTime hora1 = LocalTime.of(14, 30, 00);
        LocalTime hora2 = LocalTime.of(16, 45, 00);

        Duration diferenca = Duration.between(hora1, hora2);

        System.out.println();
        System.out.println();
        System.out.println("A diferenca de horas entre: "+ hora1 + " e " + hora2 + " : " + diferenca.toHours() + " Horas e " + diferenca.toMillisPart() + " minutos");

        LocalDate inicio = LocalDate.of(2025, 3, 15);
        LocalDate fim = inicio.plusDays(15);

        System.out.println();
        System.out.println();
        System.out.println("Data de entrega: " + fim.format(formatoData));

        LocalDate vencimento = LocalDate.of(2025, 3, 30);
        LocalDate adiamento = vencimento.plusMonths(1);

        System.out.println();
        System.out.println();
        System.out.println("Data de vencimento: " + adiamento.format(formatoData));

        LocalDate evento = LocalDate.of(2025, 3, 30);

        System.out.println();
        System.out.println();
        System.out.println("Data do atual: " + dataAtual.format(formatoData));
        System.out.println("Data do evento: " + evento.format(formatoData));

        if (evento.isBefore(dataAtual)) {
            System.out.println("Passou");
        } else {
            System.out.println("Ainda nao passou");
        }

        LocalDate aviso = vencimento.minusDays(5);

        System.out.println();
        System.out.println();
        System.out.println("Aviso: " + aviso.format(formatoData));

        ZonedDateTime horaAtualBr = ZonedDateTime.now();
        ZonedDateTime horaAtualTk = horaAtualBr.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println();
        System.out.println();
        System.out.println("Atual Brasil: " + horaAtualBr.format(formatoHora));
        System.out.println("Atual Tokyo: " + horaAtualTk.format(formatoHora));

        LocalTime entrada = LocalTime.of(13, 30);
        LocalTime saida = entrada.plusHours(6);


    }
}
