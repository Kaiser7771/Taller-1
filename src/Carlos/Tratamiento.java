package Carlos;

import java.time.LocalDate;

public class Tratamiento {

    private String nombre;
    private String descripcion;
    private double valor;
    private Factura factura;

    public void registrarTratamiento(String nombre, String descripcion, double valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getInfo() {
        return "Nombre: " + nombre +
                "Descripcion: " + descripcion +
                "Valor: " + valor;
    }

    public Factura generarFactura(String nombrePaciente, String nombreMedico) {
        factura = new Factura(LocalDate.now(), nombrePaciente, nombreMedico, valor, nombre);
        return factura;
    }
}