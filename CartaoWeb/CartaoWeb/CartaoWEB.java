public class CartaoWEB {
    private String email;
    private String nome;

    public CartaoWEB(String email, String nome) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            this.email = "email invalido";
        }
        this.nome = nome;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}
