import java.util.ArrayList;

public class Historial {

    private ArrayList<String> eventos;
    private ArrayList<String> eventosInversionista;

    public Historial() {
        eventos = new ArrayList<>();
        eventosInversionista = new ArrayList<>();
    }

    public void registrar(String evento) {
        eventos.add(evento);
    }

    public void registrarInversionista(String evento) {
        eventosInversionista.add(evento);
        registrar(evento);
    }

    public ArrayList<String> getEventos() {
        return eventos;
    }

    public ArrayList<String> getEventosInversionista() {
        return eventosInversionista;
    }
}
