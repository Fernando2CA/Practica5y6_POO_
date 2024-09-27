package mx.unam.fi.poo.g1.p56_32;
import mx.unam.fi.poo.g1.p56_32.*;
import java.util.Scanner;

/**
 * Clase principal de la Practica 32
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre-2024
 */

public class Practica32 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fruta fruta = new Fruta("Naranja", "Platano", "Fresa", "Mandarina", "Mango");
        String nvFruta;

        System.out.println("Elementos del Arraylist: \n" + fruta.getFruta());
        System.out.print("Ingrese la fruta por la que desea reempalzar a la segunda del Arraylist: ");
        nvFruta = entrada.next();

        fruta.nuevaFruta(nvFruta);

        System.out.println("Nuevo Arraylist: \n" + fruta.getFruta());

        entrada.close();
    }
}
