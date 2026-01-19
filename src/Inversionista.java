public class Inversionista extends Usuario {

    private String password;
    private Portafolio portafolio;

    public Inversionista(String id, String nombre, String password) {
        super(id, nombre, "Inversionista");
        this.password = password;
        portafolio = new Portafolio();
    }

    public boolean autenticar(String pass) {
        return password.equals(pass);
    }

    public void agregarInversion(Inversion inversion) {
        portafolio.agregarInversion(inversion);
    }

    public void eliminarInversion(int instrumentoId) {
        portafolio.eliminarInversion(instrumentoId);
    }

    public String getPassword() {
        return password;
    }

    public Portafolio getPortafolio() {
        return portafolio;
    }
}
