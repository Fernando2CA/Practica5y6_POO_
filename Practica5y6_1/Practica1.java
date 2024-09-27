package mx.unam.fi.poo.g1.p56_1;

import mx.unam.fi.poo.g1.p56_1.*;
import java.util.Scanner;

/**
 * Clase principal de la Practica 1
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre-2024
 */

public class Practica1 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Punto p = new Punto(0, 0, 0, 0);
        double x1, y1, x2, y2;
        
        System.out.print("\nIngrese la longitud del punto 1: ");
        x1 = entrada.nextDouble();
        p.setX1(x1);

        System.out.print("Ingrese la latitud del punto 1: ");
        y1 = entrada.nextDouble();
        p.setY1(y1);

        System.out.print("Ingrese la longitud del punto 2: ");
        x2 = entrada.nextDouble();
        p.setX2(x2);

        System.out.print("Ingrese la latitud del punto 2: ");
        y2 = entrada.nextDouble();
        p.setY2(y2);

        System.out.print("\n        ----Puntos----       \n");
        System.out.printf("P(%.2f, %.2f) y Q(%.2f, %.2f)\n", p.getX1(), p.getY1(), p.getX2(), p.getY2());
        System.out.print("Distancia: " + p.distancia() + "\n");

        entrada.close();
    }
}