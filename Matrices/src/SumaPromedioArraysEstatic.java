/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gian
 */
public class SumaPromedioArraysEstatic {
    public void PromedioMatrix(){
        int[][] matrix;
        int promedio=0;
        matrix= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                       System.out.print("\t"+matrix[i][j]);
                       promedio=promedio+matrix[i][j];
            }
            System.out.println("");
        }
        System.out.println("\nEl Promedio de la matriz es:"+promedio/matrix.length+"\n");
    }
    public void sumadeMenMay(){
        int[][] matris={{1,2,3},{4,5,6},{7,8,9}};
        int sumaImp=0,sumaPar=0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                       System.out.print("\t"+matris[i][j]);
                       if(matris[i][j]%2!=0){
                           sumaImp=sumaImp+matris[i][j];
                       }else{
                           sumaPar=sumaPar+matris[i][j];
                       }
            }
            System.out.println("");
        }
        System.out.println("\nla suma de los numeros impares es: "+sumaImp);
        System.out.println("la suma de los numeros pares es: "+sumaPar);
        
    }
}
