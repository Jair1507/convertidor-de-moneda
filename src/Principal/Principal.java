package Principal;

import com.aluradesafio.convertidor.modelos.ClienteSolicitud;
import com.aluradesafio.convertidor.modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ClienteSolicitud cliente = new ClienteSolicitud();
        System.out.println("Que moneda desear ingresar");
        var monedaValor  = teclado.nextLine();

        Moneda moneda  = cliente.buscaMoneda(monedaValor);
        System.out.println(moneda);
    }
}
