package br.com.thborja.screenmatch.teste;

import br.com.thborja.screenmatch.excecoes.ErroDeConversaoDeAnoException;
import br.com.thborja.screenmatch.modelos.Titulo;
import br.com.thborja.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteBusca{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Busque um filme!");
        String busca = sc.nextLine();
        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=22c16e72";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);

        //Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Titulo titulo1 = gson.fromJson(json,Titulo.class);
        TituloOMDB titulo1 = gson.fromJson(json,TituloOMDB.class);
        //System.out.println(titulo1);

        try {
            Titulo meuTitulo = new Titulo(titulo1);
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ErroDeConversaoDeAnoException e) {
            e.getMessage();
            e.printStackTrace();
        }

    }
}
