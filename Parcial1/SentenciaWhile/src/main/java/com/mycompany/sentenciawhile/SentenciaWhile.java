/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciawhile;
import javax.swing.JOptionPane;
/**
 *
 * @author HP-Notebook
 */
public class SentenciaWhile {

    public static void main(String[] args) {
        int alumno = 1, aprobado = 0;
        double nota1;
        String primerNota;
        while (alumno <= 5) {
            primerNota = JOptionPane.showInputDialog("Digite la nota del alumno: ");
            nota1 = Double.parseDouble(primerNota);
            if (nota1 > 5.99) {
                aprobado++;
            }//fin del if
            alumno++;
        }//fin del while
        JOptionPane.showMessageDialog(null, "El numero de aprobados es: "
                + aprobado, "Resultados del examen", JOptionPane.INFORMATION_MESSAGE);
    }
}
