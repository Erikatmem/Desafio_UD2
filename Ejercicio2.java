package ud2;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Por favor, ingrese un número positivo.");
            }
        } while (numero <= 0);
        System.out.println("Los primeros 20 números sucesivos a " + numero + " son:");
        for (int i = 1; i <= 20; i++) {
            System.out.print((numero + i) + " ");
        }
        scanner.close();
    }
}
