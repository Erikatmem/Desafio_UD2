package ud2;

public class Ejercicio3 {
    public static void main(String[] args) {
        int contador = 0;
 System.out.println("Números que son múltiplos de 2 o de 3 entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println("\nTotal: " + contador);
    }
}
