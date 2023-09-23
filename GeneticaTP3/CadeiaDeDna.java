import java.util.Random;

public class CadeiaDeDna {
    private static final String PROTEINAS = "ACGT";

    public static String gerarCadeiaDeDna(int tamanho) {
        Random random = new Random();
        StringBuilder cadeia = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(PROTEINAS.length());
            char proteina = PROTEINAS.charAt(indice);
            cadeia.append(proteina);
        }

        return cadeia.toString();
    }
}
