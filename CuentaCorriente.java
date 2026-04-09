Public class CuentaCorriente extends CuentaBancaria {
    @Override
    public double getLimiteMinimo() {
        return -150.0;
    }

}