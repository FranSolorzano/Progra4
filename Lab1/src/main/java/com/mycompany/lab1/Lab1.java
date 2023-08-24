/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP-Notebook
 */
public class Lab1 {

    public static void main(String[] args) {
        int opcion;

        do {
            String[] opciones = {
                "1-Bienvenido al mundo de Java",
                "2-Ingresar nombre, apellido y mostrar fecha actual",
                "3-Ingresar palabra, número y mostrar la palabra repetida",
                "4-Calcular operaciones básicas",
                "5-Calcular el nùmero mayor",
                "6-Calcular perímetro y área de un rectángulo",
                "7-Calcular radio, área y volumen de un circulo",
                "8-Salir"
            };

            int alto = 500; // Altura del cuadro de diálogo
            int ancho = 400; // Ancho del cuadro de diálogo

            opcion = JOptionPane.showOptionDialog(
                null,
                "Por favor selecciona una de las opciones del menú:",
                "Menú",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            JDialog dialog = new JDialog();
            dialog.setSize(ancho, alto);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(dialog, "Bienvenido al mundo de Java");
                    break;
                case 1:
                    String nombre; 
                    String apellido;
                    nombre = JOptionPane.showInputDialog(dialog, "Ingrese su nombre:");
                    apellido = JOptionPane.showInputDialog(dialog, "Ingrese sus apellidos:");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
                    String fechaActual = dateFormat.format(new Date());
                    JOptionPane.showMessageDialog(dialog, "" + nombre + " " + apellido + ", el dìa de hoy es: " + fechaActual);
                    break;
                case 2:
                    String palabra; 
                    int numero;
                    palabra = JOptionPane.showInputDialog(dialog, "Por favor ingresar una palabra:");
                    numero = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Por favor ingresar un número:"));
                    StringBuilder resultado = new StringBuilder();
                    for (int i = 0; i < numero; i++) {
                        resultado.append(palabra).append("\n");
                    }
                    JOptionPane.showMessageDialog(dialog, resultado.toString());
                    break;
                case 3:
                    double numero1; 
                    double numero2;
                    String operaciones;
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingresar el primer número:"));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingresar el segundo número:"));
                    operaciones = String.format(
                        "Suma: %.2f\nResta: %.2f\nMultiplicación: %.2f\n",
                        numero1 + numero2,
                        numero1 - numero2,
                        numero1 * numero2
                    );
                    if (numero2 != 0) {
                        operaciones += String.format("División: %.2f\n", numero1 / numero2);
                    } else {
                        operaciones += "No se puede dividir por cero.\n";
                    }
                    JOptionPane.showMessageDialog(dialog, operaciones);
                    break;
                case 4:
                    int num1; 
                    int num2; 
                    int num3; 
                    int max;
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingresar el primer número a calcular:"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingresar el segundo número a calcular:"));
                    num3 = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingresar el tercer número a calcular:"));                  
                    max = Math.max(num1, Math.max(num2, num3));
                    JOptionPane.showMessageDialog(dialog, "El número mayor entre los tres es: " + max);
                    break;
                case 5:
                    double ladoA; 
                    double ladoB; 
                    double perimetro; 
                    double area;
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el valor del lado A del rectángulo:"));
                    ladoB = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el valor del lado B del rectángulo:"));
                    perimetro =  2 * (ladoA + ladoB);
                    area = ladoA * ladoB;
                    JOptionPane.showMessageDialog(dialog, "El perímetro del rectángulo es: " + perimetro + "\ncon un área del rectángulo: " + area);
                    break;
                case 6:
                    double radio; 
                    double areaCircunferencia; 
                    double volumenEsfera;
                    radio = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el valor del radio de la circunferencia:"));
                    areaCircunferencia = Math.PI * radio * radio;
                    volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
                    JOptionPane.showMessageDialog(dialog, "El área de la circunferencia es de: " + areaCircunferencia + "\ncon un volumen de la esfera de: " + volumenEsfera);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(dialog, "Saliendo del menú.");
                    break;
                default:
                    JOptionPane.showMessageDialog(dialog, "Opción no válida.");
            }
        } while (opcion != 7);
    }
}
