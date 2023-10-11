/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimentoshelados;
import java.util.Scanner;
/**
 *
 * @author HP-Notebook
 */
public class AlimentosHelados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MENU
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.println("***Por favor selecciona el tipo de producto***");
        System.out.println("1-Productos Frescos ");
        System.out.println("2-Productos Refrigerados");
        System.out.println("3-Productos Congelados");
        int opcion = scanner.nextInt();
          
        switch (opcion){
            case 1: 
                Fresco productoFresco = new Fresco(nombre);
                System.out.print("Ingrese la fecha de envasado: ");
                String fechaEnvasado = scanner.next();
                productoFresco.setFechaEnvasado(fechaEnvasado);              
                System.out.print("Por favor ingresar el país de origen: ");
                String paisOrigen = scanner.next();
                productoFresco.setPaisOrigen(paisOrigen);     
                
                productoFresco.mostrarInformacion();
                break;
            case 2:
                Refrigerado productoRefrigerado = new Refrigerado(nombre);
                System.out.print("Podria ingresar el código: ");
                String codigo = scanner.next();
                productoRefrigerado.setCodigo(codigo);                
                productoRefrigerado.mostrarInformacion();
                break;
            case 3:
                Congelado productoCongelado = new Congelado(nombre);
                System.out.print("Por favor ingresar la temperatura: ");
                String temperatura = scanner.next();
                productoCongelado.setTemperatura(temperatura);
                
                productoCongelado.mostrarInformacion();
                break;
            default:
                System.out.println("Opcion no valida, vuelve a intentarlo");
        }
        scanner.close();        
    
    }
    
}
