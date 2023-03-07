/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6;

import Servicios.ServicioProducto;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Colecciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioProducto SP = new ServicioProducto();
      Scanner leer = new Scanner(System.in);
      
       int opcion;
         do {

            System.out.println("¿QUE DESEA HACER?");
            System.out.println("1 - Ingresar producto");
            System.out.println("2 - Ver lista de productos con sus precio");
            System.out.println("3 - Modificar precio de un producto");
            System.out.println("4 - Eliminar un producto");
            System.out.println("5 - Salir");
           

            System.out.println("Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    SP.crearProducto();
                    break;
                case 2:
                    SP.mostrarProducto();
                    break;
                case 3:
                     SP.modificarPrecio();
                    break;
                case 4:
                    SP.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Salio del sistema");
              
                default: 
                    System.out.println("");
                    break;
            }

        } while (opcion !=5);
      
    }
    
}
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/