package aula_3;

import java.util.Arrays;

public class Exercicio3 {
    public static int comparaDoisNumerosRetornaMaior(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        /*
        * [CT] - Exercício de Arrays e Funções
        * https://forms.gle/hAobu4TVDVHXunR29
        * */

        int[] numeros = {5, 7, 10, 30, 4, 2, -1, 0, 9};

        /*
        Questao 1
        Escreva um programa que calcula a soma de todos os
        elementos de um array de inteiros.
        */
        int soma = 0;
        for(int elemento: numeros) {
            soma += elemento;
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Soma de todos elementos do Array é: " + soma);

        /*
        Escreva um programa que encontra o maior elemento
        em um array de inteiros.
        */
        int maiorElemento = numeros[0];
        for(int elemento: numeros) {
            /*if(elemento > maiorElemento) {
                maiorElemento = elemento;
            }*/
            maiorElemento = comparaDoisNumerosRetornaMaior(maiorElemento, elemento);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("O maior elemento do Array é: " + maiorElemento);

        /*
        Escreva um programa que verifica se um elemento
        está presente em um array de inteiros.
        */
        int elementoProcurado = 6;
        boolean encontrou = false;
        for(int i = 0; i < numeros.length && !encontrou; i++) {
            if(numeros[i] == elementoProcurado) {
                encontrou = true;
            }
        }
        System.out.println(Arrays.toString(numeros));
        if(encontrou) {
            System.out.printf("O elemento %d foi encontrado no Array.", elementoProcurado);
        } else {
            System.out.printf("O elemento %d não foi encontrado no Array.", elementoProcurado);
        }

    }
}
