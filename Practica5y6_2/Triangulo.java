package mx.unam.fi.poo.g1.p56_2;

/**
 * Clase punto
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre - 2024
*/

public class Triangulo {
    
    private int filas = 0;

    /**
     * Metodo constructor
     * Para construir objetos Triángulo.
     * @param filas -> Atributo para las filas del triángulo.
     */
    public Triangulo(int filas){
        setFilas(filas);
    }

    /**
     * Método get
     * @return filas -> Regresa el atributo filas.
     */
    public int getFilas() {
        return this.filas;
    }

    /**
     * Método set
     * @param filas -> Para cambiar el dato de las filas del triángulo.
     */
    public void setFilas(int filas){
        this.filas = filas;
    }

    /**
     * Método para formar el triángulo.
     * Imprime el triángulo de Pascal con un número de filas especificado.
    */
    public void formTriangulo(){
        for(int i = 0; i < this.filas; i++){
            int n = 1;
            int espacio = this.filas - i;

            for(int j = 0; j < espacio; j++){
                System.out.print("  ");
            }

            for(int k = 0; k <= i; k++){
                System.out.print(n + "   ");
                n = n * (i - k) / (k + 1);
            }

            System.out.println();
        }
    }

}
