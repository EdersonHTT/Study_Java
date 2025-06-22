package Orientação_a_Obijetos.Player.Modelos;

import Orientação_a_Obijetos.Player.Calculos.Classificando;
import java.text.DecimalFormat;

public class Musica extends Audio implements Classificando {
    private String estilo;
    private String genero;
    private String compositor;
    private String album;
    private boolean banda;
    private int numeroDeIntegrantes;

    @Override
    public String descricao() {
        return """
                Titulo: %s
                Compositor: %s
                Album: %s
                Genero: %s
                Estilo: %s
                Integrantes: %d
                Duração: %d
                Reproduções: %d
                Curtidas: %d
                """.formatted(super.getTitulo(), compositor, album, genero, estilo, numeroDeIntegrantes, super.getDuracaoEmMinutos(), super.getTotalDeReproducoes(), super.getCurtidas());
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isBanda() {
        return banda;
    }

    public boolean getBanda() {
        return banda;
    }

    public void setBanda(boolean banda) {
        this.banda = banda;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        if(banda){
            this.compositor = "Banda " + compositor;
        } else {
            this.compositor = compositor;
        }
    }

    public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }

    public int getNumeroDeIntegrantes() {
        return numeroDeIntegrantes;
    }

    @Override
    public String getclassifica() {
        DecimalFormat df = new DecimalFormat("#.##");
        String format = df.format(((super.getCurtidas() / super.getVisualizacoes()) * 10));
        return format;
    }
}
