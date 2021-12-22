package co.com.sofka.CocinaOculta.Salida.value;

public class SalidasId {
        
        private String id;
        
        public SalidasId(String id) {
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
            return "SalidasId [id=" + id + "]";
        }
        
    
}
