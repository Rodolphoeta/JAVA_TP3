public class IniciaisUtil {
    public static String obterIniciais(String nome) {
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        String[] palavras = nome.split(" ");
        String iniciais = "";

        for (String palavra : palavras) {
            boolean ehConector = false;
            for (String conector : conectores) {
                if (palavra.equalsIgnoreCase(conector)) {
                    ehConector = true;
                    break;
                }
            }

            if (!ehConector && !palavra.isEmpty()) {
                char inicial = Character.toUpperCase(palavra.charAt(0));
                iniciais += inicial;
            }
        }

        return iniciais;
    }
}
