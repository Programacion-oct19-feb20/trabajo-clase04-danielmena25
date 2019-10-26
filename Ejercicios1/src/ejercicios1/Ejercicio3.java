/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio3 {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombres completos de un estudiante
    ingreso de nota 1 (debe ser un entero)
    ingreso de nota 2 (debe ser un entero)
    ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del alumno
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombresCompletos;
        int nota1;
        int nota2;
        String cicloCursando;
        
        System.out.println("Ingrese sus nombres completos");
        nombresCompletos = entrada.nextLine();
        System.out.println("Ingrese la nota1");
        nota1 = entrada.nextInt(); // ingreso de decimales
        System.out.println("Ingrese la nota2");
        nota2 = entrada.nextInt(); //ingreso de decimales
        entrada.nextLine();
        System.out.println("Ingrese el ciclo que cursa");
        cicloCursando = entrada.nextLine();
        
        System.out.printf("Datos personales:\nNombres Completos:%s\nnota1:"
                + "%s\nnota2:%d\ncicloCursando:%s\n", nombresCompletos, 
                cicloCursando, nota1, nota2);
        
        
        
}

}