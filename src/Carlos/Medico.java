package Carlos;
import Eric.Agenda;
import Eric.HorarioDuplicadoException;
public class Medico extends Persona {
    private String especialidad;
    private String turno;
    private Agenda[] agenda;
    int totalCitas= 0 ;

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Medico(String nombre, int cedula, long telefono, Rol rol) {
        super(nombre, cedula, telefono, rol);
        setRol(Rol.Medico);

        this.agenda = new Agenda[3];
    }


    public void agregarCita(Agenda nuevaCita) throws HorarioDuplicadoException {


        for (int i = 0; i < totalCitas; i++) {
            if (agenda[i].getFecha().equals(nuevaCita.getFecha()) &&
                    agenda[i].getHora().equals(nuevaCita.getHora())) {

                throw new HorarioDuplicadoException("Horario no disponible");
            }
        }


        if (totalCitas < agenda.length) {
            agenda[totalCitas] = nuevaCita;
            totalCitas++;
        } else {
            System.out.println("La agenda está llena");
        }
    }





    public boolean validarMedico (Medico[] medicos, String nombre) throws MedicoNoRegistradoException{

        for (Medico medico : medicos) {

            if (medico != null && medico.getNombre().equals(nombre)) {
                System.out.println("Medico confirmado");
                return true;
            }else{
                throw new MedicoNoRegistradoException(
                        "Error: Medico no registrado"
                );
            }

        }
return false;
    }

    public Agenda[] getAgenda() {
        return agenda;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String getTurno() {
        return turno;
    }

    @Override
    public String getInfo() {
        return "\nMedico: " + getNombre() +
                "\nCedula: " + getCedula() +
                "\nTelefono: " + getTelefono() +
                "\nEspecialidad: " + getEspecialidad() +
                "\nTurno: " + getTurno();


    }

}

