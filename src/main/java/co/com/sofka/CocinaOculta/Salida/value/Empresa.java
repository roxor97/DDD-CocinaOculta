package co.com.sofka.CocinaOculta.Salida.value;

public class Empresa {
        
        private String nombre;
        private String direccion;
        private String telefono;
        private String correo;
        
        public Empresa(String nombre, String direccion, String telefono, String correo) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.correo = correo;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public String getDireccion() {
            return direccion;
        }
        
        public String getTelefono() {
            return telefono;
        }
        
        public String getCorreo() {
            return correo;
        }
        
    
}
