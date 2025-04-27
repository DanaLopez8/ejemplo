public class Servicios_Proveedores {
    // Definición de atributos
    private int idServicios_Proveedores;
    private int idServicios;
    private int idProveedores;
    private String descripcion;

    // Constructor sin parámetros
    public Servicios_Proveedores() {}

    // Métodos Setters
    public void setIdServicios_Proveedores(int idServicios_Proveedores) {
        this.idServicios_Proveedores = idServicios_Proveedores;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos Getters
    public int getIdServicios_Proveedores() {
        return idServicios_Proveedores;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public String getDescripcion() {
        return descripcion;
    }
}