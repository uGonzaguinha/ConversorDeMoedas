package br.com.conversormoedas.ConsumirApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirApi {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/81f7efd1a0b6891d9fb4e9e7/latest/USD";

    public String getExchangeRates() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}