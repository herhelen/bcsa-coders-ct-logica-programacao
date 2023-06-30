package aula_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aula4 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][2];
        int[][] matrizPreenchida = {{1, 2}, {3}};

        System.out.println(Arrays.deepToString(matrizPreenchida));

        for(int i = 0; i < matrizPreenchida.length; i++) {
            for(int j = 0; j < matrizPreenchida[i].length; j++) {
                System.out.print(matrizPreenchida[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(matriz));

        /* Soma de 2 Matrizes */
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int nLinhas = matrizA.length;
        int nColunas = matrizA[0].length;

        int[][] matrizResultado = new int[nLinhas][nColunas];

        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrizResultado));
    }
}
