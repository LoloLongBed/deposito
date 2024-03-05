package cuentas;
/**
 * @author m_fer
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * metodo que devuelve el nombre del titular de la cuenta
 * @return nombre titular de cuenta
 */
    public String getNombre() {
		return nombre;
	}
/**
 * metodo para obtener el nombre
 * @param nombre nombre del titular de la cuenta
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * metodo que devuelve el numero de la cuenta
 * @return numero de la cuenta
 */
	public String getCuenta() {
		return cuenta;
	}
/**
 * metodo por el cual obtienes el numero de cuenta
 * @param cuenta numero de la cuenta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * metodo que devuelve el saldo de la cuenta
 * @return saldo de la cuenta
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * metodo para obtener el saldo de la cuenta
 * @param saldo saldo de la cuenta
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * metodo que devuelve el tipo de interes 
 * @return tipo de interes
 */
	public double getTipoInterés() {
		return tipoInterés;
	}
/**
 * metodo para obtener el tipo de interes
 * @param tipoInterés tipo de interes de la cuenta
 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
/**
 * metodo que devuelve el estado de la cuenta
 * @return saldo de la cuenta
 */
	public double estado()
    {
        return saldo;
    }
/**
 * metodo para ingresar una cantidad
 * @param cantidad cantidad a retirar
 * @throws Exception si la cantidad fuera negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * metodo para retirar una cantidad
 * @param cantidad cantidad a retirar
 * @throws Exception si la cantidad fuera negativa
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
