package aula_3;

import java.util.Arrays;
import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de itens?");

        int qtdeItens = sc.nextInt();
        String[] listaDeCompras = new String[qtdeItens];

        sc.nextLine();
//        for(int i = 0; i < listaDeCompras.length; i++) {
//            System.out.println("Digite uma fruta:");
//            listaDeCompras[i] = sc.nextLine();
//        }

        int contador = 0;
        char entrada = 'S';
        do {
            System.out.println("Digite o nome do item de supermecado que queira adicionar:");
            String item = sc.nextLine();
            listaDeCompras[contador++] = item;
            System.out.println("Quer adicionar mais um item? [S] [N]");
            entrada = sc.next().charAt(0);
            sc.nextLine(); // limpar buffer

//            if (entrada == 'N') {
//                break;
//            }
        } while (contador < listaDeCompras.length && entrada == 'S');


        System.out.println(Arrays.toString(listaDeCompras));

        sc.close();
    }
}
