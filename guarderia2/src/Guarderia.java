import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private String nombre;
    private String direccion;
    private String nit;
    private List<Estudiante> estudiantes;

    public Guarderia(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }


    public void eliminarEstudiante(String idEstudianteEliminar) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId().equals(idEstudianteEliminar)) {
                estudiantes.remove(i);
                System.out.println("Estudiante eliminado.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }


    public void modificarEstudiante(String idEstudianteBuscar, Estudiante estudianteModificado) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId().equals(idEstudianteBuscar)) {
                estudiantes.set(i, estudianteModificado);
                System.out.println("Estudiante modificado.");
                return;
            }
        }
    }
    public void crearEstudiantes(Estudiante nuevoEstudiante) {
        if (nuevoEstudiante == null) {
            System.out.println("Error: El estudiante está vacío.");
            return;
        }

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId().equals(nuevoEstudiante.getId())) {
                System.out.println("Error: Ya existe un estudiante con este ID.");
                return;
            }
        }

        estudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante agregado.");
    }

    public String mostrarListaEstudiantes() {
        if (estudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }
        StringBuilder lista = new StringBuilder();
        for (Estudiante estudiante : estudiantes) {
            lista.append(estudiante.toString()).append("\n");
        }
        return lista.toString();
    }
    public String mostrarListaEstudiantesMayores5() {
        StringBuilder lista = new StringBuilder();
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 5) {
                lista.append(e.toString()).append("\n");
            }
        }
        return lista.length() > 0 ? lista.toString() : "No hay estudiantes mayores de 5 años.";
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
