package Orientação_a_Obijetos.Player.Modelos;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int visualizacoes;
    private int curtidas;
    private String classificacao;

    public void curtir() {
        curtidas++;
    }

    public String reproduzir() {
        totalDeReproducoes++;
        visualizacoes++;

        return """
                      %s
                      
                ---o------------------ %d
                
                   |<     >       >|
               """.formatted(titulo, duracaoEmMinutos);
    }

    public String descricao() {
        return """
                Titulo: %s
                Duração: %d
                Reproduções: %d
                Curtidas: %d
                """.formatted(titulo, duracaoEmMinutos, totalDeReproducoes, curtidas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }
}
