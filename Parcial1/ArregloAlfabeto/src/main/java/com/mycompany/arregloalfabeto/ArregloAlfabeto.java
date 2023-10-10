/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arregloalfabeto;
import java.util.Scanner;
/**
 *
 * @author HP-Notebook
 */
public class ArregloAlfabeto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.print("Por favor ingrese su primer nombre: ");
        String nombre = scanner.nextLine().toLowerCase(); // Convierte el nombre a minúsculas

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);

            // Nos permite encontrar la posición de la letra en el alfabeto
            int posicion = -1;

            for (int j = 0; j < alfabeto.length; j++) {
                if (alfabeto[j] == letra) {
                    posicion = j + 1; // Realiza la suma de 1 para que sea legible para el usuario
                    break;
                }
            }

            if (posicion != -1) {
                System.out.println(letra + " posición " + posicion);
            } else {
                System.out.println(letra + " no es una letra válida que se encuentre en el alfabeto.");
            }
        }

        scanner.close();
    }
}
