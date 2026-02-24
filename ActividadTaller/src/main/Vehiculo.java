import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected List<Reparacion> historialReparaciones;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.historialReparaciones = new ArrayList<>();
    }

    public void agregarReparacion(Reparacion r) {
    }
}