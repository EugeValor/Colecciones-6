/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class ServicioProducto {
    HashMap <String, Double> lista = new HashMap();
    Scanner leer = new Scanner(System.in);
    public void crearProducto(){
  
       int opc;
        do{
        System.out.println("Ingrese el producto");
        String producto = leer.next();
        System.out.println("Ingrese el precio del producto ingresado");
        double precio = leer.nextDouble();
        lista.put(producto, precio);
        System.out.println("Desaa agregas mas productos? 1-Si/2-No");
        opc = leer.nextInt();
        }while(opc==1);
    }
    
    public void mostrarProducto(){
        for (Map.Entry<String, Double> entry : lista.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("El producto es:"+ key+ " el precio es:$"+value);
            
        }
    }
    
     public void modificarPrecio(){
         System.out.println("Ingrese el producto al que quiere modificar el precio");
         String mod = leer.next();
         if(lista.containsKey(mod)){
             lista.remove(mod);
             System.out.println("Ingrese el nuevo precio");
             lista.put(mod, leer.nextDouble());
         }
     }


    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto que desea eliminar del registro");
        String prod = leer.next();
        if (lista.containsKey(prod)) {
            lista.remove(prod);
       
    }
    }
}
/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/