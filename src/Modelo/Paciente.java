package Modelo;

import java.util.ArrayList;

public class Paciente {

    private int documento;
    private String nombre;
    private String historiaClinica;
    private ArrayList<Receta> recetas;

    public Paciente(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.recetas = new ArrayList<>();
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
}
