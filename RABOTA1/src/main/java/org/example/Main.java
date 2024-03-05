
package org.example;

        import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);
        Service cs = new Service();
        System.out.println("a: " + cs.str(a));
        System.out.println("b: " + cs.str(b));
        System.out.println("Sum: " + cs.str(cs.add(a,b)));
        System.out.println("Del: " + cs.str(cs.sub(a,b)));
        System.out.println("Mul: " + cs.str(cs.mul(a,b)));
        System.out.println("Частное: " + cs.str(cs.div(a,b)));
        System.out.println("Модуль a: " + cs.mod(a));
        System.out.println("Модуль b: " + cs.mod(b));
        System.out.println("Сравнение a и перегруженного конструктора: " + cs.equal(a, new Complex()));
        System.out.println("Сравнение a и b: " + cs.equal(a,b));
    }
}