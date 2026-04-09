public abstract class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private Date fechaAPertura;
    private list<Transaccion> historialTransacciones = new ArrayList<>();
    public Date getFechaAPertura() { return fechaAPertura; }

    public void setFechaAPertura(Date fechaAPertura) { this.fechaAPertura = fechaAPertura; }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) { this.titular = titular; }

    public double getSaldo() {
        return saldo;
    }
    public abstact void getLimiteMinimo();

    public void extraer(double montoExtraer){
        if (getLimiteMinimo() =< super.getSaldo()-montoExtraer){
            this.saldo = this.getSaldo()-montoExtraer;
            this.registrarTransaccion(monto,"Extraccion");
        }
    }

    public void depositar(double monto){
        saldo += monto;
        this.registrarTransaccion(monto,"Deposito");
    }

    private void registrarTransaccion(double monto, String tipo){
        this.historialTransacciones.add(new Date(), monto, tipo);
    }
}
