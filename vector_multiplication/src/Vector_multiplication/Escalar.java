/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector_multiplication;

/**
 *
 * @author Leonardo
 */
public class Escalar extends Thread{
    Escalar(String nombre_hilo){
        super (nombre_hilo);
    }
    
    public void run(){
        // Definir un vector como array y un escalar
        double[] vector = {1.0, 2.0, 3.0};
        double escalar = 2.0;
        double[] resultado = new double[vector.length];

        // Multiplicar el escalar por cada elemento del vector
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = escalar * vector[i];
        }

        // Mostrar el resultado
        /*System.out.println("El resultado de multiplicar el escalar por el vector es: ");
        for (double valor : resultado) {
            System.out.print(valor + " ");
        }*/
    }
}
    

