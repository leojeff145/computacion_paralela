/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector_multiplication;

/**
 *
 * @author Leonardo
 */
public class Punto extends Thread{
    
    Punto(String nombre_hilo){
        super (nombre_hilo);
    }
    
    public void run(){
          // Definir dos vectores como arrays
        double[] vectorA = {1.0, 2.0, 3.0};
        double[] vectorB = {4.0, 5.0, 6.0};
        double suma = 0.0;

        // Verificar si los vectores tienen la misma longitud
        if (vectorA.length != vectorB.length) {
            System.out.println("Los vectores deben tener la misma longitud");
            return;
        }

        // Calcular el producto escalar
        for (int i = 0; i < vectorA.length; i++) {
            suma += vectorA[i] * vectorB[i];
        }

        // Mostrar el resultado
        //System.out.println("El producto escalar de los vectores es: " + suma);
    }
    
}
