public class Taller {
    private String nombre;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    public void asignarReparacion(Mecanico m, Reparacion r) {
        m.reparar(r);
    }
}