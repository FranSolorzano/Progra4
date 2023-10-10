/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimentoshelados;

/**
 *
 * @author ALUMNO
 */
public class Refrigerado extends Producto{
    
    private String codigo;

    public Refrigerado(String nombre) 
    {
        super(nombre);
        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código: " + codigo);
    }
}
