public class Mecanico implements Especialista {
    private String idEmpleado;

    public Mecanico(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public void reparar(Reparacion r) {
    }
}