package ch.nine9iota;

/**
 * @author nine9iota
 * @version 1.0.0
 * simple calc
 */

public class App {
    public static void main(String[] args) {
        System.out.println(add(57, 12));

        System.out.println(subtract(4350, 3930));

        System.out.println(multiply(3, 23));

        System.out.println(divide(7980, 19));

        System.out.println(modulo(4, 3));
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static int divide(int n1, int n2) {
        return n1 / n2;
    }

    public static int modulo(int n1, int n2) {
        return n1 % n2;
    }
}
