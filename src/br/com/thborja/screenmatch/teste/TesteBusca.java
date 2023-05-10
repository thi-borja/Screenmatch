package br.com.thborja.screenmatch.teste;

import br.com.thborja.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

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
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=22c16e72";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        //System.out.println(json);

        Gson gson = new Gson();
        Titulo titulo1 = gson.fromJson(json,Titulo.class);
        System.out.println(titulo1);
    }
}
