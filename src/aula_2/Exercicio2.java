package aula_2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
        * [CT] - Exercício de controle de fluxo e Estruturas de repetições
        * https://forms.gle/tZJCfGEh8RYkyCWt8
        * */

        Scanner sc = new Scanner(System.in);

        /*
        Questao 1
        Crie um programa em Java que receba um número inteiro do usuário e
        verifique se ele é positivo, negativo ou igual a zero. Em seguida,
        exiba uma mensagem correspondente ao resultado.
        */
        System.out.println("Digite um número inteiro: ");
        if(sc.hasNextInt()) {
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Você digitou o número nulo: " + numero);
            } else if (numero > 0) { // positivo
                System.out.println("Você digitou um número positivo: " + numero);
            } else if (numero < 0) { // negativo
                System.out.println("Você digitou um número negativo: " + numero);
            }
        } else {
            System.out.println("Você não digitou um número inteiro válido");
        }

        /*
        Questao 2
        Crie um programa em Java que exiba a contagem de números pares de 0 até um
        número inteiro digitado pelo usuário. O programa deve utilizar uma estrutura de
        repetição (loop) para realizar a contagem.
        */
        System.out.println("Digite um número inteiro: ");
        if(sc.hasNextInt()) {
            int numero = sc.nextInt();

            if (numero >= 0) { // laço para numero inteiro positivo e nulo
                for (int i = 0; i <= numero; i += 2) {
                    System.out.println(i);
                }
            } else {
                for(int i = 0; i >= numero; i -= 2) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Você não digitou um número inteiro válido");
        }

        /*
        Questao 3
        Estrutura de Repetição com While
        Crie um programa em Java que solicite ao usuário que digite um número inteiro
        positivo. O programa deve utilizar uma estrutura de repetição while para
        exibir a sequência de números de 1 até o número digitado.
        */
        System.out.println("Digite um número inteiro: ");
        if(sc.hasNextInt()) {
            int numero = sc.nextInt();

            if (numero >= 1) {
                int i = 1;

                while(i <= numero) {
                    System.out.println(i);
                    i++;
                }
            } else {
                System.out.println("Você não digitou um número inteiro positivo");
            }
        } else {
            System.out.println("Você não digitou um número inteiro válido");
        }

        /*
        Questao 4
        Estrutura de Repetição com Do-While
        Crie um programa em Java que solicite ao usuário que adivinhe um número entre 1 e 10.
        O programa deve utilizar uma estrutura de repetição do-while para continuar
        solicitando ao usuário que tente adivinhar o número até que ele acerte.
        Crie uma variável que seja o "numero da sorte" que o usuário tenha que acertar.
        */
        int numeroDaSorte = 8;
        boolean acertouNumeroDaSorte = false;

        do {
            System.out.println("Digite seu palpite (1 até 10): ");
            int numero = sc.nextInt();

            if (numero == numeroDaSorte) {
                System.out.println("Você acertou o número da sorte!!");
                acertouNumeroDaSorte = true;
            } else {
                System.out.println("Tente novamente.");
            }

        } while(!acertouNumeroDaSorte);

        sc.close();
    }
}
