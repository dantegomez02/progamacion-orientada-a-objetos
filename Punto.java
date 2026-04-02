public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void sumar(int x) {
        this.x += x;
        this.y += x;
    }

    public void sumar(Punto unPunto) {
        this.x += unPunto.getX();
        this.y += unPunto.getY();

    }

    public double distancia(Punto unPunto) {
        int a = this.x - unPunto.getX();
        int b = this.y - unPunto.getY();
        double c = Math.sqrt(a * a + b * b);
        return c;
    }

}