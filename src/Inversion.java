public class Inversion {

    private InstrumentoFinanciero instrumento;
    private double monto;
    private String fecha;

    public Inversion(InstrumentoFinanciero instrumento, double monto, String fecha) {
        this.instrumento = instrumento;
        this.monto = monto;
        this.fecha = fecha;
    }

    public InstrumentoFinanciero getInstrumento() { return instrumento; }
    public double getMonto() { return monto; }
    public String getFecha() { return fecha; }
}
