package br.com.conversormoedas.Principal;

import br.com.conversormoedas.ConsumirApi.ConsumirApi;
import br.com.conversormoedas.Moeda.Moeda;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ConsumirApi apiService = new ConsumirApi();
        Gson gson = new Gson();

        try {
            String json = apiService.getExchangeRates();
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            Moeda moeda = gson.fromJson(jsonObject, Moeda.class);
            Map<String, Double> conversionRates = moeda.getConversionRates();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Conversor de Moedas");
                System.out.println("Escolha a moeda de origem:");
                System.out.println("1. ARS - Peso argentino");
                System.out.println("2. BOB - Boliviano boliviano");
                System.out.println("3. BRL - Real brasileiro");
                System.out.println("4. CLP - Peso chileno");
                System.out.println("5. COP - Peso colombiano");
                System.out.println("6. USD - Dólar americano");
                System.out.println("0. Sair");

                int escolhaOrigem = scanner.nextInt();
                if (escolhaOrigem == 0) {
                    break;
                }

                String moedaOrigem = getMoeda(escolhaOrigem);
                if (moedaOrigem == null) {
                    System.out.println("Opção inválida!");
                    continue;
                }

                System.out.println("Escolha a moeda de destino:");
                System.out.println("1. ARS - Peso argentino");
                System.out.println("2. BOB - Boliviano boliviano");
                System.out.println("3. BRL - Real brasileiro");
                System.out.println("4. CLP - Peso chileno");
                System.out.println("5. COP - Peso colombiano");
                System.out.println("6. USD - Dólar americano");
                System.out.println("0. Sair");

                int escolhaDestino = scanner.nextInt();
                if (escolhaDestino == 0) {
                    break;
                }

                String moedaDestino = getMoeda(escolhaDestino);
                if (moedaDestino == null) {
                    System.out.println("Opção inválida!");
                    continue;
                }

                System.out.printf("Digite o valor em %s: ", moedaOrigem);
                double valorOrigem = scanner.nextDouble();

                double taxaConversaoOrigemUSD = conversionRates.get(moedaOrigem);
                double valorUSD = valorOrigem / taxaConversaoOrigemUSD;

                double taxaConversaoDestino = conversionRates.get(moedaDestino);
                double valorConvertido = valorUSD * taxaConversaoDestino;

                System.out.printf("Valor em %s: %.2f%n", moedaDestino, valorConvertido);
            }

            System.out.println("Programa encerrado.");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String getMoeda(int escolha) {
        return switch (escolha) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> null;
        };
    }
}