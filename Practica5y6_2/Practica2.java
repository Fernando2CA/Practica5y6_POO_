package mx.unam.fi.poo.g1.p56_2;
import mx.unam.fi.poo.g1.p56_2.*;
import java.util.Scanner;

/**
 * Clase principal de la Practica 2
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre-2024
 */

public class Practica2 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulo = new Triangulo(0);
        int filas;

        System.out.print("Ingrese el número de filas del triángulo: ");
        filas = entrada.nextInt();
        triangulo.setFilas(filas);

        System.out.println("--- triangulo ---");
        triangulo.formTriangulo();
        
        entrada.close();


    }
}
