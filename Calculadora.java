package Calcu;

import java.util.Scanner;

public class LaCalcu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            int opcion = 0;
            int opcion2 = 0;

            System.out.println("----------------------");
            System.out.println("****Mi Calculadora****");
            System.out.println("----------------------");
            System.out.println(" ");
            System.out.println("Introduce un numero: ");
            opcion = Integer.parseInt(sc.nextLine());

            System.out.println("Escribe qué operacion deseas: ");
            String caracter = sc.nextLine();

            System.out.println("Escribe un segundo numero: ");
            opcion2 = Integer.parseInt(sc.nextLine());

            if (caracter.equals("+")) {
                System.out.println("Resultado: " + (opcion + opcion2));
            } else if (caracter.equals("-")) {
                System.out.println("Resultado: " + (opcion - opcion2));
            } else if (caracter.equals("*")) {
                System.out.println("Resultado: " + (opcion * opcion2));
            } else if (caracter.equals("/")) {
                System.out.println("Resultado: " + (opcion / opcion2));
            } else {
                System.out.println("Operación no válida.");
            }

            System.out.println("Deseas repetir el proceso? (S/N)");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                repetir = false;
            }
        }

        sc.close();
        System.out.println("Bueno pues adios chaval");
    }
}
