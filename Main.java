import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to my first message in Java");

        // Crear y mostrar datos del Cliente 1
        Cliente objCliente = new Cliente();
        objCliente.setIdCliente(100);
        objCliente.setNomCliente("Drogbag");
        objCliente.setDirCliente("Impeldown");
        objCliente.setTelCliente("9876543");
        objCliente.setMailClient("talkback@bag.com");

        System.out.println("\nDatos del Cliente 1:");
        System.out.println("Cédula del Cliente: " + objCliente.getIdCliente());
        System.out.println("Nombre Cliente: " + objCliente.getNomCliente());
        System.out.println("Dirección Cliente: " + objCliente.getDirCliente());
        System.out.println("Teléfono Cliente: " + objCliente.getTelCliente());
        System.out.println("Email Cliente: " + objCliente.getMailClient());

        // Crear y mostrar datos del Cliente 2
        Cliente objCliente2 = new Cliente(200, "Tutancamon", "PiramStreet", "+157311009540", "tucamon@acme.com");

        System.out.println("\nDatos del Cliente 2:");
        System.out.println("Cédula del Cliente: " + objCliente2.getIdCliente());
        System.out.println("Nombre Cliente: " + objCliente2.getNomCliente());
        System.out.println("Dirección Cliente: " + objCliente2.getDirCliente());
        System.out.println("Teléfono Cliente: " + objCliente2.getTelCliente());
        System.out.println("Email Cliente: " + objCliente2.getMailClient());

        // Crear y mostrar datos del Servicio
        Servicios objServicios = new Servicios();
        objServicios.setIdServicios(10);
        objServicios.setIdCliente(100);
        objServicios.setIdOperario(456);
        objServicios.setDescripcion("TIPO DE ATAUD TRES CLASES");
        objServicios.setCosto(999.99);

        System.out.println("\nDatos del Servicio:");
        System.out.println("ID del Servicio: " + objServicios.getIdServicios());
        System.out.println("ID del Cliente: " + objServicios.getIdCliente());
        System.out.println("ID del Operario: " + objServicios.getIdOperario());
        System.out.println("Descripción: " + objServicios.getDescripcion());
        System.out.println("Costo: $" + objServicios.getCosto());

        // Crear y mostrar datos del Proveedor
        Proveedores objProveedor = new Proveedores();
        objProveedor.setIdProveedores(1);
        objProveedor.setNomProveedores("Proveedor A");
        objProveedor.setDirProveedores("Dirección A");
        objProveedor.setTelProveedores("123456789");
        objProveedor.setMailProveedores("proveedorA@example.com");

        System.out.println("\nDatos del Proveedor:");
        System.out.println("ID del Proveedor: " + objProveedor.getIdProveedores());
        System.out.println("Nombre del Proveedor: " + objProveedor.getNomProveedores());
        System.out.println("Dirección del Proveedor: " + objProveedor.getDirProveedores());
        System.out.println("Teléfono del Proveedor: " + objProveedor.getTelProveedores());
        System.out.println("Email del Proveedor: " + objProveedor.getMailProveedores());

        // Crear y mostrar datos de Servicios_Proveedores
        Servicios_Proveedores objServiciosProveedores = new Servicios_Proveedores();
        objServiciosProveedores.setIdServicios_Proveedores(1);
        objServiciosProveedores.setIdServicios(10);
        objServiciosProveedores.setIdProveedores(1);
        objServiciosProveedores.setDescripcion("Servicio para Proveedor A");

        System.out.println("\nDatos de Servicios_Proveedores:");
        System.out.println("ID de Servicios_Proveedores: " + objServiciosProveedores.getIdServicios_Proveedores());
        System.out.println("ID del Servicio: " + objServiciosProveedores.getIdServicios());
        System.out.println("ID del Proveedor: " + objServiciosProveedores.getIdProveedores());
        System.out.println("Descripción: " + objServiciosProveedores.getDescripcion());

        // Crear y mostrar datos de Operario
        Operario objOperario = new Operario();
        objOperario.setIdOperario(456);
        objOperario.setNomOperario("Juan Pérez");
        objOperario.setCargo("Técnico");
        objOperario.setTelOperario("987654321");
        objOperario.setMailOperario("juan.perez@arquimad.com");

        System.out.println("\nDatos del Operario:");
        System.out.println("ID del Operario: " + objOperario.getIdOperario());
        System.out.println("Nombre del Operario: " + objOperario.getNomOperario());
        System.out.println("Cargo del Operario: " + objOperario.getCargo());
        System.out.println("Teléfono del Operario: " + objOperario.getTelOperario());
        System.out.println("Email del Operario: " + objOperario.getMailOperario());

        // Crear y mostrar datos de Facturación
        Facturacion objFacturacion = new Facturacion();
        objFacturacion.setIdFacturacion(1);
        objFacturacion.setIdCliente(100);
        objFacturacion.setIdServicios(10);  // Asegúrate de definir el servicio
        objFacturacion.setMonto(999.99);     // Usando 'monto' como has definido
        objFacturacion.setFecha(LocalDate.now()); // Puedes usar el setter o simplemente la fecha actual.

        System.out.println("\nDatos de Facturación:");
        System.out.println("ID de Facturación: " + objFacturacion.getIdFacturacion());
        System.out.println("ID del Cliente: " + objFacturacion.getIdCliente());
        System.out.println("ID del Servicio: " + objFacturacion.getIdServicios());
        System.out.println("Monto: $" + objFacturacion.getMonto());
        System.out.println("Fecha: " + objFacturacion.getFecha());
    }
}