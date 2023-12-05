/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacion_matrices;

/**
 *
 * @author Leonardo
 */
public class Escalar extends Thread {
    
    public static Matriz matriz_3, matriz_r;
    Escalar(String nombre_hilo){
        super (nombre_hilo);
    }  
    
    public static double[] llenar_matriz(double inicio, double ultimo, Matriz matrix,String hilo) {
        for (int i = 0; i < matrix.getFila(); i++) {
            for (int j = 0; j < matrix.getColumna(); j++) {
                matrix.getMatriz()[(matrix.getFila() * j) + i] = (int) Math.abs(Math.floor(Math.random() * (inicio - ultimo + 1) + inicio));
                //System.out.println(hilo);
            }
        }
        return matrix.getMatriz();
    }     
    
    public static Matriz multiplicacion_escalar(Matriz matriz, double escalar, String hilo) {
        for (int i = 0; i < matriz.getFila(); i++) {
            for (int j = 0; j < matriz.getColumna(); j++) {
                matriz.getMatriz()[(matriz.getFila() * j) + i] *= escalar;
                System.out.println(hilo);
            }
        }
        return matriz;
    }
    
    public static void imprimir(Matriz matrix) {
        for(int i=0; i<matrix.getFila(); i++) {
            for(int j=0; j<matrix.getColumna(); j++) {
                System.out.print(matrix.getMatriz()[(matrix.getFila() * j) + i] + "   ");                
            }
            System.out.println();
        }
    }
    
    public void run(){
        matriz_3 = new Matriz(100,100);
        matriz_3.setMatriz(llenar_matriz(2,90,matriz_3,getName()));
        double escalar = 2.0;
        matriz_r = multiplicacion_escalar(matriz_3, escalar,getName());
            
        System.out.println("Matriz resultante (multiplicacion escalar): ");
        imprimir(matriz_r);   
        System.out.println("Fin de "+ getName());        
    }
}
