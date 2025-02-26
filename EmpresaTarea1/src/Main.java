import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();


        listaEmpleados.add(new Empleado("101", "Sofía López", "Gerente de RRHH", "sofia@email.com", "3201234567", "01/02/2023"));


        String resultado = "Lista de empleados:\n";
        for (int i = 0; i < listaEmpleados.size(); i++) {
            resultado +=  "Nombre: " + listaEmpleados.get(i).getNombre() + "\n" +
                    "ID: " + listaEmpleados.get(i).getId() + "\n" +
                    "Teléfono: " + listaEmpleados.get(i).getTelefono() + "\n" +
                    "Puesto: " + listaEmpleados.get(i).getPuesto() + "\n" +
                    "Correo: " + listaEmpleados.get(i).getCorreoElectronico() + "\n" +
                    "Fecha de contratación: " + listaEmpleados.get(i).getFechaContratacion() + "\n";

        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}