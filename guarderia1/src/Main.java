import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes que quiere registrar: "));

        for (int i = 0; i < n; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String id = JOptionPane.showInputDialog("Ingrese el número de identificacion: ");
            String edad = JOptionPane.showInputDialog("Ingrese la edad del estudiante: ");
            String genero = JOptionPane.showInputDialog("Ingrese el género: ");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente: ");
            String telefono = JOptionPane.showInputDialog("Ingrese número de contacto: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");

            Estudiante newEstudiante = new Estudiante(nombre, id, edad, genero, nombreAcudiente, telefono, alergias);

            listaEstudiantes.add(newEstudiante);
        }

        String resultado = "Lista de estudiantes:\n";
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            resultado += "Nombre: " + listaEstudiantes.get(i).getNombre() + "\n" +
                    "ID: " + listaEstudiantes.get(i).getId() + "\n" +
                    "Edad: " + listaEstudiantes.get(i).getEdad() + "\n" +
                    "Género: " + listaEstudiantes.get(i).getGenero() + "\n" +
                    "Nombre del acudiente: " + listaEstudiantes.get(i).getNombreAcudiente() + "\n" +
                    "Teléfono: " + listaEstudiantes.get(i).getTelefono() + "\n" +
                    "Alergias: " + listaEstudiantes.get(i).getAlergias() + "\n";

        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

