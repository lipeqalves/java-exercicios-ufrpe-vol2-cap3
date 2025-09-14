import java.util.Scanner;

/**
 * 5. Faça um programa que leia dois vetores de inteiros. Para cada vetor
 * pergunte o
 * número de elementos e depois entre com cada elemento do vetor. Somente após
 * estas entradas, devem ser apresentados quais são os elementos que fazem parte
 * dos dois vetores (vetor interseção).
 */
public class Cap3Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o tamho do vetor ");
        int tamanhoA = teclado.nextInt();
        int[] vetorA = new int[tamanhoA];
        System.out.println("Qual o tamho do vetor ");
        int tamanhoB = teclado.nextInt();
        int[] vetorB = new int[tamanhoB];
        int intersecaoIndex = 0;
        int tamanho;
        if (tamanhoA >= tamanhoB) {
            tamanho = tamanhoA;
        } else {
            tamanho = tamanhoB;
        }
        int[] vetorIntersecao = new int[tamanho];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um numero para o vetor A");
            vetorA[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite um numero para o vetor B");
            vetorB[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorIntersecao[j] = vetorB[j];
                    intersecaoIndex = intersecaoIndex + 1;
                }
            }
        }
        System.out.println("O vetor interseção é:");
        for (int i = 0; i < intersecaoIndex; i++) {
            System.out.println(vetorIntersecao[i]);
        }
        teclado.close();
    }
}
