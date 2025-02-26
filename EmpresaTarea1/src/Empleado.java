import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private String id;
    private String telefono;
    private String correoElectronico;
    private String puesto;
    private String fechaContratacion;

    public Empleado(String nombre, String id, String telefono, String correoElectronico, String puesto, String fechaContratacion) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.puesto = puesto;
        this.fechaContratacion = fechaContratacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

}