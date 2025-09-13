import java.util.Scanner;

/**
 * 2. Implemente um programa em Java que peça um número como entrada. Fornecido
 * este número, deve ser definido dois vetores: um de strings e outro de notas,
 * com
 * o número de elementos igual ao definido pelo número fornecido pelo usuário.
 * Crie um laço em permite que o usuário entre com dados para cada elemento de
 * cada um dos vetores. Depois, o programa deve perguntar o nome de um aluno.
 * De acordo com o nome fornecido deve ser apresentada a nota deste aluno. Esta
 * consulta deve se repetir até que se forneça a palavra “FIM” como nome do
 * aluno.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos para cadastro: ");
        int tamanho = teclado.nextInt();
        int[] notas = new int[tamanho];
        String[] nomes = new String[tamanho];
        String aluno;

        boolean alunoEncontrado = false;
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomes[i] = teclado.next();
            System.out.println("Digite a nota: ");
            notas[i] = teclado.nextInt();
        }

        do {
            System.out.println("Consultar");
            System.out.println("Digite o nome do aluno, ou digite FIM para encerrar a consulta");
            aluno = teclado.next();
            if (!aluno.equalsIgnoreCase("FIM")) {
                System.out.println("Buscando...");
            }
            for (int i = 0; i < tamanho; i++) {
                if (aluno.compareToIgnoreCase(nomes[i]) == 0) {
                    System.out.println("Aluno " + nomes[i] + ", Nota " + notas[i]);
                    alunoEncontrado = true;
                    break;
                }
            }
            if(!alunoEncontrado){
                System.out.println("Aluno nao encontrado");
            }

        }while(!aluno.equalsIgnoreCase("FIM"));
        teclado.close();
    }
}
