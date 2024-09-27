package mx.unam.fi.poo.g1.p56_4;

/**
 * Clase CuentaBanco
 * @author Carrillo Alemán LUis Fernando.
 * @version Septiembre - 2024.
 */

public class CuentaBanco {

    private String nombre;
    private int cuenta;
    private double saldo;

    /**
     * Método constructor
     * @param n -> Atributo para el nombre.
     * @param c -> Atributo para el número de la cuenta.
     * @param dI -> Atributo para el depósito inicial.
     */
    public CuentaBanco(String n, int c, double dI) {
        setNombre(n);
        setCuenta(c);
        setSaldo(dI);
    }

     /**
     * Método get
     * @return nombre -> Regresa el atributo nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método set
     * @param nombre -> Para cambiar el dato del nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get
     * @return cuenta -> Regresa el atributo cuenta.
     */
    public int getCuenta() {
        return this.cuenta;
    }

    /**
     * Método set
     * @param cuenta -> Para cambiar el dato de la cuenta.
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get
     * @return saldo -> Regresa el atributo saldo.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Método set
     * @param saldo -> Para cambiar el dato del saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para aumentar el saldo del cliente mediante un depósito de dinero.
     * @param dinero -> parámetro para sumar el dinero al saldo.
    */
    public void depositar(double dinero) {
        if (dinero <= 0) {
            System.out.println("No se puede depositar, debe de ser mayor a 0...");
        } else {
            this.saldo += dinero;
            System.out.println("Se ha depositado: $" + dinero + " a la cuenta de " + this.nombre);
        }
    }

    /**
     * Método para disminuir el saldo del cliente mediante un retiro de dinero.
     * @param dinero -> parámetro para restar el dinero al saldo.
    */
    public void retirarDinero(double dinero) {
        if (dinero > this.saldo) {
            System.out.println("No se puede retirar: Saldo insuficiente.");
        } else {
            this.saldo -= dinero;
            System.out.println("Se ha retirado: $" + dinero + " de la cuenta de " + this.nombre);
        }
    }

    /**
     * Método para imprimir la información de cada objeto creado, incluye su nombre, su cuenta, y su saldo actual.
    */
    public void imprimirInformación() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cuenta: " + this.cuenta);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println();
    }
}
