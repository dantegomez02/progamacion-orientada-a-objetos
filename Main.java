public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 3);
        Punto p2 = new Punto(4, 7);

        System.out.println("Punto 1: " + p1.getX() + "@" + p1.getY());
        double dist = p1.distancia(p2);
        System.out.println("La distancia al punto 2 es: " + dist);
    }
}