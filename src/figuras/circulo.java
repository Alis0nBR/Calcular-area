package figuras;

public class circulo extends figura {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public circulo(double r, String c) {
        this.raio = r;
        this.setCor(c);
    }

    public double getDiametro() {
        return raio * 2;
    }

    public double area() {
        return raio * raio * 3.14;
    }

    public String toString() {
        return "O diametro do circulo é  : " + getDiametro() +
        "\n"
         + "A area do circulo é :" + area();

    }
}