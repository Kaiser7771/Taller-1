package Eric;
import Carlos.Persona;
import Carlos.Rol;
public class Paciente extends Persona {

    private String historial;

    public Paciente(String nombre, int cedula, int telefono, String historial, Rol rol) {
        super(nombre, cedula, telefono, rol);
        this.historial = historial;
        setRol(Rol.Paciente);
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
        return "\nPaciente: " + getNombre() +
                " \n| Cedula: " + getCedula() +
                " \n| Telefono: " + getTelefono() +
                " \n| Historial: " + getHistorial();
    }
}