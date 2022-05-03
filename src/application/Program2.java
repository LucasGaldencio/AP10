package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] sapatos = new String[3]; // Criado um array de tamanho 3

        // Abaixo haverá um while para adição dos nomes de sapatos inseridos pelo usuário enquanto ele quiser adicionar, até que chegará um momento que ele tentará adicionar e não terá sucesso pois já terá passado da última posição do array
        int n = 0;
        while (true) {
            System.out.print("Insira o nome do sapato a ser adicionado à lista: ");
            String nome = sc.nextLine();
            sapatos[n] = nome;
            n++;
            System.out.print("Deseja adicionar mais um sapato (S/N)? ");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            if (opcao == 'N') {
                break;
            }
        }
    }
}
