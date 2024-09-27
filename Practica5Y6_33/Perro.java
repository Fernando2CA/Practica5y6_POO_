package mx.unam.fi.poo.g1.p56_33;
import java.util.HashMap;

/**
 * Clase Perro
 * @author Carrillo Alemán LUis Fernando.
 * @version Septiembre - 2024.
 */

public class Perro {
    private HashMap <Integer, String> perro = new HashMap<>(5);

    /**
     * Metodo constructor
     * Para construir objetos Perro y cargar las razas en el HashMap.
     * @param p1 -> Atributo para el perro 1.
     * @param p2 -> Atributo para el perro 2.
     * @param p3 -> Atributo para el perro 3.
     * @param p4 -> Atributo para el perro 4.
     * @param p5 -> Atributo para el perro 5.
     */
    public Perro(String p1, String p2, String p3, String p4, String p5){
        setPerro(1, p1);
        setPerro(2, p2);
        setPerro(3, p3);
        setPerro(4, p4);
        setPerro(5, p5);
    }

     /**
     * Método para insertar razas de perros en el HashMap.
     * @param llave -> Llave del HashMap para cada elemento del HashMap.
     * @param perro -> Para añadir elementos perro al HashMap.
    */
    public void setPerro(int llave, String perro){
        this.perro.put(llave, perro);
    }

    /**
     * Método get
     * @return perro -> Regresa el HashMap de los perros.
     */
    public HashMap <Integer, String> getPerro(){
        return this.perro;
    }

    /**
     * Método para acceder a la llave en el HashMap e imprimirla junto con su valor.
     * @param llave -> llave del HashMap que se desea buscar.
    */
    public void buscarLlave(int llave){
        String valor = this.perro.get(llave);
        if (valor == null){
            System.out.print("Llave inválida...");
        } else {
            System.out.printf("El valor asociado a la llave %d es: %s\n", llave, valor );
        }
    }
}
