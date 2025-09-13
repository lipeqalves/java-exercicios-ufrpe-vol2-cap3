import java.util.Scanner;

/**
 * 3. Crie um programa em Java o qual permita que o usuário entre com o nome de
 * um aluno, e suas três notas. Para cada aluno, deve ser apresentada a média
 * aritmética de suas notas. Este procedimento deve ser repetido até ser fornecido como
 * nome do aluno do aluno a palavra “FIM”. Após este procedimento, deve ser
 * informado, respectivamente o nome e a média dos alunos com a melhor e a pior média
 * dentre os valores informados.
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            String[] nomeAluno = new String[3];
            double[] nota1 = new double[3];
            double[] nota2 = new double[3];
            double[] nota3 = new double[3];
            double[] media = new double[3];
            double maiorMedia = 0;
            String alunoMaiorMedia = "";
            double menorMedia = 100;
            String alunoMenorMedia = "";
            int encerraPrograma = 1;

            do {
                for (int i = 0; i < nota3.length; i++) {
                    System.out.println("Digite o nome do aluno: ");
                    nomeAluno[i] = teclado.next();
                    System.out.println("Digite a nota1: ");
                    nota1[i] = teclado.nextInt();
                    System.out.println("Digite a nota2: ");
                    nota2[i] = teclado.nextInt();
                    System.out.println("Digite a nota3: ");
                    nota3[i] = teclado.nextInt();

                    media[i] = (nota1[i] + nota2[i] + nota3[i]) / 3;
                }

                for (int i = 0; i < media.length; i++) {
                    if (maiorMedia <= media[i]) {
                        maiorMedia = media[i];
                        alunoMaiorMedia = nomeAluno[i];
                    }
                }
                for (int i = 0; i < media.length; i++) {
                    if (menorMedia > media[i]) {
                        menorMedia = media[i];
                        alunoMenorMedia = nomeAluno[i];
                    }
                }
                System.out.println("O Aluno, " + alunoMaiorMedia + " tem a maior media: " + maiorMedia );
                System.out.println("O Aluno, " + alunoMenorMedia + " tem a menor media: " + menorMedia);
                System.out.println("Digite 1 para continuar ou 0 para encerrar");
                encerraPrograma = teclado.nextInt();
            }while(encerraPrograma == 1);
        teclado.close();
    }
}

