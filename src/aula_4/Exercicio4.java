package aula_4;

import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
        * [CT]- Matrizes
        * https://forms.gle/kgukwAdpmXs1Q1eX8
         * */

        /*
        Questão 1
        Multiplicação de Matrizes
        Escreva um programa em Java que recebe duas matrizes como entrada:
        uma matriz de tamanho 2x3 e uma matriz de tamanho 3x2.
        O programa deve calcular o produto das duas matrizes e exibir a matriz resultante.
        Exemplo de entrada:

        Matriz 1:
        1 2 3
        4 5 6

        Matriz 2:
        7 8
        9 10
        11 12

        Saída esperada:
        Matriz resultante:
        58 64
        139 154
        */
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};

        int nMatrizProdutoLinhas = matriz1.length;
        int nMatrizProdutoColunas = matriz2[0].length;
        int[][] matrizProduto = new int[nMatrizProdutoLinhas][nMatrizProdutoColunas];

        System.out.println(matriz1.length + " " +  matriz1[0].length);
        System.out.println(matriz2.length + " " +  matriz2[0].length);

        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz2[0].length; j++) {
                for(int k = 0; k < matriz1[i].length; k++) {
//                    System.out.printf("%d %d %d %n", i + 1,j + 1,k + 1);
                    matrizProduto[i][j] = matrizProduto[i][j] + (matriz1[i][k] * matriz2[k][j]);

                }
            }
        }

        System.out.println(Arrays.deepToString(matrizProduto));

        /*
        Questão 2
        Transposição de Matriz
        Escreva um programa em Java que recebe uma matriz de tamanho
        4x3 como entrada e calcula a matriz transposta, ou seja,
        troca as linhas pelas colunas e exibe a matriz resultante.

        Exemplo de entrada:

        Matriz original:
        1 2 3
        4 5 6
        7 8 9
        10 11 12

        Saída esperada:
        Matriz transposta:
        1 4 7 10
        2 5 8 11
        3 6 9 12
        */
        int[][] matrizOriginal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] matrizTransposta = new int[matrizOriginal[0].length][matrizOriginal.length];

        for(int i = 0; i < matrizOriginal.length; i++) {
            for(int j = 0; j < matrizOriginal[0].length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrizTransposta));

    }
}
