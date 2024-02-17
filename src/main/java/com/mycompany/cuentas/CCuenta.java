/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentas;

/**
 * Clase CCuenta que modela los atributos y operaciones básicas de una cuenta bancaria.
 * Permite la gestión de un saldo, realizando operaciones de ingreso y retiro, 
 * además de mantener información básica del titular de la cuenta.
 * 
 * @author Susana
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor vacío que crea una instancia de CCuenta sin inicializar sus campos.
     */
    public CCuenta()
    {
    }
    
   /**
     * Constructor de CCuenta que inicializa el titular, número de cuenta, saldo y tipo de interés.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicable a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta.
     * 
     * @return Número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

   /**
     * Establece el número de la cuenta.
     * 
     * @param cuenta Número de la cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

   /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés Tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    
   /**
     * Ingresa una cantidad en la cuenta, incrementando el saldo.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es menor que 0, lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira una cantidad de la cuenta, disminuyendo el saldo.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es menor o igual a 0, o si el saldo es insuficiente, lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
}
