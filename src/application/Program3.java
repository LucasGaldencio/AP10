package application;

import exceptions.EmBrancoException;
import exceptions.NomeJaExistenteException;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] sapatos = new String[3]; // Criado um array de tamanho 3

        /* Abaixo haverá um while para adição dos nomes de sapatos inseridos pelo usuário enquanto ele quiser adicionar, podendo acontecer algum desses erros:
            1 - chegará um momento que ele tentará adicionar e não terá sucesso pois já terá passado da última posição do array;
            2 - tentará inserir um nome em branco ();
            3 - tentará inserir um nome previamente já inserido. */
        int n = 0;
        try {
            while (true) {
                System.out.print("Insira o nome do sapato a ser adicionado à lista: ");
                String nome = sc.nextLine();
                adicionarNome(sapatos, n, nome);
                n++;
                System.out.print("Deseja adicionar mais um sapato (S/N)? ");
                char opcao = sc.next().charAt(0);
                sc.nextLine();
                if (opcao == 'N') {
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! " + e.getMessage());
        } catch (EmBrancoException e) {
            System.out.println("Erro! " + e.getMessage());
        } catch (NomeJaExistenteException e) {
            System.out.println("Erro! " + e.getMessage());
        }
    }

    public static void adicionarNome(String[] lista, int n, String nome) throws EmBrancoException, NomeJaExistenteException {
        if (n == lista.length) {
            throw new ArrayIndexOutOfBoundsException("Sem mais espaço para adicionar mais nomes!");
        }
        if (nome == ""){
            throw new EmBrancoException("Nome em branco!");
        }
        if (nomeExistente(lista, nome)) {
            throw new NomeJaExistenteException("Nome já existente!");
        }
        lista[n] = nome;
    }

    public static boolean nomeExistente(String[] lista, String nome) {
        for (int i=0;i<lista.length; i++) {
            if (lista[i] != null && lista[i].equals(nome)) {
                return true;
            }
        }
        return false;
    }

}
