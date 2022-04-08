package figuras;

public class quadrado extends retangulo {


    public quadrado(double lum, double ldois, String c) {
        super(lum, ldois, c);
    }

    public double area() {
        return getLadoUm() * getLadoDois();
    }

    public String toString() {
        return "A area do quadrado é : " + area();
    }

}