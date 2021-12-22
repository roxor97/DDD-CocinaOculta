package co.com.sofka.CocinaOculta.Salida.value;

public class TransporteId {
        
        private String id;
        
        public TransporteId(String id) {
            this.id = id;
        }
        
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }
        
        @Override
        public String toString() {
            return "TransporteId [id=" + id + "]";
        }
    
}
