package figuras;

public class triangulo extends figura {
    private double base;
    private double altura;

    public triangulo(double b, double l, String c) {
        this.base = b;
        this.altura = l;
        this.setCor(c);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double raio() {
        return base * altura / 2;
    }

    public String toString() {
        return "A area do triangulo é : " + raio();
    }
 }

