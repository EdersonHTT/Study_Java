package Orientação_a_Obijetos.Player.Modelos;

import Orientação_a_Obijetos.Player.Calculos.Classificando;

import java.text.DecimalFormat;

public class PodCast extends Audio implements Classificando {
    private String dono;
    private String entrevistado;
    private int participantes;
    private int episodeo;

    @Override
    public String descricao() {
        return """
                Titulo: %s
                Dono: %s
                Entrevistado: %s
                Episódeo: %d
                Duração: %d
                Reproduções: %d
                Curtidas: %d
                """.formatted(super.getTitulo(), dono, entrevistado, episodeo, super.getDuracaoEmMinutos(), super.getTotalDeReproducoes(), super.getCurtidas());
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(String entrevistado) {
        this.entrevistado = entrevistado;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public int getEpisodeo() {
        return episodeo;
    }

    public void setEpisodeo(int episodeo) {
        this.episodeo = episodeo;
    }

    @Override
    public String getclassifica() {
        DecimalFormat df = new DecimalFormat("#.##");
        String format = df.format(((super.getCurtidas() / super.getVisualizacoes()) * 10));
        return format;
    }
}
