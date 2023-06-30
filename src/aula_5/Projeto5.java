package aula_5;

import java.util.Scanner;

public class Projeto5 {

    public static void main(String[] args) {

        /**
         * Cálculo de Salário
         */
        Scanner sc = new Scanner(System.in);
        double salarioBruto;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o salário bruto para o cálculo:");
            salarioBruto = sc.nextDouble();
            System.out.printf("Salário digitado foi %.2f%n", salarioBruto);
            System.out.println("----------------------------------------------------------------------------------------");
        }

        sc.close();
    }
}
