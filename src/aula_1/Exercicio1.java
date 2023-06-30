package aula_1;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        * [CT] - Exercício de OA e outputs
        * https://forms.gle/MJ3igtvuYChszKWT9
        * */

        /* Questão 1
        Área do Círculo
        A fórmula para calcular a área de uma circunferência é: area = π . raio².
        Considerando para este problema que π = 3.14159:
        - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

        Entrada
        Neste exercício a entrada será atribuída diretamente a variável.
        Considere a variável raio como um valor de ponto flutuante(dupla precisão)

        Saída
        Apresentar a mensagem "A=" seguido pelo valor da variável area, com 4 casas após
        o ponto decimal. Utilize variáveis de dupla precisão (double).
        */
        double raio = 2;
        // declarar como constante usando final
        // double pi = 3.14159;
        final double PI = 3.14159;
        System.out.printf("A=%.4f%n", raio * raio * PI);

        /* Questão 2
        Salário
        Escreva um programa que tenha o número de matrícula de um funcionário,
        seu número de horas trabalhadas, o valor que recebe por hora e calcula o
        salário desse funcionário. A seguir, mostre o número da matrícula e o
        salário do funcionário, com duas casas decimais.

        Entrada
        Neste exercício a entrada será atribuída diretamente a variável.
        O programa contém 2 números inteiros e 1 número com duas casas decimais,
        representando o número da matricula, quantidade de horas trabalhadas e
        o valor que o funcionário recebe por hora trabalhada, respectivamente.

        Saída
        Imprima o número da matrícula e o salário do funcionário, conforme exemplo
        fornecido, com um espaço em branco antes e depois da igualdade.
        No caso do salário, também deve haver um espaço em branco após o R$.

        Exemplo de entrada:
        123
        100
        5.50

        Exemplo de saída:
        Matrícula = 123
        Salário = R$ 550.00
        * */
        String matricula = "123";
        int horas = 100;
        double valor = 5.50;
        System.out.printf("Matrícula = %s%nSalário = R$ %.2f%n", matricula, horas * valor);

        /* Questão 3
        Salário com Bônus

        Escreva um programa que tenha o nome de um vendedor, o seu salário fixo
        e o total de vendas efetuadas por ele no mês (em dinheiro).
        Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
        informar o total a receber no final do mês, com duas casas decimais.

        Entrada
        Neste exercício a entrada será atribuída diretamente a variável.
        O programa contém um texto (primeiro nome do vendedor) e
        2 valores de dupla precisão (double) com duas casas decimais,
        representando o salário fixo do vendedor e montante
        total das vendas efetuadas por este vendedor, respectivamente.

        Saída
        Imprima o total que o funcionário deverá receber,
        conforme exemplo fornecido.

        Exemplo de entrada:
        Jose
        500.00
        1230.30

        Exemplo de saída:
        TOTAL = R$ 684.54
        * */
        String nome = "Jose";
        double salarioFixo = 500.00;
        double montanteVendas = 1230.30;
        double porcentagemComissao = 0.15;
        System.out.printf("TOTAL = R$ %.2f%n", salarioFixo + (montanteVendas * porcentagemComissao));

    }
}