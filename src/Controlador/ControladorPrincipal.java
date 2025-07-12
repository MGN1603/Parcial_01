package Controlador;

import Modelo.Paciente;
import Modelo.Receta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorPrincipal {

    private final ArrayList<Paciente> listaPaciente;

    public ControladorPrincipal() {
        this.listaPaciente = new ArrayList<>();
    }

    public ArrayList<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public boolean guardarPaciente(Paciente paciente) {
        listaPaciente.add(paciente);
        return true;

    }

    public boolean agregarReceta(Paciente paciente, Receta receta) {
        paciente.getRecetas().add(receta);
        return true;
    }

    public Paciente buscarPaciente(int documento) {
        for (int i = 0; i < listaPaciente.size(); i++) {
            if (listaPaciente.get(i).getDocumento() == documento) {
                return listaPaciente.get(i);
            }
        }
        return null;
    }

    public Receta recetaPaciente(Paciente paciente) {
        ArrayList<Receta> aux = paciente.getRecetas();
        for (int i = 0; i < aux.size(); i++) {
            return aux.get(i);
        }
        return null;
    }

    public boolean modificarDosis(Paciente paciente, Receta receta) {
        Receta buscar = recetaPaciente(paciente);
        if (buscar != null) {
            receta.setDosis(buscar.getDosis());
            return true;
        }
        return false;
    }

    public boolean eliminarReceta(Paciente paciente, Receta receta) {
        for (int i = 0; i < paciente.getRecetas().size(); i++) {
            if (paciente.getRecetas().get(i).equals(receta)) {
                paciente.getRecetas().get(i);
                return true;
            }
        }
        return false;
    }

    public DefaultTableModel listarReceta(Paciente paciente) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Medicamento", "Dosis", "Dias"});
        ArrayList<Receta> aux = paciente.getRecetas();
        for (int i = 0; i < aux.size(); i++) {
            modelo.addRow(new Object[]{
                paciente.getNombre(),
                aux.get(i).getMedicamento(),
                aux.get(i).getDosis(),
                aux.get(i).getDias()});           
        }
        return modelo;
    }
}
