package Principal;

import com.aluradesafio.convertidor.modelos.ClienteSolicitud;
import com.aluradesafio.convertidor.modelos.Conversiones;
import com.aluradesafio.convertidor.modelos.GeneradorArchivo;
import com.aluradesafio.convertidor.modelos.Moneda;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        GeneradorArchivo generadorArchivo = new GeneradorArchivo();

        try {
            generadorArchivo.guardarJson();
            System.out.println("Archivos JSON generados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar los archivos JSON: " + e.getMessage());
        }

        System.out.println("*****************************");

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Conversiones conversiones = new Conversiones();
        String mensaje = """
                    Sea bienvenido/a al conversor de moneda :)
                    Ingrese la conversion de desea realizar
                    1) Dolar a Peso Argentino
                    2) Peso Argentino a Dolar
                    3) Dolar a Real Brasileño
                    4) Real Brasileño a Dolar
                    5) Dolar a Peso Colombiano
                    6) Peso Colombiano a Dolar
                    7) Salir
                    *************************
                    """;
        while (opcion != 7){
            System.out.println(mensaje);
            System.out.println("Ingrese la conversion que desee realizar");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor del dolar por favor");
                    double cantidadEnDolar  = teclado.nextDouble();
                    System.out.println(conversiones.convertirDolarEnPesoArgentino(cantidadEnDolar));
                    break;
                case 2:
                    System.out.println("Ingrese el valor del Peso Argentino");
                    double cantidadEnPesoArgentino = teclado.nextDouble();
                    System.out.println(conversiones.convertirPesoArgentinoEnDolar(cantidadEnPesoArgentino));
                    break;
                case 3:
                    System.out.println("Ingrese el valor del dolar por favor");
                    double valorEnDolar = teclado.nextDouble();
                    System.out.println(conversiones.convertirDolarEnRealBrasileño(valorEnDolar));
                    break;
                case 4:
                    System.out.println("Ingrese el valor del Real Brasileño por favor");
                    double cantidadEnRealBrasileño = teclado.nextDouble();
                    System.out.println(conversiones.convertirRealBrasileñoEnDolar(cantidadEnRealBrasileño));
                    break;
                case 5:
                    System.out.println("Ingrese el valor del dolar por favor");
                    double dolar  = teclado.nextDouble();
                    System.out.println(conversiones.convertirDolarEnPesoColombiano(dolar));
                    break;
                case 6:
                    System.out.println("Ingrese el valor del Peso Colombiano");
                    double cantidadEnPesoColombiano = teclado.nextDouble();
                    System.out.println(conversiones.convertirPesoColombianoEnDolar(cantidadEnPesoColombiano));
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}

