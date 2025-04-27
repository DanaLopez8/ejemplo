public class Proveedores {
    // Definición de atributos
    private int idProveedores;
    private String nomProveedores;
    private String dirProveedores;
    private String telProveedores;
    private String mailProveedores;

    // Constructor sin parámetros
    public Proveedores() {
    }

    // Constructor con parámetros
    public Proveedores(int idProveedores, String nomProveedores, String dirProveedores, String telProveedores, String mailProveedores) {
        this.idProveedores = idProveedores;
        this.nomProveedores = nomProveedores;
        this.dirProveedores = dirProveedores;
        this.telProveedores = telProveedores;
        this.mailProveedores = mailProveedores;
    }

    // Métodos Setters
    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public void setNomProveedores(String nomProveedores) {
        this.nomProveedores = nomProveedores;
    }

    public void setDirProveedores(String dirProveedores) {
        this.dirProveedores = dirProveedores;
    }

    public void setTelProveedores(String telProveedores) {
        this.telProveedores = telProveedores;
    }

    public void setMailProveedores(String mailProveedores) {
        this.mailProveedores = mailProveedores;
    }

    // Métodos Getters
    public int getIdProveedores() {
        return idProveedores;
    }

    public String getNomProveedores() {
        return nomProveedores;
    }

    public String getDirProveedores() {
        return dirProveedores;
    }

    public String getTelProveedores() {
        return telProveedores;
    }

    public String getMailProveedores() {
        return mailProveedores;
    }
}