/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentas;

/**
 *
 * @author Susana
 */

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 2300, 695,30);
    }

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

