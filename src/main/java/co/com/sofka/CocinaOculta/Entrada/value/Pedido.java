package co.com.sofka.CocinaOculta.Entrada.value;

public class Pedido {
    private Fecha fecha;
    private EntradaId entradaId;
    private ClienteId clienteId;

    public Pedido(Fecha fecha, EntradaId entradaId, ClienteId clienteId) {
        this.fecha = fecha;
        this.entradaId = entradaId;
        this.clienteId = clienteId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public EntradaId getEntradaId() {
        return entradaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
    
}
