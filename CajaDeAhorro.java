public class CajaDeAhorro extends CuentaBancaria{
    private int extracciones = 5;
    @Override
    public double getLimiteMinimo() {
        return 10.0;
    }

    public void extraer(double monto){
        if (extracciones>0){
            super.extraer(monto);
            this.extracciones--;
        }else{
            System.out.println("limite de extracciones mensuales alcanzado");
        }
    }
    public void resetExtracciones(){
        this.extracciones = 5;
    }
}
