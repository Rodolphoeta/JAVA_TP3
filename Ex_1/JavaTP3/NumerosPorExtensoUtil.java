public class NumerosPorExtensoUtil {
    public static String numerosPorExtenso(int numero) {
        String[] extenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String resultado = "";

        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            int indice = Character.getNumericValue(numeroStr.charAt(i));
            resultado += extenso[indice];

            if (i != numeroStr.length() - 1) {
                resultado += ", ";
            }
        }

        return resultado;
    }
}
