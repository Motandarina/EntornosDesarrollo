package cuentas;

/**
 * Clase CCuenta
 * 
 * Contiene información para manejar cuentas de un deposito
 * 
 * @author Lucía Méndez Rodríguez
 * @version 1.0
 */

public class CCuenta {
    /**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * Identificador de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés aplicado a la cuenta
     */
    private double tipoInterés;

    /**
     * Obtiene el nombre del titular
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador de la cuenta
     * @return identificador de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el identificador de la cuenta
     * @param cuenta identificador de la cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo disponible en la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta
     * @param tipoInterés tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Constructor con 4 parametros
     * @param nom nombre del titular de la cuenta
     * @param cue identificador del titular de la cuenta
     * @param sal saldo disponible en la cuenta
     * @param tipo tipo de interés aplicado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el saldo disponible en la cuenta
     * @return saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si esta cantidad es negativa/cero o si supera el saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
