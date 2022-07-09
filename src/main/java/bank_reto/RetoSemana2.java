/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bank_reto;

import paquete2.Bank;

/**
 *
 * @author fmunoz
 */
public class RetoSemana2 {

    public static void main(String[] args) {
        
        Bank banco = new Bank("Bancolombia", "1234324324", "la america", "Fabian Munoz", "la america", "Cr 44 # 43 - 23", 12, "Ofifinalaamerica@gmail.com", "Don Javier", "don javier", "muñoz Vasquez", 34, "luisjavi9@banco.com", "acaja", "admin", "2232", 23, 23, "CAsa", "Hugo el profe", 23, "hugoprofe@gmai.com", "Docente", "29 nero 2020");
        
        banco.aprovarCredito();
        banco.asesorarCliente();
        banco.cambiarClave();
        banco.cantidadCupo();
        banco.darPrestamo();
        banco.gestionarTarjetas();
        banco.gestionarTransaciones();
        banco.sacarDinero();
        banco.pedirPrestamo();
        banco.ofrecerCreditos();
        
        
        
        
    }
}
