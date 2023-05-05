package br.com.thborja.screenmatch.modelos;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 8){
            System.out.println("Em alta");
        } else if (classificavel.getClassificacao() >= 5) {
            System.out.println("Bem avaliado");
        } else {
            System.out.println("Mal avaliado");
        }
    }
}
