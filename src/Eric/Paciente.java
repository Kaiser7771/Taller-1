package Eric;

public class Paciente extends Persona {

    private String historial;

    public Paciente(String nombre, int cedula, int telefono, String historial) {
        super(nombre, cedula, telefono, Rol.Paciente);
        this.historial = historial;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public void solicitarCita(String descripcion) {
        System.out.println("El paciente " + getNombre() + " solicita cita: " + descripcion);
    }

    @Override
    public String getInfo() {
        return "Paciente: " + getNombre() +
                " | Cedula: " + getCedula() +
                " | Telefono: " + getTelefono() +
                " | Historial: " + getHistorial();
    }
}