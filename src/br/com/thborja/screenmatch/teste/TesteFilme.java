package br.com.thborja.screenmatch.teste;

import br.com.thborja.screenmatch.modelos.Filme;
import br.com.thborja.screenmatch.modelos.FiltroDeRecomendacao;
import br.com.thborja.screenmatch.modelos.Serie;

public class TesteFilme {
    public static void main(String[] args) {
        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        Filme filme1  = new Filme();

        filme1.setTitulo("O poderoso chefao");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.setDiretor("Francis Ford Coppola");
        filme1.avalia(8);
        filme1.avalia(10);
        filme1.avalia(6);
        filme1.avalia(7);
        filme1.imprimeFicha();
        filtro.filtra(filme1);

        Serie serie1  = new Serie();

        serie1.setTitulo("This is us");
        serie1.setAnoDeLancamento(2016);
        serie1.setAtiva(false);
        serie1.setDuracaoEpisodioEmMinuto(42);
        serie1.setNumeroDeEpisodios(106);
        serie1.setNumeroDeTemporadas(6);
        serie1.avalia(8);
        serie1.avalia(8);
        serie1.avalia(9);
        serie1.avalia(6);
        serie1.avalia(10);
        serie1.imprimeFicha();
        filtro.filtra(serie1);

    }
}