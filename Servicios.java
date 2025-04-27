import java.time.LocalDate; // Importa la clase para manejo de fechas  

public class Servicios {
    // Definición de atributos
    private int idServicios;        // Identificador del servicio
    private int idCliente;          // Identificador del cliente
    private int idOperario;         // Identificador del operario
    private String descripcion;      // Descripción del servicio
    private double costo;            // Costo del servicio
    private LocalDate fecha;         // Fecha de creación del servicio
    private String mailCliente;      // Correo del cliente

    // Constructor sin parámetros
    public Servicios() {
        this.fecha = LocalDate.now(); // Inicializa la fecha con la fecha actual por defecto
    }

    // Constructor con parámetros
    public Servicios(int idServicios, int idCliente, int idOperario, String descripcion, double costo, String mailCliente) {
        this.idServicios = idServicios;
        this.idCliente = idCliente;
        this.idOperario = idOperario;
        this.descripcion = descripcion;
        this.costo = costo;
        this.fecha = LocalDate.now();
        this.mailCliente = mailCliente;
    }

    // Métodos Setters
    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    // Métodos Getters
    public int getIdServicios() {
        return idServicios;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public LocalDate getFecha() {
        return fecha; // Muestra la fecha de creación
    }

    public String getMailCliente() {
        return mailCliente;
    }
}  