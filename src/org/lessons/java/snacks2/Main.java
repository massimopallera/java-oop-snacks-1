package org.lessons.java.snacks2;

public class Main {
    public static void main(String[] args) {
        ContoBancario cb = new ContoBancario("84738917423891");

        cb.depositaDenaro(1000);
        cb.prelevaDenaro(500);
        System.out.println(cb.getSaldo());
    }
}
