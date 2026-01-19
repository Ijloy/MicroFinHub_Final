public class Administrador extends Usuario {

    private String password;

    public Administrador(String id, String nombre, String password) {
        super(id, nombre, "Administrador");
        this.password = password;
    }

    public boolean autenticar(String pass) {
        return password.equals(pass);
    }

    public void cambiarPassword(String nuevaPassword) {
        this.password = nuevaPassword;
    }
}
