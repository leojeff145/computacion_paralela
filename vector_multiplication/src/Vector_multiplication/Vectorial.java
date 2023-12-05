/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector_multiplication;

/**
 *
 * @author Leonardo
 */
public class Vectorial extends Thread{
    Vectorial(String nombre_hilo){
        super (nombre_hilo);
    }
    
    public void run(){
        // Definir dos vectores como arrays
        double[] vectorA = {1.0, 2.0, 3.0};
        double[] vectorB = {4.0, 5.0, 6.0};
        double[] productoVectorial = new double[3];

        // Verificar si ambos vectores son de 3 dimensiones
        if (vectorA.length != 3 || vectorB.length != 3) {
            System.out.println("Ambos vectores deben ser de 3 dimensiones");
            return;
        }

        // Calcular el producto vectorial
        productoVectorial[0] = vectorA[1] * vectorB[2] - vectorA[2] * vectorB[1];        
        productoVectorial[1] = vectorA[2] * vectorB[0] - vectorA[0] * vectorB[2];        
        productoVectorial[2] = vectorA[0] * vectorB[1] - vectorA[1] * vectorB[0];
        

        // Mostrar el resultado
        //System.out.println("El producto vectorial de los vectores es: ");
        //System.out.println("[" + productoVectorial[0] + ", " + productoVectorial[1] + ", " + productoVectorial[2] + "]");
    }
}
