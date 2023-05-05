package br.com.thborja.screenmatch.modelos;

public class Filme extends Titulo implements Classificavel {
    private String diretor;


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void imprimeFicha() {
        super.imprimeFicha();
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Classificacao: " + getClassificacao() + " anos");
    }

    public int getClassificacao() {
        return (int)this.getMediaAvaliacao();
    }
}
