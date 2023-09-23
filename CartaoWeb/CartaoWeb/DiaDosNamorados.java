public class DiaDosNamorados extends CartaoWEB implements CartaoWebInterface {
    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Dia dos Namorados!";
    }
}