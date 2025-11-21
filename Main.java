import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pegando o nome do aluno
        System.out.print("Nome do aluno: ");
        String nome = entrada.nextLine();

        double[] notas = new double[8];
        double soma = 0;

        System.out.println("\nDigite as 8 notas do aluno " + nome + ":");

        // Lendo as notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        // Calculando médias
        double mediaBim1 = (notas[0] + notas[1]) / 2;
        double mediaBim2 = (notas[2] + notas[3]) / 2;
        double mediaBim3 = (notas[4] + notas[5]) / 2;
        double mediaBim4 = (notas[6] + notas[7]) / 2;

        double mediaSem1 = (mediaBim1 + mediaBim2) / 2;
        double mediaSem2 = (mediaBim3 + mediaBim4) / 2;
        double mediaFinal = (mediaSem1 + mediaSem2) / 2;

        // Mostrando resultados
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média 1º semestre: %.2f%n", mediaSem1);
        System.out.printf("Média 2º semestre: %.2f%n", mediaSem2);
        System.out.printf("Média final: %.2f%n", mediaFinal);

        // Verificando aprovação
        if (mediaFinal >= 7) {
            System.out.println("Situação: Aprovado! ");
        } else if (mediaFinal >= 5) {
            System.out.println("Situação: Recuperação ");
        } else {
            System.out.println("Situação: Reprovado ");
        }

        entrada.close();
    }
}
