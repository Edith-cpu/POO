/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contigencia3;

import java.util.Scanner;
/**
 *
 * @author garci
 */

public class Contigencia3 {
    
    static int[] array = new int[5];
    static Scanner SC = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insertarDatosArray();
        sumarArray();
        maxArray();
        promedioArray();
        ordenArray();
    }
    
    private static void insertarDatosArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("insertar array[" + i + "]:");
            array[i] = SC.nextInt();
        }
    }
    
    private static void sumarArray() {
        System.out.print("Suma: ");
        int acumulador = 0;
        for (int i = 0; i < array.length; i++) {
            acumulador = acumulador + array[i];
            System.out.print("+" + array[i]);
        }
        System.out.println("= " + acumulador);
    }
    
    private static void maxArray() {
        System.out.print("Maximo: ");
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
    
    private static void promedioArray() {
        System.out.print("Promedio: ");
        double promedio = 0;
        for (int i = 0; i < array.length; i++) {
            promedio = promedio + array[i];
        }
        promedio = promedio / array.length;
        System.out.println(promedio);
    }
    
    private static void ordenArray(){
        System.out.println("Ordenamiento: ");
        int i, j, aux;
        for(i = 0; i < array.length - 1; i++){
            for(j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        
        for(int k = array.length - 1; k >= 0; k--){
            System.out.println(array[k] + "");
        }
    }
    
}
    
    

