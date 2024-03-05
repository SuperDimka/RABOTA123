package org.example;

public class Service {
    public String str(Complex a){
        return a.getY()<0 ? Double.toString(a.getX())+a.getY() +"i" :
                a.getX()+"+"+a.getY() +"i";
    }
    public Complex add(Complex a, Complex b) {
        return new Complex(a.getX() + b.getX(), a.getY() + b.getY());
    }

    public Complex sub(Complex a, Complex b) {
        return new Complex(a.getX() - b.getX(), a.getY() - b.getY());
    }

    public Complex mul(Complex a, Complex b) {
        return new Complex(a.getX() * b.getX() - a.getY() * b.getY(), a.getX() * b.getY() + b.getX() * a.getY());
    }

    public Complex div(Complex a, Complex b) {
        double x = a.getX();
        double x1 = b.getX();
        double y = a.getY();
        double y1 = b.getY();
        double denom = Math.pow(x1, 2) + Math.pow(y1, 2);
        double real = (x * x1 + y * y1) / denom;
        double imaginary = (x1 * y - x * y1) / denom;
        return new Complex(real, imaginary);
    }

    public boolean equal(Complex a, Complex b) {
        return (a.getX() == b.getX()) && (a.getY() == b.getY());
    }

    public double mod(Complex a) {
        return Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(), 2));
    }
}