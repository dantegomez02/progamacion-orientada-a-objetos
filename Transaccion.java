public class Transaccion {
    private Date fecha;
    private double monto;
    private String tipo;

    public Transaccion(Date fecha, double monto, String tipo) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }

    // Getters para poder consultar el historial luego
    @Override
    public String toString() {
        return String.format("%s | %s: $%.2f", fecha.toString(), tipo, monto);
    }
}