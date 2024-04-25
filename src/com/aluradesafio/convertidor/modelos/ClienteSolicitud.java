package com.aluradesafio.convertidor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteSolicitud {

    public Moneda buscaMoneda(String moneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2dfb355523ec3379a4ccdc0f/latest/" + moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(response.body()).getAsJsonObject();

            String result = jsonObject.get("result").getAsString();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            double ARS = conversionRates.get("ARS").getAsDouble();
            double BOB = conversionRates.get("BOB").getAsDouble();
            double BRL = conversionRates.get("BRL").getAsDouble();
            double CLP = conversionRates.get("CLP").getAsDouble();
            double COP = conversionRates.get("COP").getAsDouble();
            double USD = conversionRates.get("USD").getAsDouble();

            return new Moneda(ARS, BOB, BRL, CLP, COP, USD);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se encontró la moneda");
        }
    }
}
