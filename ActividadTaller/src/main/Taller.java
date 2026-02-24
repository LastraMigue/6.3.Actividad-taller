public class Taller {
    private String nombre;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    // Dependencia puntual del Mecanico y la Reparacion
    public void asignarReparacion(Mecanico m, Reparacion r) {
        m.reparar(r);
    }
}