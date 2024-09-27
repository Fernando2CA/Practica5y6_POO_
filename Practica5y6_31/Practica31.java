package mx.unam.fi.poo.g1.p56_31;
import mx.unam.fi.poo.g1.p56_31.*;

/**
 * Clase principal de la Practica 31
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre-2024
 */

public class Practica31 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Cadena c = new Cadena("zuzurra zuavemente ziempre", "");
        System.out.print("\nCadena original: " + c.getCad() + "\n");

        c.replaceCadena();

        System.out.print("Cadena modificada: " + c.getNvCad() + "\n");
    }
}
