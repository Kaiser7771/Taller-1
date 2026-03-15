package Carlos;

public abstract class Persona {
    private String nombre;
    private int cedula;
    private int telefono;
    private Rol rol;

    public Persona(String nombre, int cedula, int telefono, Rol rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.rol = rol ;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public Rol getRol() {
        return rol;
    }

    public int getTelefono() {
        return telefono;
    }
    public abstract String getInfo();
}

