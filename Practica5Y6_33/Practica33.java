package mx.unam.fi.poo.g1.p56_33;
import mx.unam.fi.poo.g1.p56_33.*;
import java.util.Scanner;

/**
 * Clase principal de la Practica 33
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre-2024
 */

public class Practica33 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Perro perro = new Perro("Maltés", "Doberman","Chihuahua","Buldog","Gran Danés");
        int llave;
        String valor;

        System.out.print("\n");
        System.out.println(perro.getPerro());
        System.out.print("\nIngrese el valor de la llave de la que quiere obtener su valor: ");
        llave = entrada.nextInt();

        perro.buscarLlave(llave);

    }
}
