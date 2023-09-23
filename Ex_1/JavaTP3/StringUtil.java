public class StringUtil {
    // Método para contar vogais
    public static int contarVogais(String texto) {
        
        int contador = 0;
        String vogais = "aeiouAEIOU";
        for (char c : texto.toCharArray()) {
            if (vogais.indexOf(c) != -1) {
                contador++;
        }
    }
    return contador;
    }

    // Método para contar dígitos
    public static int contarDigitos(String texto) {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                contador++;
            }
        }
        return contador;
    }
    

    // Método para verificar se é um palíndromo
    public static boolean ehPalindromo(String texto) {
        String reverso = new StringBuilder(texto).reverse().toString();
        return texto.equalsIgnoreCase(reverso);
    }
}
