package mx.unam.fi.poo.g1.p56_32;
import java.util.ArrayList;

/**
 * Clase Fruta
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre - 2024
 */

public class Fruta {
    private ArrayList<String> fruta = new ArrayList<String>();

    /**
     * Metodo constructor
     * Para construir objetos Fruta.
     * @param f1 -> atributo para la fruta 1.
     * @param f2 -> atributo para la fruta 2.
     * @param f3 -> atributo para la fruta 3.
     * @param f4 -> atributo para la fruta 4.
     * @param f5 -> atributo para la fruta 5.
     */
    public Fruta(String f1, String f2, String f3, String f4, String f5){
        setFruta(f1);
        setFruta(f2);
        setFruta(f3);
        setFruta(f4);
        setFruta(f5);
    }

    /**
     * Método para insertar frutas en el ArrayList.
     * @param fruta -> Para añadir elementos fruta al Arraylist.
    */
    public void setFruta(String fruta){
        this.fruta.add(fruta);
    }

    /**
     * Método get
     * @return fruta -> Regresa el ArrayList de las frutas.
     */
    public ArrayList<String> getFruta(){
        return this.fruta;
    }

    /**
     * Método para modificar el elemento en el indice 1 del ArrayList.
     * @param nvFruta -> fruta que va a servir como reemplazo.
    */
    public void nuevaFruta(String nvFruta){
        this.fruta.set(1, nvFruta);
    }
}
