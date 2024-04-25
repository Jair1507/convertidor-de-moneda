package com.aluradesafio.convertidor.modelos;

public class Conversiones {

    public double convertirDolarEnPesoArgentino(double valorUSD){
        double resultado = valorUSD * 864.75;
        return resultado;
    }

    public double convertirPesoArgentinoEnDolar(double valorARS){
        double resultado = valorARS * 0.001156;
        return resultado;
    }

    public double convertirDolarEnRealBrasileño(double valorUSD){
        double resultado = valorUSD * 5.15;
        return resultado;
    }

    public double convertirRealBrasileñoEnDolar(double valorBRL){
        double resultado = valorBRL * 0.19;
        return resultado;
    }

    public double convertirDolarEnPesoColombiano(double valorUSD){
        double resultado = valorUSD * 3903.6353;
        return resultado;
    }

    public double convertirPesoColombianoEnDolar(double valorCOP){
        double resultado = valorCOP * 0.00026;
        return resultado;
    }

}
