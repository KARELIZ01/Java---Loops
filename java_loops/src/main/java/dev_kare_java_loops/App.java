package dev_kare_java_loops;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        imprimirTablaMultiplicar(n);
        scanner.close();
    }

    public static void imprimirTablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}


