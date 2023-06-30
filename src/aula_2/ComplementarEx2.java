package aula_2;

import java.util.Scanner;

public class ComplementarEx2 {
    public static void main(String[] args) {

        /*
        * [CT] - Desafio do triângulo
        * https://forms.gle/m5mjthz4HN15Ap2VA
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numeroDigitado = sc.nextInt();

        System.out.println("Triângulo Retângulo:");
        for (int i = numeroDigitado; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n===========================");

        System.out.println("Triângulo Isósceles:");
        int metadeNumeroDigitado = numeroDigitado / 2;
        for (int i = 1; i <= numeroDigitado; i += 2) {
            int inicioAsterisco = metadeNumeroDigitado - i + (i / 2) + 1;
            if (inicioAsterisco < 0) {
                inicioAsterisco = 0;
            }
            for (int j = 0; j < numeroDigitado; j++) {

                if (j >= inicioAsterisco && j < inicioAsterisco + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
