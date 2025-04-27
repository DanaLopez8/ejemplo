public class Operario {
    // Definición de atributos
    private int idOperario;
    private String nomOperario;
    private String cargo;
    private String telOperario;
    private String mailOperario;

    // Constructor sin parámetros
    public Operario() {
    }

    // Constructor con parámetros
    public Operario(int idOperario, String nomOperario, String cargo, String telOperario, String mailOperario) {
        this.idOperario = idOperario;
        this.nomOperario = nomOperario;
        this.cargo = cargo;
        this.telOperario = telOperario;
        this.mailOperario = mailOperario;
    }

    // Métodos Setters
    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public void setNomOperario(String nomOperario) {
        this.nomOperario = nomOperario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTelOperario(String telOperario) {
        this.telOperario = telOperario;
    }

    public void setMailOperario(String mailOperario) {
        this.mailOperario = mailOperario;
    }

    // Métodos Getters
    public int getIdOperario() {
        return idOperario;
    }

    public String getNomOperario() {
        return nomOperario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTelOperario() {
        return telOperario;
    }

    public String getMailOperario() {
        return mailOperario;
    }
}