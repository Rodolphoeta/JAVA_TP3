/* 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String input = scanner.nextLine();

        // a) Número de caracteres
        int numCaracteres = input.length();
        System.out.println("a) Número de caracteres: " + numCaracteres);

        // b) String em maiúsculo
        String maiuscula = input.toUpperCase();
        System.out.println("b) String em maiúsculo: " + maiuscula);

        // c) Número de vogais
        int numVogais = StringUtil.contarVogais(input);
        System.out.println("c) Número de vogais: " + numVogais);

        // d) Começa com "INF"
        boolean comecaComINF = input.toLowerCase().startsWith("inf");
        System.out.println("d) Começa com 'INF': " + comecaComINF);

        // e) Termina com "NET"
        boolean terminaComNET = input.toLowerCase().endsWith("net");
        System.out.println("e) Termina com 'NET': " + terminaComNET);

        // f) Número de dígitos
        int numDigitos = StringUtil.contarDigitos(input);
        System.out.println("f) Número de dígitos: " + numDigitos);

        // g) 2 primeiros dígitos
        String doisPrimeiros = input.substring(0, Math.min(input.length(), 2));
        System.out.println("g) 2 primeiros dígitos: " + doisPrimeiros);

        // h) É palíndromo
        boolean ehPalindromo = StringUtil.ehPalindromo(input);
        System.out.println("h) É palíndromo: " + ehPalindromo);

        scanner.close();
    }
}
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String input = scanner.nextLine();

        // a) Número de caracteres
        int numCaracteres = input.length();
        System.out.println("a) Número de caracteres: " + numCaracteres);

        // b) String em maiúsculo
        String maiuscula = input.toUpperCase();
        System.out.println("b) String em maiúsculo: " + maiuscula);

        // c) Número de vogais
        int numVogais = StringUtil.contarVogais(input);
        System.out.println("c) Número de vogais: " + numVogais);

        // d) Começa com "INF"
        boolean comecaComINF = input.toLowerCase().startsWith("inf");
        System.out.println("d) Começa com 'INF': " + comecaComINF);

        // e) Termina com "NET"
        boolean terminaComNET = input.toLowerCase().endsWith("net");
        System.out.println("e) Termina com 'NET': " + terminaComNET);

        // f) Número de dígitos
        int numDigitos = StringUtil.contarDigitos(input);
        System.out.println("f) Número de dígitos: " + numDigitos);

        // g) 2 primeiros dígitos
        String doisPrimeiros = input.substring(0, Math.min(input.length(), 2));
        System.out.println("g) 2 primeiros dígitos: " + doisPrimeiros);

        // h) É palíndromo
        boolean ehPalindromo = StringUtil.ehPalindromo(input);
        System.out.println("h) É palíndromo: " + ehPalindromo);

        // Pedir um número e imprimir seus dígitos por extenso
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        String numerosPorExtenso = NumerosPorExtensoUtil.numerosPorExtenso(numero);
        System.out.println("Resultado: " + numerosPorExtenso);

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();

        String iniciais = IniciaisUtil.obterIniciais(nome);
        System.out.println("i) Iniciais do nome: " + iniciais);

        scanner.close();
    }
}
