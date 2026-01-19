import java.util.ArrayList;

public class HistorialFinanciero {

    private ArrayList<String> eventos;

    public HistorialFinanciero() {
        eventos = new ArrayList<>();
    }

    public void registrar(String evento) {
        eventos.add(evento);
    }

    public ArrayList<String> getEventos() {
        return eventos;
    }
}
