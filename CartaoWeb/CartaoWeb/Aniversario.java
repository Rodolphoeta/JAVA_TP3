public class Aniversario extends CartaoWEB implements CartaoWebInterface {
    public Aniversario(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "seu Aniversário!";
    }
}