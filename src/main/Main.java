package main;
import Carlos.*;

import java.time.LocalTime;

import Eric.Agenda;
import Eric.HorarioDuplicadoException;
import Eric.Paciente;
import java.util.Arrays;
public class Main {
    static void main(String[] args) throws HorarioDuplicadoException {
Medico medico1 = new Medico("Manuel Medrano", 65065090, 123, Rol.Medico);
medico1.setEspecialidad("Cirujano");
medico1.setTurno("6am-6pm");
        Agenda cita1 = new Agenda("20/03/2026", LocalTime.of(8, 0), "Control rutinario");
        medico1.agregarCita(cita1);

        Agenda cita2 = new Agenda("20/03/2026", LocalTime.of(10, 30), "Revision post operatorio");
        medico1.agregarCita(cita2);

        Agenda cita3 = new Agenda("20/03/2026", LocalTime.of(11, 30), "Revision oftalmologica");
        medico1.agregarCita(cita3);

        System.out.println(medico1.getInfo());
        System.out.println(Arrays.toString(medico1.getAgenda()));

        Medico medico2 = new Medico("Edwin Brito", 90, 22305, Rol.Medico);
        medico2.setEspecialidad("Senador");
        medico2.setTurno("24/7");

        Agenda cita4 = new Agenda("20/03/2026", LocalTime.of(11, 0), "Control rutinario");
        medico2.agregarCita(cita1);

        Agenda cita5 = new Agenda("20/03/2026", LocalTime.of(22, 30), "Revision post operatorio");
        medico2.agregarCita(cita2);

        Agenda cita6 = new Agenda("21/03/2026", LocalTime.of(23, 30), "Revision oftalmologica");
        medico2.agregarCita(cita3);

        Medico [] listaMedicos = new Medico []{medico1, medico2};

        medico1.validarMedico(listaMedicos, "Manuel Medrano");

        Tratamiento tratamiento1 = new Tratamiento("Examen de prostata", "Palpacion de la prostata por " +
                "via rectal", 100000);

      Factura factura1 = tratamiento1.generarFactura("Gustavo Petro", "Edwin Brito");
        System.out.println(factura1.getInfo());

        System.out.println(medico1.getInfo());
        System.out.println(medico2.getInfo());

        Paciente paciente1 = new Paciente("Erikito", 420, 104948302, "Fumador compulsivo de marihuana"
        , Rol.Paciente);

        System.out.println(paciente1.getInfo());

        paciente1.solicitarCita("Necesito dejar la marihuana urgente, me pillaron en la casa");





    }
}
