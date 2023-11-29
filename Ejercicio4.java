package ud2;

import java.util.Scanner;
public class Ejercicio4 {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Introduce el primer número: ");
				int num1 = scanner.nextInt();
				System.out.print("Introduce el segundo número: ");
				int num2 = scanner.nextInt();
				System.out.print("Introduce el tercer número: ");
				int num3 = scanner.nextInt();

				System.out.print("Selecciona el orden de ordenamiento ('asc' para ascendente, 'desc' para descendente): ");
				String orden = scanner.next();

				if (orden.equals("asc")) {
				    if (num1 > num2) {
				        int temp = num1;
				        num1 = num2;
				        num2 = temp;
				    }
				    if (num2 > num3) {
				        int temp = num2;
				        num2 = num3;
				        num3 = temp;
				    }
				    if (num1 > num2) {
				        int temp = num1;
				        num1 = num2;
				        num2 = temp;
				    }
				} else if (orden.equals("desc")) {
				    if (num1 < num2) {
				        int temp = num1;
				        num1 = num2;
				        num2 = temp;
				    }
				    if (num2 < num3) {
				        int temp = num2;
				        num2 = num3;
				        num3 = temp;
				    }
				    if (num1 < num2) {
				        int temp = num1;
				        num1 = num2;
				        num2 = temp;
				    }
				} else {
				    System.out.println("La ordenación introducida no es válida. Los números no se mostrarán.");
				    return;
				}
				System.out.println("Números ordenados: " + num1 + ", " + num2 + ", " + num3);
			}
	    }
	}
