/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacion_matrices;

/**
 *
 * @author Leonardo
 */
public class Entre_matriz extends Thread{
    public static Matriz matriz_1, matriz_2,matriz_resultado;
    
    Entre_matriz(String nombre_hilo){
        super (nombre_hilo);
    }      
    
    public static double[] llenar_matriz(double inicio, double ultimo, Matriz matrix,String hilo) {
        for (int i = 0; i < matrix.getFila(); i++) {
            for (int j = 0; j < matrix.getColumna(); j++) {
                matrix.getMatriz()[(matrix.getFila() * j) + i] = (int) Math.abs(Math.floor(Math.random() * (inicio - ultimo + 1) + inicio));
                System.out.println(hilo);
            }
        }
        return matrix.getMatriz();
    }
    
    public static Matriz multiplicacion(Matriz matriz_1, Matriz matriz_2,String hilo) {
        for(int i=0; i<matriz_1.getFila(); i++) {
            for(int j=0; j<matriz_2.getColumna(); j++) {
                for(int k=0; k<matriz_resultado.getColumna(); k++) {
                    matriz_resultado.getMatriz()[(matriz_resultado.getFila() * j) + i]
                            += (matriz_1.getMatriz()[(matriz_1.getFila() * k) + i])
                            * (matriz_2.getMatriz()[(matriz_2.getFila() * j) + k]);
                    System.out.println(hilo);
                }
            }
        }
        return matriz_resultado;
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
        
        matriz_1 = new Matriz(100,100);
        matriz_1.setMatriz(llenar_matriz(2,90,matriz_1,getName()));
        
        matriz_2 = new Matriz(100,100);
        matriz_2.setMatriz(llenar_matriz(2,90,matriz_2,getName()));
        
        if(matriz_1.getColumna() == matriz_2.getFila()) {
            matriz_resultado = new Matriz(matriz_1.getFila(), matriz_2.getColumna());
            
            multiplicacion(matriz_1, matriz_2,getName());
            
            System.out.println("Matriz 1:");
            imprimir(matriz_1);
            
            System.out.println("Matriz 2:");
            imprimir(matriz_2);
            
            System.out.println("Matriz resultante: ");
            imprimir(matriz_resultado);
        } else {
            System.out.println("Las matrices no se pueden multiplicar");
        }
        
        System.out.println("Fin de "+ getName());
    }
}
