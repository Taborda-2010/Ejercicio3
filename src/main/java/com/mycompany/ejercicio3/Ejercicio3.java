package com.mycompany.ejercicio3;
public class Ejercicio3 {

    public static void main(String[] args) {
        double X,Y,SUMA;
        SUMA=0;
        X=20;
        SUMA+=X;
        Y=40;
        X+=(Math.pow(Y, 2));
        SUMA+=X/Y;
        System.out.println("EL VALOR DE LA SUMA ES:"+SUMA);

    }
}
