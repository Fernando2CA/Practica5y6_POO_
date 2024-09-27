package mx.unam.fi.poo.g1.p56_4;
import mx.unam.fi.poo.g1.p56_4.*;

/**
 * Clase principal de la Practica 4
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre-2024
 */

public class Practica4 {  
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {

        CuentaBanco cliente1 = new CuentaBanco("Marcelo Rodriguez", 1245673, 500);
        CuentaBanco cliente2 = new CuentaBanco("Alejandra Sanchez", 1439872, 750);

        System.out.println("--- Datos del cliente ---\n");
        cliente1.imprimirInformación();
        cliente2.imprimirInformación();

        cliente1.depositar(1250);
        cliente2.depositar(500);

        System.out.println("--- Datos del cliente (después del depósito) ---\n");
        cliente1.imprimirInformación();
        cliente2.imprimirInformación();

        cliente1.retirarDinero(300);
        cliente2.retirarDinero(1000); 

        System.out.println("--- Datos del cliente (después del retiro) ---\n");
        cliente1.imprimirInformación();
        cliente2.imprimirInformación();
    } 
}
