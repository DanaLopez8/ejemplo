import java.time.LocalDate; // Importa la clase para manejo de fechas  
// Definición de atributos
public class Facturacion {
    // Definición de atributos
    private int idFacturacion;        // Identificador de la Factura
    private int idCliente;            // Identificador del cliente
    private int idServicios;          // Identificador del Servicio
    private LocalDate fecha;          // Fecha de creación de la Factura
    private double monto;             // Costo Factura

    // Constructor sin parámetros
    public Facturacion() {
        this.fecha = LocalDate.now();
    }

    // Constructor con parámetros
    public Facturacion(int idFacturacion, int idCliente, int idServicios, double monto) {
        this.idFacturacion = idFacturacion;
        this.idCliente = idCliente;
        this.idServicios = idServicios;
        this.monto = monto;
        this.fecha = LocalDate.now();
    }

    // Métodos Setters
    public void setIdFacturacion(int idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public void setMonto(double monto) { // Manteniendo "monto"
        this.monto = monto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Métodos Getters
    public int getIdFacturacion() {
        return idFacturacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public double getMonto() { // Manteniendo "monto"
        return monto;
    }

    public LocalDate getFecha() {
        return fecha; // Muestra la fecha de creación
    }
}  