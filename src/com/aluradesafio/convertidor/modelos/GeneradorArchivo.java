package com.aluradesafio.convertidor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorArchivo {
    private ClienteSolicitud cliente;

    public GeneradorArchivo() {
        this.cliente = new ClienteSolicitud();
    }

    public void guardarJson() throws IOException {
        String[] monedas = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
        for (String moneda : monedas) {
            Moneda monedaObj = cliente.buscaMoneda(moneda);
            guardarMonedaJson(monedaObj);
        }
    }

    private void guardarMonedaJson(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter escritura = new FileWriter("valor_" + moneda + ".json")) {
            escritura.write(gson.toJson(moneda));
        }
    }
}
