/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimentoshelados;

/**
 *
 * @author HP-Notebook
 */
public class Producto {
     private String nombre;
    private String expire;
    private String lote;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.expire = "11/10/2023"; 
        this.lote = "27/05/2023"; 
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Caducidad: " + expire);
        System.out.println("Lote: " + lote);
    }
}
