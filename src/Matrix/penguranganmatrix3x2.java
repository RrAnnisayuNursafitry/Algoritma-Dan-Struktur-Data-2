/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

/**
 *
 * @author Lenovo
 */
public class penguranganmatrix3x2 {
    public static void main(String[] args) {
        int [][] A = {
            {56, 72},
            {32, 64},
            {89, 75}
        };
        int [][] B = {
            {9, 8},
            {6, 5},
            {3, 2}
        };
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length] [A[0].length];
            for(int i=0; i<A[0].length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j];
                }
        }
            for(int[]c: C){
                for(int q: c){
                    System.out.print(q+ " ");
                }
                System.out.println();
            }
        }
        System.out.println("Rr Annisa Ayu Nursafitri");
            
    

            
        
        }
    }
    

