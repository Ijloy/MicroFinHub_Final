import java.util.ArrayList;

public class SistemaInversiones {

    private ArrayList<InstrumentoFinanciero> instrumentos;
    private ArrayList<Inversionista> inversionistas; // lista de todos los usuarios
    private Inversionista inversionistaActual;
    private Administrador administrador;
    private Historial historial;

    public SistemaInversiones() {
        instrumentos = new ArrayList<>();
        inversionistas = new ArrayList<>();
        historial = new Historial();
        administrador = new Administrador("admin1", "Administrador", "1234");

        // Instrumentos iniciales
        instrumentos.add(new InstrumentoFinanciero(1, "Acciones", 120, 4));
        instrumentos.add(new InstrumentoFinanciero(2, "Bonos", 80, 2));
        instrumentos.add(new InstrumentoFinanciero(3, "Criptomonedas", 200, 5));
    }

    // Registro login inversionista
    public boolean loginInversionista(String id, String nombre, String password) {
        Inversionista inv = buscarInversionista(id);
        if (inv != null) { // existe
            if (inv.autenticar(password)) {
                inversionistaActual = inv;
                historial.registrar("Login inversionista: " + nombre);
                return true;
            } else {
                return false; // contraseña incorrecta
            }
        } else { // no existe, crear nuevo inversionista
            inversionistaActual = new Inversionista(id, nombre, password);
            inversionistas.add(inversionistaActual);
            historial.registrar("Nuevo inversionista registrado: " + nombre);
            return true;
        }
    }

    public boolean loginAdministrador(String nombre, String password) {
        if (administrador.autenticar(password)) {
            historial.registrar("Login administrador: " + nombre);
            return true;
        }
        return false;
    }

    // Verifica si existe un inversionista por ID
    public Inversionista buscarInversionista(String id) {
        for (Inversionista i : inversionistas) {
            if (i.getId().equals(id)) return i;
        }
        return null;
    }


    // ===== INVERSIONES =====
    public void registrarInversion(int instrumentoId, double monto, String fecha) {
        InstrumentoFinanciero instrumento = buscarInstrumento(instrumentoId);
        if (instrumento != null) {
            Inversion inversion = new Inversion(instrumento, monto, fecha);
            inversionistaActual.agregarInversion(inversion);
            historial.registrarInversionista("Inversión agregada: " + instrumento.getNombre() + " $" + monto);
        }
    }

    public void eliminarInversion(int instrumentoId) {
        if (inversionistaActual != null) {
            inversionistaActual.eliminarInversion(instrumentoId);
            historial.registrarInversionista("Inversión eliminada ID: " + instrumentoId);
        }
    }

    // ===== ADMIN =====
    public void adminRegistrarInstrumento(InstrumentoFinanciero i) {
        instrumentos.add(i);
        historial.registrar("Instrumento agregado: " + i.getNombre());
    }

    public void adminEliminarInstrumento(int id) {
        instrumentos.removeIf(i -> i.getId() == id);
        historial.registrar("Instrumento eliminado ID: " + id);
    }

    public void logoutInversionista() {
        inversionistaActual = null; // simplemente desasigna al usuario actual
    }

    // ===== GETTERS =====
    public ArrayList<InstrumentoFinanciero> getInstrumentos() { return instrumentos; }
    public Inversionista getInversionistaActual() { return inversionistaActual; }
    public Historial getHistorial() { return historial; }

    private InstrumentoFinanciero buscarInstrumento(int id) {
        for (InstrumentoFinanciero i : instrumentos) {
            if (i.getId() == id) return i;
        }
        return null;
    }

    public int generarNuevoId() {
        int max = 0;
        for (InstrumentoFinanciero i : instrumentos) {
            if (i.getId() > max) max = i.getId();
        }
        return max + 1;
    }
}
