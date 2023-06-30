package aula_5;

import java.util.Scanner;

public class Projeto5 {

    public static double calculaDescontoINSS(double salarioBruto) {
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

    public static double calculaDescontoIR(double salarioBruto) {
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

    public static void imprimeValoresFormatados(double[][] valores) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Os valores calculados de acordo com os 5 salários brutos dados:");
        System.out.printf("|%5s|%15s|%15s|%15s|%15s|%n", "LINHA", "SALARIO BRUTO", "DESCONTO INSS", "DESCONTO IR",
                "SALARIO LIQUIDO");

        for(int i = 0; i < valores.length; i++) {
            System.out.printf("|%5d", i + 1);
            for(int j = 0; j < valores[i].length; j++) {
                System.out.printf("|R$ %12.2f", valores[i][j]);
            }
            System.out.printf("|%n");
        }
    }

    public static void main(String[] args) {

        /*
         * Projeto: Cálculo de Salário
         * */
        Scanner sc = new Scanner(System.in);
        double salarioBruto, descontoINSS, descontoIR, descontos, salarioLiquido;
        double[][] valoresSalarios = new double[5][4];

        System.out.println("Para o início do cálculo de salário, digite 5 salários brutos.");

        for(int i = 0; i < 5; i++) {
            System.out.printf("Digite o salário bruto para o cálculo (%d/5):%n", i);
            salarioBruto = sc.nextDouble();

            // cálculo dos valores de desconto e do salário líquido
            descontoINSS = calculaDescontoINSS(salarioBruto);
            descontoIR = calculaDescontoIR(salarioBruto);
            descontos = descontoINSS + descontoIR;
            salarioLiquido = salarioBruto - descontos;

            // guardando os valores calculados na matriz
            valoresSalarios[i][0] = salarioBruto;
            valoresSalarios[i][1] = descontoINSS;
            valoresSalarios[i][2] = descontoIR;
            valoresSalarios[i][3] = salarioLiquido;
        }

        /*
         * Casos de teste:
         * Salario Bruto    INSS        % INSS  IR           % IR   Salario Liquido
         * R$ 455,69        R$ 34,18      7,5%  R$ 0,00       0,0%  R$ 421,51
         * R$ 2.315,99      R$ 208,44     9,0%  R$ 173,70     7,5%  R$ 1.933,85
         * R$ 3.581,11      R$ 429,73    12,0%  R$ 537,17    15,0%  R$ 2.614,21
         * R$ 4.545,45      R$ 636,36    14,0%  R$ 1.022,73  22,5%  R$ 2.886,36
         * R$ 15.888,88     R$ 2.224,44  14,0%  R$ 4.369,44  27,5%  R$ 9.294,99
         * */
        imprimeValoresFormatados(valoresSalarios);

        sc.close();
    }
}
