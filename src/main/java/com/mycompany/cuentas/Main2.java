/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentas;

import com.mycompany.cuentas.CCuenta;

/**
 *
 * @author USER
 */
public class Main2 {

    public static void main(String[] args) {
        operativa_cuenta();
    }

    public static Void operativa_cuenta(float cantidad) {
        CCuenta2 cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta2("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}