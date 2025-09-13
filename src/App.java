
// Importa a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);
        int opcao; // Variável para armazenar a opção escolhida

        // Estrutura de repetição para exibir o menu até o usuário escolher sair
        do {
            System.out.println("\n===== MENU DE EXERCÍCIOS VOL 2 CAP 3=====");
            System.out.println("1 - Exercício 01");
            System.out.println("2 - Exercício 02");
            System.out.println("3 - Exercício 03");
            System.out.println("4 - Exercício 04");
            System.out.println("5 - Exercício 05");
            System.out.println("6 - Exercício 06");
            System.out.println("7 - Exercício 07");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção digitada pelo usuário
            opcao = scanner.nextInt();

            // Estrutura switch para executar o exercício escolhido
            switch (opcao) {
                case 1:
                    // Chama o método main da classe Exercicio01
                    Exercicio01.main(new String[]{});
                    break;
                case 2:
                    Exercicio02.main(new String[]{});
                    break;
                case 3:
                    Exercicio03.main(new String[]{});
                    break;
                case 4:
                    Exercicio04.main(new String[]{});
                    break;
                case 5:
                    Exercicio05.main(new String[]{});
                    break;
                case 6:
                    Exercicio06.main(new String[]{});
                    break;
                case 7:
                    Exercicio07.main(new String[]{});
                    break;
                case 0:
                    // Sai do programa
                    System.out.println("Saindo...");
                    break;
                default:
                    // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0); // Repete até o usuário escolher sair

        // Fecha o Scanner
        scanner.close();
    }
}

