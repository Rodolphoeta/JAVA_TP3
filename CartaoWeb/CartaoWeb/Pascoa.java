public class Pascoa extends CartaoWEB implements CartaoWebInterface {
    public Pascoa(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Páscoa!";
    }
}
