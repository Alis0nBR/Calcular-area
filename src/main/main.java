package main;

import figuras.circulo;
import figuras.retangulo;
import figuras.triangulo;
import figuras.quadrado;

public class main {
    public static void main(String[] args) {

        circulo c = new circulo( 5, "branco" );

        retangulo r = new retangulo ( 2, 4 , "branco" );

        triangulo t = new triangulo ( 5 , 5 , "branco" );

        quadrado q = new quadrado ( 5, 5, "branco" );

        System.out.println(r.toString());
        System.out.println(t.toString());
        System.out.println(c.toString());
        System.out.println(q.toString());
    }
}