import java.util.Random;

public class AlgoritmosGeneticos {
    private static final String PROTEINAS = "ACGT";

    public static String[] recombinacao(String s1, String s2, int pontoCorte) {
        String[] filhos = new String[2];
        filhos[0] = s1.substring(0, pontoCorte) + s2.substring(pontoCorte);
        filhos[1] = s2.substring(0, pontoCorte) + s1.substring(pontoCorte);
        return filhos;
    }

    public static String mutacao(String cadeia) {
        Random random = new Random();
        int indiceMutacao = random.nextInt(cadeia.length());
        char novaProteina = PROTEINAS.charAt(random.nextInt(PROTEINAS.length()));
        return cadeia.substring(0, indiceMutacao) + novaProteina + cadeia.substring(indiceMutacao + 1);
    }
}
