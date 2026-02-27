import java.io.Serializable;

public class InstrumentoFinanciero implements Serializable {
    private int id;
    private String nombre;
    private double precioActual;
    private int riesgo;

    public InstrumentoFinanciero(int id, String nombre, double precioActual, int riesgo) {
        this.id = id;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.riesgo = riesgo;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecioActual() { return precioActual; }
    public int getRiesgo() { return riesgo; }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }
}
