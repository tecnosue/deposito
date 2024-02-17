/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentas;

/**
 * Clase principal que ejecuta la aplicación.
 * Esta clase demuestra la operativa básica de una cuenta bancaria,
 * incluyendo las operaciones de ingreso y retiro de dinero.
 * @author Susana
 */

public class Main {
    /**
     * Método principal que inicia la ejecución de la aplicación.
     * Crea una instancia de {@link CCuenta} y realiza operaciones de prueba.
     *
     * @param args argumentos de la línea de comandos, no utilizados en este método.
     */

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300, 695,30);
    }

   /**
     * Realiza operaciones de retiro e ingreso en una cuenta bancaria y muestra el saldo.
     * Este método intenta retirar y luego ingresar cantidades específicas en la cuenta proporcionada,
     * manejando excepciones si alguna operación falla.
     *
     * @param cuenta1 la cuenta bancaria sobre la cual se realizarán las operaciones.
     * @param retirar cantidad de dinero a retirar de la cuenta.
     * @param ingresar cantidad de dinero a ingresar en la cuenta.
     * @param cantidad un valor adicional para demostración, no utilizado en operaciones financieras.
     */
    private static void operativa_cuenta(CCuenta cuenta1, double retirar, double ingresar, float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        System.out.println("cantidad es " + cantidad);
        try {
            cuenta1.retirar(retirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(ingresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

