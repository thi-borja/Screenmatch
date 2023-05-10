package br.com.thborja.screenmatch.modelos;

import br.com.thborja.screenmatch.excecoes.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    private String titulo;
    private int anoDeLancamento;
    private boolean isInclusoNoPlano;
    private int numDeAvaliacoes;
    private double totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String titulo, int anoDeLancamento, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Titulo(TituloOMDB tituloOMDB) throws ErroDeConversaoDeAnoException {
        this.titulo = tituloOMDB.title();

        if (tituloOMDB.year().length()>4){
            throw new ErroDeConversaoDeAnoException("Ha algum problema no valor \"ano\", isso pode acontecer em alguns titulos mais desconhecidos" );
        }

        this.anoDeLancamento = Integer.parseInt(tituloOMDB.year());
        this.duracaoEmMinutos = Integer.parseInt(tituloOMDB.runtime().substring(0,3));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isInclusoNoPlano() {
        return isInclusoNoPlano;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        isInclusoNoPlano = inclusoNoPlano;
    }

    public double getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void imprimeFicha(){
        System.out.println("\n");
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Ano de lancamento: "+ this.anoDeLancamento);
        System.out.println("Duracao: "+ this.duracaoEmMinutos + "min");
        System.out.println("Media de avaliacao: " + getMediaAvaliacao());
        System.out.println("Total de avaliacoes: " + numDeAvaliacoes + " avaliacoes." );
    }

    public void avalia(double nota){
        numDeAvaliacoes++;
        totalDeAvaliacoes += nota;
    }

    public double getMediaAvaliacao(){
        return totalDeAvaliacoes/numDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return outroTitulo.getTitulo().compareTo(this.getTitulo());
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + "\n" +
                "Lancamento: " + anoDeLancamento + "\n" +
                "Duracao: " + duracaoEmMinutos + "min";
    }



}
