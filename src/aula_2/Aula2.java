package aula_2;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade: ");
        char carac = scanner.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Char: " + carac);

        String fruta = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite nome de uma fruta:");
            fruta = scanner.nextLine();
            System.out.println(i + " Fruta: " + fruta);
        }

        scanner.close();
    }
}
