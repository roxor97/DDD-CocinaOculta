package co.com.sofka.CocinaOculta.Salida.value;

public class Destino {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private String telefono;
    private String email;
    private String longitud;

    public Destino(String nombre, String direccion, String ciudad, String pais, String codigoPostal, String telefono,
            String email, String latitud, String longitud) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.telefono = telefono;
        this.email = email;
        this.longitud = longitud;
    }
}
