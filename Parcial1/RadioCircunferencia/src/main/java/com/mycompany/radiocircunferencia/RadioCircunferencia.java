/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiocircunferencia;
import java.util.Scanner;
/**
 *
 * @author HP-Notebook
 */
public class RadioCircunferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del radio de la circunferencia: ");
        double radio = sc.nextDouble();
        double pi = 3.1415926535;
        double area = pi * radio * radio;
        double volumen = (4.0/3.0) * pi * radio * radio * radio;
        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El volumen de la circunferencia es: " + volumen);
    }
}
