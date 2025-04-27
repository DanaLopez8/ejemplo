public class Cliente {
       // Definición de atributos
       private int idCliente;
       private String nomCliente;
       private String dirCliente;
       private String telCliente;
       private String mailClient;

       // Constructor sin parámetros
       public Cliente() {
       }

       // Constructor con parámetros
       public Cliente(int idCliente, String nomCliente, String dirCliente, String telCliente, String mailClient) {
              this.idCliente = idCliente;
              this.nomCliente = nomCliente;
              this.dirCliente = dirCliente;
              this.telCliente = telCliente;
              this.mailClient = mailClient;
       }

       // Métodos Setters
       public void setIdCliente(int idCliente) {
              this.idCliente = idCliente;
       }

       public void setNomCliente(String nomCliente) {
              this.nomCliente = nomCliente;
       }

       public void setDirCliente(String dirCliente) {
              this.dirCliente = dirCliente;
       }

       public void setTelCliente(String telCliente) {
              this.telCliente = telCliente;
       }

       public void setMailClient(String mailClient) {
              this.mailClient = mailClient;
       }

       // Métodos Getters
       public int getIdCliente() {
              return idCliente;
       }

       public String getNomCliente() {
              return nomCliente;
       }

       public String getDirCliente() {
              return dirCliente;
       }

       public String getTelCliente() {
              return telCliente;
       }

       public String getMailClient() {
              return mailClient;
       }
}