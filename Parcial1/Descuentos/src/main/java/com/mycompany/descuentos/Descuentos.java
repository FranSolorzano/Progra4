/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descuentos;
import java.util.Scanner;
/**
 *
 * @author HP-Notebook
 */
public class Descuentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("****Bienvenido querido usuario****");
            System.out.println("\n----Por favor ingrese su tipo de genero----");
            System.out.println("\n'H' 'M'  ********por favor escribirlas en mayuscula!!!****");
            String gender = sc.nextLine();
            System.out.println("\nIngrese su sueldo: ");
            double sueldo = sc.nextDouble();

            double AFP = 0, ISSS = 0, RENTA = 0, descuento = 0;
            switch (gender) {
                case "H":
                    if (sueldo > 300) {
                        AFP = sueldo * 0.0625;
                        ISSS = sueldo * 0.03;
                        RENTA = sueldo * 0.10;
                        descuento = AFP + ISSS + RENTA;
                    } else {
                        AFP = sueldo;
                    }
                    System.out.println("\nSueldo: " + sueldo);
                    System.out.println("\nAFP: " + AFP);
                    System.out.println("\nISSS: " + ISSS);
                    System.out.println("\nRenta: " + RENTA);
                    System.out.println("\nDescuento: " + descuento);
                    break;
                case "M":
                    if (sueldo > 300) {
                        AFP = sueldo * 0.0625;
                        ISSS = sueldo * 0.02;
                        RENTA = 0;
                        descuento = AFP + ISSS + RENTA;
                    } else {
                        AFP = 0;
                    }
                    System.out.println("\nSueldo: " + sueldo);
                    System.out.println("\nAFP: " + AFP);
                    System.out.println("\nISSS: " + ISSS);
                    System.out.println("\nRenta: " + RENTA);
                    System.out.println("\nDescuento: " + descuento);
                    break;
                default:
                    System.out.println("\n****Por favor podria ingresar una opcion que sea valida****");
            }
            sc.nextLine(); 

            System.out.print("\n¿Desea calcular los descuentos para otro trabajador? (S/N): ");
            continuar = sc.nextLine().charAt(0);
        } while (continuar == 'S' || continuar == 's');

    }
}
