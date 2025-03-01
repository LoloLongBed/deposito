
package cuentas;

/**
 * Proyecto sobre una cuenta del banco
 * @author Manuel Fernandez Garcia
 */

/**
 * Clase con sus atributos
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Método constructor sin parámetros
 */
    public CCuenta()
    {
    }
/**
 * Método constructor con sus parámetros
 * @param nom
 * @param cue
 * @param sal
 * @param tipo 
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Método que devuelve el nombre del titular de la cuenta
 * @return nombre titular de la cuenta
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Método para obtener el nombre
 * @param nombre nombre del titular de la cuenta
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Método que devuelve el numero de cuenta
 * @return numero de cuenta
 */
    public String getCuenta() {
        return cuenta;
    }
/**
 * Método por el cual se obtiene el numero de cuenta
 * @param cuenta numero de cuenta
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**
 * Método que devuelve el saldo de la cuenta
 * @return saldo cuenta
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * Metodo por el cual se obtiene el saldo de la cuenta
 * @param saldo cuenta
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * Método que devuelve el tipo de interés
 * @return tipo de interés
 */
    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * Método por el que se obtiene el tipo de interés
 * @param tipoInterés 
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método que devuelve el estado de la cuenta
     * @return 
     */
    public double estado()
    {
        return saldo;
    }
/**
 * Método para ingresar una cantidad
 * @param cantidad cantidad a ingresar
 * @throws Exception si la cantidad fuese negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Método para retirar una cantidad
 * @param cantidad cantidad a retirar
 * @throws Exception si la cantidad fuera negativa o no hubiera suficiente saldo
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}