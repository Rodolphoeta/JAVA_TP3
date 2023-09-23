import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da cadeia:");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        String cadeia1 = CadeiaDeDna.gerarCadeiaDeDna(tamanho);
        String cadeia2 = CadeiaDeDna.gerarCadeiaDeDna(tamanho);

        System.out.println("Cadeia 1: " + cadeia1);
        System.out.println("Cadeia 2: " + cadeia2);

        System.out.println("Fator de corte da combinação:");
        int pontoCorte = scanner.nextInt();
        scanner.nextLine();

        String[] filhos = AlgoritmosGeneticos.recombinacao(cadeia1, cadeia2, pontoCorte);
        System.out.println("Resultado da combinação:");
        System.out.println(filhos[0]);
        System.out.println(filhos[1]);

        System.out.println("=============================");

        String cadeiaMutada = AlgoritmosGeneticos.mutacao(cadeia1);
        System.out.println("Resultado mutação:");
        System.out.println("Índice Aleatório na mutação: " + cadeiaMutada);

    }
}
