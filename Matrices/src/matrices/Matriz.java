/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author ASUS
 */
public class Matriz {
    private int fila;
    private int columna;
    private double[] matriz;
    
    public Matriz() {
        this.fila = 9;
        this.columna = 9;
        matriz = new double[fila * columna];
    }

    public Matriz(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        matriz = new double[fila * columna];
    }

    public int getFila() { return fila; }
    public void setFila(int fila) { this.fila = fila; }

    public int getColumna() { return columna; }
    public void setColumna(int columna) { this.columna = columna; }

    public double[] getMatriz() { return matriz; }
    public void setMatriz(double[] matriz) { this.matriz = matriz; }
}
