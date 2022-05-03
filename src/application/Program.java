package application;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Double[] valores = new Double[4]; // Criando um array de tamanho 4

        // Criando variáveis para adicionar ao array
        Double sapato1 = 450.0;
        Double sapato2 = 350.0;
        Double sapato3 = 700.0;

        // Preenchendo somente 3 dos 4 espaços do array com as variáveis criadas
        valores[0] = sapato1;
        valores[1] = sapato2;
        valores[2] = sapato3;

        // Somando o valor de todas as variáveis do vetor, que nesse caso são 3, mas ele irá tentar somar as 4 e assim dará o erro pois a última posição do array é nula
        Double valorTotal = 0.0;
        for (int i=0; i<valores.length; i++) {
            valorTotal += valores[i];
        }
    }
}
