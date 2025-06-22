package Orientação_a_Obijetos.Player.Calculos;

import Orientação_a_Obijetos.Player.Modelos.PodCast;

public class PassarParaHora {
    private double hora;

    public double paraHora(PodCast podCast){
        hora = (int) (podCast.getDuracaoEmMinutos() / 60);
        return hora;
    }
}
