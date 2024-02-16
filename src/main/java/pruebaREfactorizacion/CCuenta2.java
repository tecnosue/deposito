/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaREfactorizacion;

import com.mycompany.cuentas.CCuenta;

/**
 *
 * @author USER
 */
public class CCuenta2 {
    double dSaldo;

    public static void main(String[] args) {
        // Depuracion. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        // Depuracion. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        // Depuracion. Provoca parada con codicion de tercer ingreso
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
    }

    public int ingresar(double cantidad) {
        int iCodErr;
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            // Depuracion. Punto de parada. Solo en el 3 ingreso
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }
        // Depuracion. Punto de parada cuando la cantidad  es menor de 0
        return iCodErr;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No se hay suficiente saldo");
        } else {

        }
    }
    
}
