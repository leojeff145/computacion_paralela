/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacion_matrices;
import multiplicacion_matrices.Entre_matriz;
import multiplicacion_matrices.Escalar;

/**
 *
 * @author Leonardo
 */
public class Multiplicacion_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Entre_matriz hilo_1 = new Entre_matriz("Hilo_1: MatrizA x MatrizB");
        Escalar hilo_2 = new Escalar("Hilo_2: A x MatrizA");
        long startTime = System.nanoTime();
        hilo_1.start();
        hilo_2.start();
        try{
            hilo_1.join();
            hilo_2.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Tiempo de ejecución: " + elapsedTime + " nanosegundos");
    }
    
}
