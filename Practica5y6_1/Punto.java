package mx.unam.fi.poo.g1.p56_1;

/**
 * Clase punto
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre - 2024
*/


public class Punto {
    /**
     * Variable radio de la Tierra
     */
    public double radio = 6371.01;

    private double x1 = 0;
    private double x2 = 0;
    private double y1 = 0;
    private double y2 = 0; 

    /**
     * Metodo constructor
     * Para construir objetos punto.
     * @param x1 -> Atributo para la coordenada x1 del primer punto.
     * @param y1 -> Atributo para la coordenada y1 del primer punto.
     * @param x2 -> Atributo para la coordenada x2 del segundo punto.
     * @param y2 -> Atributo para la coordenada y2 del segundo punto.
     */

    public Punto(double x1, double x2, double y1, double y2){
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
    }

    /**
     * Método para calcular la distancia entre los dos puntos
     * @return distancia -> regresa la distancia entre los dos puntos.
    */
    public double distancia(){
        double distancia = radio * (Math.acos((Math.sin(this.x1)) * (Math.sin(this.x2)) + ((Math.cos(this.x1)) * (Math.cos(this.x2)) * (Math.cos(this.y2 - this.y1)))));
        return distancia;
    }

    /**
     * Método get
     * @return x1 -> Regresa el atributo x1.
     */
    public double getX1(){
        return x1;
    }

    /**
     * Método set
     * @param x1 -> Para cambiar el dato de x1 del primer punto.
     */
    public void setX1(double x1){
        this.x1 = x1;
    }

    /**
     * Método get
     * @return x2 -> Regresa el atributo x2.
     */
    public double getX2(){
        return x2;
    }

    /**
     * Método set
     * @param x2 -> Para cambiar el dato de x2 del segundo punto.
     */
    public void setX2(double x2){
        this.x2 = x2;
    }

    /**
     * Método get
     * @return y1 -> Regresa el atributo y1.
     */
    public double getY1(){
        return this.y1;
    }

    /**
     * Método set
     * @param y1 -> Para cambiar el dato de y1 del primer punto.
     */
    public void setY1(double y1){
        this.y1 = y1;
    }

    /**
     * Método get
     * @return y2 -> Regresa el atributo y2.
     */
    public double getY2(){
        return this.y2;
    }

    /**
     * Método set
     * @param y2 -> Para cambiar el dato de y2 del segundo punto.
     */
    public void setY2(double y2){
        this.y2 = y2;
    }
    
    
}
