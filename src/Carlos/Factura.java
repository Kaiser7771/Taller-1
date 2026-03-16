package Carlos;

import java.time.LocalDate;

public class Factura {

    private LocalDate fecha;
    private String nombrePaciente;
    private String nombreMedico;
    private double valorTotal;
    private String tratamiento;

    public Factura(LocalDate fecha, String nombrePaciente, String nombreMedico, double valorTotal, String tratamiento) {
        this.fecha = fecha;
        this.nombrePaciente = nombrePaciente;
        this.nombreMedico = nombreMedico;
        this.valorTotal = valorTotal;
        this.tratamiento = tratamiento;
    }

    public String getInfo() {
        return "Fecha: " + fecha +
                "\nPaciente: " + nombrePaciente +
                "\nMedico: " + nombreMedico +
                "\nTratamiento: " + tratamiento +
                "\nValor Total: " + valorTotal;
    }
}