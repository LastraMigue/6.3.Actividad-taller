import java.util.Date;

public class Factura {
    private String idFactura;
    private Date fecha;
    private double total;
    private Reparacion reparacion;

    public Factura(String idFactura, double total, Reparacion reparacion) {
        this.idFactura = idFactura;
        this.fecha = new Date();
        this.total = total;
        this.reparacion = reparacion;
    }
    
    public void emitir() {
    }
}