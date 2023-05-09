package br.com.thborja.screenmatch.modelos;

public class Serie extends Titulo implements Classificavel {
    private int numeroDeEpisodios;
    private int numeroDeTemporadas;
    private boolean ativa;
    private int duracaoEpisodioEmMinuto;

    public Serie(String titulo, int anoDeLancamento, int numeroDeEpisodios, int numeroDeTemporadas, boolean ativa, int duracaoEpisodioEmMinuto) {
        super(titulo, anoDeLancamento, numeroDeEpisodios*duracaoEpisodioEmMinuto);
        this.numeroDeEpisodios = numeroDeEpisodios;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.ativa = ativa;
        this.duracaoEpisodioEmMinuto = duracaoEpisodioEmMinuto;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getDuracaoEpisodioEmMinuto() {
        return duracaoEpisodioEmMinuto;
    }

    public void setDuracaoEpisodioEmMinuto(int duracaoEpisodioEmMinuto) {
        this.duracaoEpisodioEmMinuto = duracaoEpisodioEmMinuto;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void calcularTempo(){
        setDuracaoEmMinutos(this.numeroDeEpisodios*this.duracaoEpisodioEmMinuto);
    }
    @Override
    public void imprimeFicha() {
        calcularTempo();
        super.imprimeFicha();
        if (isAtiva()){
            System.out.println("Esta ativa: Sim");
        } else {
            System.out.println("Esta ativa: Nao");
        }
        System.out.println(getNumeroDeEpisodios() + " Episodios de " + getDuracaoEpisodioEmMinuto() +" minutos" );
        System.out.println(getNumeroDeTemporadas() + " Temporadas");
    }

    public int getClassificacao() {
        return (int) getMediaAvaliacao();
    }
}
