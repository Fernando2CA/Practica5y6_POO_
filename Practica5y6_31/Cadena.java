package mx.unam.fi.poo.g1.p56_31;

/**
 * Clase Cadena
 * @author Carrillo Alemán Luis Fernando
 * @version Septiembre - 2024
 */

public class Cadena {
    private String cad;
    private String nvCad; 

    /**
     * Metodo constructor
     * Para construir objetos Cadena e inicializarlos con una cadena proporcionada.
     * @param cad -> Atributo para la cadena original.
     * @param nvCad -> Atributo para la nueva cadena.
     */
    public Cadena(String cad, String nvCad) {
        setCad(cad); 
        setNvCad(nvCad); 
    }

    /**
     * Método para reemplazar un caracter especifico por otro en la cadena.
    */
    public void replaceCadena() {
        this.nvCad = this.cad.replace("z", "s");
    }

    /**
     * Método get
     * @return cad -> Regresa el atributo cad.
     */
    public String getCad() {
        return this.cad;
    }
    
    /**
     * Método set
     * @param cad -> Para cambiar el dato de la cadena.
     */
    public void setCad(String cad) {
        this.cad = cad;
    }

     /**
     * Método get
     * @return nvCad -> Regresa el atributo nvCad con el reemplazo.
     */
    public String getNvCad() {
        return this.nvCad;
    }

    /**
     * Método set
     * @param nvCad -> Para cambiar el dato de la nueva cadena.
     */
    public void setNvCad(String nvCad){
        this.nvCad = nvCad;
    }
}
