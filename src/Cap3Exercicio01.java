/**
 * 1. Implemente um programa em Java que peça um número como entrada. Fornecido
 * este número, deve ser definido um vetor de inteiros e o usuário deve fornecer
 * valores para cada elemento do vetor. O programa deve fornecer: a soma de seus
 * elementos, o maior elemento e a média aritmética de seus elementos.
 */

import java.util.Scanner;
public class Cap3Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        double media = 0;
        int maior = 0;
        System.out.println("======================================\n");
        System.out.println("Qual o tamanho do vetor: ");
        int[] vetor = new int[teclado.nextInt()];
        System.out.println("======================================\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para posicao " + i + ": ");
            vetor[i] = teclado.nextInt();
        }
        System.out.println("======================================\n");
        for (int i = 0; i < vetor.length; i++) {
            //System.out.println(vetor[i]);
            soma = soma + vetor[i];
            media = soma/(double)vetor.length;
            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }
        System.out.println("A somoa é: " + soma);
        System.out.println("A media é: " + media);
        System.out.println("O maior numero é: " + maior);
        teclado.close();
    }
}
