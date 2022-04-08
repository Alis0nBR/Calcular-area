package figuras;

public class retangulo extends figura {

    private double ladoUm;
    private double ladoDois;

    public retangulo(double lum, double ldois, String c) {
        this.ladoUm = lum;
        this.ladoDois = ldois;
        this.setCor(c);
    }

    public void setLadoUm(double ladoUm) {
        this.ladoUm = ladoUm;
    }

    public void setLadoDois(double ladoDois) {
        this.ladoDois = ladoDois;
    }

    public double getLadoUm() {
        return ladoUm;
    }

    public double getLadoDois() {
        return ladoDois;
    }

    public double area() {
        return ladoUm * ladoDois;
    }

    public String toString() {
        return "A area do seu retangulo é : " + area();
    }
}