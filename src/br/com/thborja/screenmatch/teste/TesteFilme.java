package br.com.thborja.screenmatch.teste;

import br.com.thborja.screenmatch.modelos.*;

import java.util.ArrayList;

public class TesteFilme {
    public static void main(String[] args) {
        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        Filme filme1  = new Filme("O poderoso chefao",1970,180,"Francis Ford Coppola");

        filme1.avalia(8);
        filme1.avalia(10);
        filme1.avalia(6);
        filme1.avalia(7);
        //filme1.imprimeFicha();
        //filtro.filtra(filme1);

        Filme filme2  = new Filme("Blade Runner 2049",2017,163,"Denis Villeneuve");

        filme2.avalia(10);
        filme2.avalia(10);
        filme2.avalia(8);
        filme2.avalia(5);
        //filme2.imprimeFicha();
        //filtro.filtra(filme2);

        Serie serie1  = new Serie("This is us",2016,106,6,false,42);

        serie1.avalia(8);
        serie1.avalia(8);
        serie1.avalia(9);
        serie1.avalia(6);
        serie1.avalia(10);
        //serie1.imprimeFicha();
        //filtro.filtra(serie1);

        Serie serie2  = new Serie("One piece",1997,1061,9,true,24);

        serie2.avalia(10);
        serie2.avalia(8.6);
        serie2.avalia(9);
        serie2.avalia(8);
        serie2.avalia(10);
        //serie2.imprimeFicha();
        //filtro.filtra(serie2);

        FazEstrela star = new FazEstrela();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println("Quantidade filmes: " + listaDeFilmes.size());
        for (Filme item: listaDeFilmes) {
            System.out.println(item.getTitulo() + " " + star.estrelar(item));
        }

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(serie1);
        listaDeSeries.add(serie2);
        System.out.println("Quantidade Series: " + listaDeSeries.size());
        for (Serie item: listaDeSeries) {
            System.out.println(item.getTitulo() + " " + star.estrelar(item));
        }

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filme1);
        listaDeTitulos.add(filme2);
        listaDeTitulos.add(serie1);
        listaDeTitulos.add(serie2);
        System.out.println("Quantidade Titulos: " + listaDeTitulos.size());
        for (Titulo item: listaDeTitulos) {
            if (item.getClass().equals(Serie.class)){
                System.out.println(item.getTitulo() + " " + star.estrelar((Serie) item));
            } else if(item.getClass().equals(Filme.class)){
                System.out.println(item.getTitulo() + " " + star.estrelar((Filme) item));
            }
        }



    }
}