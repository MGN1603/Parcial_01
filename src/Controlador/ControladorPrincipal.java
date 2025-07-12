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
        return listaPaciente.add(paciente);
    }

    public boolean agregarReceta(Paciente paciente, Receta receta) {
        return paciente.getRecetas().add(receta);
    }

    public Paciente buscarPaciente(int documento) {
        for (Paciente p : listaPaciente) {
            if (p.getDocumento() == documento) return p;
        }
        return null;
    }

    public boolean modificarDosis(Paciente paciente, Receta receta, int nuevaDosis) {
        if (nuevaDosis <= 0) return false;
        for (Receta r : paciente.getRecetas()) {
            if (r.equals(receta)) {
                r.setDosis(nuevaDosis);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarReceta(Paciente paciente, Receta receta) {
        return paciente.getRecetas().remove(receta);
    }

    public DefaultTableModel listarReceta(Paciente paciente) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Medicamento", "Dosis", "Días"});

        for (Receta r : paciente.getRecetas()) {
            modelo.addRow(new Object[]{
                paciente.getNombre(),
                r.getMedicamento(),
                r.getDosis(),
                r.getDias()
            });
        }

        return modelo;
    }
}



