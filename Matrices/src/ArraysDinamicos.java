
import java.util.Scanner;

public class ArraysDinamicos {
    public void PrimedioArrayDinamico() {
        System.out.println("\nPromedio de una Matriz");
        int promedio=0;
        int[][] mat;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        mat = new int[filas][columnas];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print("Ingrese componente "+f+"|"+c+" : ");
                mat[f][c] = teclado.nextInt();
                promedio=promedio+mat[f][c];
            }
        }
        System.out.println("\nEl promedio de los numeros es : "+promedio/mat.length);
    }
    public void SumaArrayDinamico() {
        System.out.println("\nSuma de Numeros Pares e Impares");
        int sumaImp=0,SumaPar=0;
        int[][] mat;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        mat = new int[filas][columnas];
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print("Ingrese componente "+f+"|"+c+" : ");
                mat[f][c] = teclado.nextInt();
                if(mat[f][c]%2!=0){
                    sumaImp=sumaImp+mat[f][c];
                }else{
                    SumaPar=SumaPar+mat[f][c];
                }
            }
        }
        System.out.println("\nLa suma de los impares es: "+sumaImp);
        System.out.println("La suma de los pares es: "+SumaPar);
    }
    
}
