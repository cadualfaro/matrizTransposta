/*
 Quebra-Cabeça 1: Calcular a transposta de uma matriz
 */
package quebracabeca1;
import java.util.Random;
import java.util.Arrays;
public class QuebraCabeca1 {

    public static void main(String[] args) {
        Random rand = new Random();
        
            int matriz [][] = new int[5][5];
            int transposta [][] = new int [5][5];
            
            for(int i=0;i<matriz.length;i++)
                for(int j=0;j<matriz[i].length;j++){
                    matriz [i][j] = rand.nextInt(15);
                }
            
            System.out.println("Matriz normal");
            for(int i=0; i<matriz.length;i++){
                    System.out.println(Arrays.toString(matriz[i]));
                }
            System.out.println();
            
            for(int i=0;i<matriz.length;i++)
                for(int j=0;j<matriz[i].length;j++){
                    if(i!=j)
                        transposta[i][j] = matriz[j][i];
                    else if(j==i)
                        transposta [i][j] = matriz[i][j];
                }
            
            System.out.println("Matriz transposta");
            for(int i=0;i<transposta.length;i++){
                    System.out.println(Arrays.toString(transposta[i]));
                }
            System.out.println();
                    }
    
}
