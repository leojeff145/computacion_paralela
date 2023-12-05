package matrices;

/**
 *
 * @authores Gonzaga Javier, Gualotuña Richard, Obando Leonardo
 */
public class Matrices {

    public static Matriz matriz_1, matriz_2, matriz_resultado;

   
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        matriz_1 = new Matriz(4,4);
        matriz_1.setMatriz(llenar_matriz(14,25,matriz_1));
        
        matriz_2 = new Matriz(4,4);
        matriz_2.setMatriz(llenar_matriz(11,23,matriz_2));
        
        if(matriz_1.getColumna() == matriz_2.getFila()) {
            matriz_resultado = new Matriz(matriz_1.getFila(), matriz_2.getColumna());
            
            multiplicacion(matriz_1, matriz_2);
            
            System.out.println("Matriz 1:");
            imprimir(matriz_1);
            
            System.out.println("Matriz 2:");
            imprimir(matriz_2);
            
            System.out.println("Matriz resultante: ");
            imprimir(matriz_resultado);
            
            double escalar = 6.0;
            multiplicacion_escalar(matriz_resultado, escalar);
            
            System.out.println("Matriz resultante (multiplicación escalar): ");
            imprimir(matriz_resultado);
        } else {
            System.out.println("Las matrices no se pueden multiplicar");
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Tiempo de ejecución: " + elapsedTime + " nanosegundos");
        
    }
    
    public static double[] llenar_matriz(double inicio, double ultimo, Matriz matrix) {
        for (int i = 0; i < matrix.getFila(); i++) {
            for (int j = 0; j < matrix.getColumna(); j++) {
                matrix.getMatriz()[(matrix.getFila() * j) + i] = (int) Math.abs(Math.floor(Math.random() * (inicio - ultimo + 1) + inicio));
            }
        }
        return matrix.getMatriz();
    }
    
    public static Matriz multiplicacion(Matriz matriz_1, Matriz matriz_2) {
        for(int i=0; i<matriz_1.getFila(); i++) {
            for(int j=0; j<matriz_2.getColumna(); j++) {
                for(int k=0; k<matriz_resultado.getColumna(); k++) {
                    matriz_resultado.getMatriz()[(matriz_resultado.getFila() * j) + i]
                            += (matriz_1.getMatriz()[(matriz_1.getFila() * k) + i])
                            * (matriz_2.getMatriz()[(matriz_2.getFila() * j) + k]);
                }
            }
        }
        return matriz_resultado;
    }
    
    public static Matriz multiplicacion_escalar(Matriz matriz, double escalar) {
        for (int i = 0; i < matriz.getFila(); i++) {
            for (int j = 0; j < matriz.getColumna(); j++) {
                matriz.getMatriz()[(matriz.getFila() * j) + i] *= escalar;
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
}
