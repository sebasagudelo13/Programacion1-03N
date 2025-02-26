public class Estudiante {
    private String nombre;
    private String id;
    private int edad;
    private String genero;
    private String nombreAcudiente;
    private String telefono;
    private String alergias;

    public Estudiante(String nombre, String id, int edad, String genero, String nombreAcudiente, String telefono, String alergias) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.nombreAcudiente = nombreAcudiente;
        this.telefono = telefono;
        this.alergias = alergias;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", telefono='" + telefono + '\'' +
                ", alergias='" + alergias + '\'' +
                '}';
    }
}
