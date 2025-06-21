package Orientação_a_Obijetos.Stream;

import Orientação_a_Obijetos.Stream.modelos.Filme;
import Orientação_a_Obijetos.Stream.modelos.Titulo;
import Orientação_a_Obijetos.Stream.modelos.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Aranha verso", 2021);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Homem aranha", 2009);
        outroFilme.avalia(6);
        var filmeDoEder = new Filme("Homem aranha", 2020);
        filmeDoEder.avalia(10);
        Serie smallVile = new Serie("Small Vile", 2010);

        Filme f1 = filmeDoEder;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoEder);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(smallVile);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Tom holand");
        buscaPorArtista.add("Spider Man");
        buscaPorArtista.add("Enderu Garfiut");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
