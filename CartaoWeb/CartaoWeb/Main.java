import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<CartaoWebInterface> cartoes = new LinkedList<>();

        CartaoWebInterface cartao1 = new DiaDosNamorados("rodolpho@gmail.com", "Rodolpho");
        CartaoWebInterface cartao2 = new Natal("nathalia@gmail.com", "Nathalia");
        CartaoWebInterface cartao3 = new Aniversario("Igor@gmail.com", "Igor");
        CartaoWebInterface cartao4 = new Pascoa("leo.gmail.com", "Leo");

        cartoes.add(cartao1);
        cartoes.add(cartao2);
        cartoes.add(cartao3);
        cartoes.add(cartao4);

        for (CartaoWebInterface cartao : cartoes) {
            System.out.println("Mensagem para: " + ((CartaoWEB) cartao).getEmail());
            System.out.println("Parabéns, " + ((CartaoWEB) cartao).getNome() + " pelo " + cartao.showMessage());
            System.out.println();
        }
    }
}
