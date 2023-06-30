package aula_5;

import java.util.Scanner;

public class Projeto5 {

    public static double calculoDescontoINSS(double salarioBruto) {
        double porcentagemDesconto = 0;
        /*
        * Salário	                % Desconto INSS
        * até 1.212,00	            7,5%
        * de 1212,01 até 2.427,35	9%
        * de 2.427,36 até 3.641,03	12%
        * de 3.641,04 até 7.087,22	14%
        * */

        if(salarioBruto <= 1212.00) {
            porcentagemDesconto = 0.075; // 7,5%
        } else if(salarioBruto >= 1212.01 && salarioBruto <= 2427.35) {
            porcentagemDesconto = 0.09; // 9%
        } else if(salarioBruto >= 2427.36 && salarioBruto <= 3641.03) {
            porcentagemDesconto = 0.12; // 12%

            // 14% valem para salários maiores que 7.087,22
        } else if(salarioBruto >= 3641.04) {
            porcentagemDesconto = 0.14; // 14%
        }

        return salarioBruto * porcentagemDesconto;
    }

    public static double calculoDescontoIR(double salarioBruto) {
        double porcentagemDesconto = 0;

        /*
         * Salário	                % Desconto Imposto de Renda
         * até 1.903,98	            0%
         * de 1.903,99 até 2.826,65	7,5%
         * de 2.826,66 até 3.751,05	15%
         * de 3.751,06 até 4.664,68	22,50%
         * Acima de 4.664,68	    27,50%
         * */

        if(salarioBruto <= 1903.98) {
            porcentagemDesconto = 0; // 0%
        } else if(salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            porcentagemDesconto = 0.075; // 7,5%
        } else if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            porcentagemDesconto = 0.15; // 15%
        } else if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            porcentagemDesconto = 0.225; // 22,5%
        } else if(salarioBruto > 4664.68) {
            porcentagemDesconto = 0.275; // 27,5%
        }

        return salarioBruto * porcentagemDesconto;
    }


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
            System.out.println(calculoDescontoINSS(salarioBruto));
            System.out.println(calculoDescontoIR(salarioBruto));
            System.out.println("----------------------------------------------------------------------------------------");
        }

        sc.close();
    }
}
