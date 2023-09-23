public class Natal extends CartaoWEB implements CartaoWebInterface {
    public Natal(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Natal!";
    }
}