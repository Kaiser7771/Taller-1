package Carlos;


public class Medico extends Persona {
    String especialidad;
    String turno;
    Agenda agenda;

    public Medico(String nombre, int cedula, int telefono, Rol rol) {
        super(nombre, cedula, telefono, rol);
        setRol(Rol.Medico);
    }

    Agenda[] agendas = new Agenda[20];
    int totalCitas = 0;

    public void agregarCita(Agenda nuevaCita) throws HorarioDuplicadoException {

        for (int i = 0; i < totalCitas; i++) {

            if (agendas[i].getFecha().equals(nuevaCita.getFecha()) &&
                    agendas[i].getHora().equals(nuevaCita.getHora())) {

                throw new HorarioDuplicadoException("Horario duplicado");
            }
        }

        if (totalCitas < agendas.length) {
            agendas[totalCitas] = nuevaCita;
            totalCitas++;
        } else {
            System.out.println("La agenda del medico esta llena");
        }
    }


    @Override
    public String getInfo() {
        return "Medico: " + getNombre() +
                "Cedula: " + getCedula() +
                "Telefono: " + getTelefono();


    }

    public boolean validarMedico(Medico[] medicos, String nombre) {

        for (Medico medico : medicos) {

            if (medico != null && medico.getNombre().equals(nombre)) {
                return true;
            }

        }
        return false;
    }
    public Agenda[] getAgenda() {
        return agendas;
    }
}

