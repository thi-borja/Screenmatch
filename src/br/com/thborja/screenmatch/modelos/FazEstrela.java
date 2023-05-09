package br.com.thborja.screenmatch.modelos;

public class FazEstrela {
    public String estrelar(Serie titulo){
        int num = titulo.getClassificacao();
        if (num<=10 && num>8){
            return  "*****";
        }
        if (num<=8 && num>6){
            return  "****";
        }
        if(num<=6 && num>4){
            return  "***";
        }
        if(num<=4 && num>2){
            return  "**";
        }
        if(num<=2 && num>0){
            return  "*";
        }
        return null;
    }

    public String estrelar(Filme titulo){
        int num = titulo.getClassificacao();
        if (num<=10 && num>8){
            return  "*****";
        }
        if (num<=8 && num>6){
            return  "****";
        }
        if(num<=6 && num>4){
            return  "***";
        }
        if(num<=4 && num>2){
            return  "**";
        }
        if(num<=2 && num>0){
            return  "*";
        }
        return null;
    }
}
