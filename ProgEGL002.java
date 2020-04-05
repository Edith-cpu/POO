/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progegl002;

/**
 *
 * @author omarmora
 */
public class ProgEGL002 {

    public static void main(String[] args) {
        char[][] mat = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i || (i + j) == 4) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == 0 || i == 4) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) < 4 || (i + j) > 4) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");

        }
        // TODO code application logic here
    }