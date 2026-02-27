import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Portafolio implements Serializable {
    private ArrayList<Inversion> inversiones;
    private Queue<Inversion> colaProcesamiento;

    public Portafolio() {
        inversiones = new ArrayList<>();
        colaProcesamiento = new LinkedList<>();
    }

    public void agregarInversion(Inversion inv) {
        inversiones.add(inv);
        colaProcesamiento.add(inv);
    }

    public void eliminarInversion(int instrumentoId) {
        Inversion aEliminar = null;
        for (Inversion inv : inversiones) {
            if (inv.getInstrumento().getId() == instrumentoId) {
                aEliminar = inv;
                break;
            }
        }
        if (aEliminar != null) {
            inversiones.remove(aEliminar);
            colaProcesamiento.remove(aEliminar);
        }
    }

    public double calcularTotalInvertido() {
        double total = 0;
        for (Inversion inv : inversiones) {
            total += inv.getMonto();
        }
        return total;
    }

    public Inversion procesarSiguienteInversion() {
        return colaProcesamiento.poll();
    }

    public ArrayList<Inversion> getInversiones() {
        return inversiones;
    }
}
