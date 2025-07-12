package Modelo;

public class Receta {

    private String medicamento;
    private int dosis;
    private int dias;

    public Receta(String medicamento, int dosis, int dias) {
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.dias = dias;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
