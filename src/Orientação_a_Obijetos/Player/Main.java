package Orientação_a_Obijetos.Player;

import Orientação_a_Obijetos.Player.Modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica macacos = new Musica();
        macacos.setTitulo("Macacos me mordam!");
        macacos.setBanda(false);
        macacos.setCompositor("Macaco");
        macacos.setGenero("Selvagem");
        macacos.setNumeroDeIntegrantes(1);
        macacos.setEstilo("vocal");
        macacos.curtir();
        macacos.setDuracaoEmMinutos(5);
        System.out.println(macacos.reproduzir());
        System.out.println(macacos.reproduzir());
        System.out.println(macacos.descricao());
        System.out.println(macacos.getclassifica());


    }
}
