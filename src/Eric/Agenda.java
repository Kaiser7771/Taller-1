package Eric;

import java.time.LocalTime;

public class Agenda {

    private String fecha;
    private LocalTime hora;
    private String descripcion;

    public Agenda(String fecha, LocalTime hora, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInfo() {
        return "Fecha: " + fecha +
                " | Hora: " + hora +
                " | Descripcion: " + descripcion;
    }

    public void validarHorario(Agenda[] agendas) throws HorarioDuplicadoException {

        for (int i = 0; i < agendas.length; i++) {

            if (agendas[i] != null) {

                if (agendas[i].getFecha().equals(this.fecha) &&
                        agendas[i].getHora().equals(this.hora)) {

                    throw new HorarioDuplicadoException(
                            "Error: el horario ya esta ocupado"
                    );
                }
            }
        }
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
