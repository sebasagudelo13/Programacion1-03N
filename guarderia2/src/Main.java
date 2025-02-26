import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Pequeños Gigantes", "Calle 123", "123456-7");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String genero = JOptionPane.showInputDialog("Ingrese el género del estudiante:");
        String alergias = JOptionPane.showInputDialog("Ingrese las alergias del estudiante (si tiene):");
        String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del acudiente:");


        Estudiante estudiante = new Estudiante(nombre, id, edad, genero, nombreAcudiente, telefono, alergias);


        guarderia.crearEstudiantes(estudiante);
        JOptionPane.showMessageDialog(null, "Lista de estudiantes registrados:\n" + guarderia.mostrarListaEstudiantes());
        JOptionPane.showMessageDialog(null, "Lista de estudiantes mayores de 5 años:\n" + guarderia.mostrarListaEstudiantesMayores5());
    }
}
