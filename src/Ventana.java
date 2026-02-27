import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {

    private JPanel principal;
    private JTabbedPane tabbedPane1;

    // Login inversionista
    private JTextField txtId;
    private JTextField txtNombre;
    private JPasswordField txtPasswordUsuario;
    private JButton btnIngresarUsuario;

    // Login administrador
    private JTextField txtNombreAdmin;
    private JPasswordField txtPasswordAdmin;
    private JButton btnIngresarAdmin;

    // Registrar inversión
    private JComboBox<String> cmbInstrumento;
    private JTextField txtMonto;
    private JTextField txtFecha;
    private JButton btnConfirmar;

    // Portafolio
    private JTable tblPortafolio;
    private JTextField txtIdEliminar;
    private JButton btnEliminarInversion;
    private JLabel lblTotal;

    // Historial
    private JTable tblHistorial;

    // Admin - instrumentos
    private JTable tblInstrumento;
    private JButton btnAgregar;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnCerrarSesion;

    private SistemaInversiones sistema;

    public Ventana() {
        sistema = SistemaInversiones.cargarSistema();        bloquearTabs();

        // LOGIN INVERSIONISTA
        btnIngresarUsuario.addActionListener(e -> {
            String id = txtId.getText().trim();
            String nombre = txtNombre.getText().trim();
            String password = new String(txtPasswordUsuario.getPassword());

            if (id.isEmpty() || nombre.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
                return;
            }

            if (sistema.buscarInversionista(id) != null) {
                JOptionPane.showMessageDialog(null, "ID ya existe, intente otro");
                return;
            }

            sistema.loginInversionista(id, nombre, password);
            JOptionPane.showMessageDialog(null, "Bienvenido: " + nombre);

            habilitarInversionista();
            cargarTablaInstrumentos(); // Tabla visible
            cargarInstrumentosCombo(); // Combo actualizado
            actualizarTablas();
        });

        // LOGIN ADMIN
        btnIngresarAdmin.addActionListener(e -> {
            String nombre = txtNombreAdmin.getText().trim();
            String password = new String(txtPasswordAdmin.getPassword());
            if (sistema.loginAdministrador(nombre, password)) {
                JOptionPane.showMessageDialog(null, "Administrador autenticado");
                habilitarAdministrador();
                cargarTablaInstrumentos();
                cargarInstrumentosCombo();
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        });

        // REGISTRAR INVERSIÓN
        btnConfirmar.addActionListener(e -> {
            try {
                Object item = cmbInstrumento.getSelectedItem();
                if (item == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione un instrumento");
                    return;
                }

                String[] parts = item.toString().split("-");
                int instrumentoId = Integer.parseInt(parts[0].trim());

                double monto = Double.parseDouble(txtMonto.getText().trim());
                if (monto <= 0) {
                    JOptionPane.showMessageDialog(null, "Ingrese un monto válido mayor que 0");
                    return;
                }

                String fecha = txtFecha.getText().trim();
                sistema.registrarInversion(instrumentoId, monto, fecha);
                actualizarTablas();
                JOptionPane.showMessageDialog(null, "Inversión registrada correctamente");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Monto inválido");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al registrar la inversión");
            }
        });

        // ELIMINAR INVERSIÓN (inversionista)
        btnEliminarInversion.addActionListener(e -> {
            try {
                int instrumentoId = Integer.parseInt(txtIdEliminar.getText().trim());
                sistema.eliminarInversion(instrumentoId);
                actualizarTablas();
                JOptionPane.showMessageDialog(null, "Inversión eliminada");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ID inválido");
            }
        });

        // ADMIN - agregar instrumento
        btnAgregar.addActionListener(e -> {
            try {
                int nuevoId = sistema.generarNuevoId();

                JTextField txtNombreIns = new JTextField();
                JTextField txtPrecio = new JTextField();
                JTextField txtRiesgo = new JTextField();

                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.add(new JLabel("Nombre:"));
                panel.add(txtNombreIns);
                panel.add(new JLabel("Precio:"));
                panel.add(txtPrecio);
                panel.add(new JLabel("Riesgo (1-5):"));
                panel.add(txtRiesgo);

                int result = JOptionPane.showConfirmDialog(null, panel,
                        "Agregar nuevo instrumento", JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE);

                if (result != JOptionPane.OK_OPTION) return;

                String nombre = txtNombreIns.getText().trim();
                double precio = Double.parseDouble(txtPrecio.getText().trim());
                int riesgo = Integer.parseInt(txtRiesgo.getText().trim());

                if (nombre.isEmpty() || precio <= 0 || riesgo < 1 || riesgo > 5) {
                    JOptionPane.showMessageDialog(null, "Datos inválidos");
                    return;
                }

                InstrumentoFinanciero i = new InstrumentoFinanciero(nuevoId, nombre, precio, riesgo);
                sistema.adminRegistrarInstrumento(i);

                cargarTablaInstrumentos();
                cargarInstrumentosCombo();

                JOptionPane.showMessageDialog(null, "Instrumento agregado correctamente");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Precio o riesgo inválido");
            }
        });
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.logoutInversionista(); // nuevo método que agregaremos
                // Deshabilitar tabs y botones como al inicio
                bloquearTabs();

                // Limpiar campos de login
                txtId.setText("");
                txtNombre.setText("");
                txtPasswordUsuario.setText("");

                // Limpiar tablas
                if (tblPortafolio != null) tblPortafolio.setModel(new DefaultTableModel());
                if (tblHistorial != null) tblHistorial.setModel(new DefaultTableModel());
            }
        });
    }

    private void bloquearTabs() {
        for (int i = 1; i < tabbedPane1.getTabCount(); i++) {
            tabbedPane1.setEnabledAt(i, false);
        }
    }

    private void habilitarAdministrador() {
        for (int i = 1; i < tabbedPane1.getTabCount(); i++) {
            tabbedPane1.setEnabledAt(i, true);
        }
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }

    private void habilitarInversionista() {
        for (int i = 1; i < tabbedPane1.getTabCount(); i++) {
            tabbedPane1.setEnabledAt(i, true);
        }

        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    private void cargarInstrumentosCombo() {
        if (cmbInstrumento == null) return;
        cmbInstrumento.removeAllItems();
        for (InstrumentoFinanciero i : sistema.getInstrumentos()) {
            cmbInstrumento.addItem(i.getId() + " - " + i.getNombre());
        }
    }

    private void cargarTablaInstrumentos() {
        if (tblInstrumento == null) return;
        DefaultTableModel model = new DefaultTableModel(
                new String[]{"ID", "Nombre", "Precio", "Riesgo"}, 0
        );
        for (InstrumentoFinanciero i : sistema.getInstrumentos()) {
            model.addRow(new Object[]{i.getId(), i.getNombre(), i.getPrecioActual(), i.getRiesgo()});
        }
        tblInstrumento.setModel(model);
        tblInstrumento.revalidate();
        tblInstrumento.repaint();
    }

    private void actualizarTablas() {
        // Portafolio
        if (tblPortafolio != null) {
            DefaultTableModel port = new DefaultTableModel(
                    new String[]{"Instrumento", "Monto", "Fecha"}, 0
            );
            double total = 0;
            for (Inversion i : sistema.getInversionistaActual().getPortafolio().getInversiones()) {
                port.addRow(new Object[]{i.getInstrumento().getNombre(), i.getMonto(), i.getFecha()});
                total += i.getMonto();
            }
            tblPortafolio.setModel(port);
            lblTotal.setText("Total invertido: $" + total);
        }



        // Historial
        if (tblHistorial != null) {
            DefaultTableModel hist = new DefaultTableModel(new String[]{"Evento"}, 0);
            for (String e : sistema.getHistorial().getEventosInversionista()) {
                hist.addRow(new Object[]{e});
            }
            tblHistorial.setModel(hist);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Ventana ventana = new Ventana();
            JFrame frame = new JFrame("Sistema de Inversiones");
            frame.setContentPane(ventana.principal);

            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            frame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    ventana.sistema.guardarSistema(); // guarda antes de cerrar
                    frame.dispose();
                    System.exit(0);
                }
            });

            frame.pack();
            frame.setLocationRelativeTo(null); // centra la ventana
            frame.setVisible(true);

            // Asegurar que se carguen datos si ya existían
            ventana.cargarTablaInstrumentos();
            ventana.cargarInstrumentosCombo();
        });
    }
}
