/*package TP6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cant = 0, largo = 0;
        System.out.println("\n\nGenerador de contraseñas:\n\n");
        System.out.println("Ingrese la cantidad de contraseñas a ganerar: ");
        cant = s.nextInt();
        System.out.println("Ingrese la longitud de las contraseñas que quiere generar: ");
        largo = s.nextInt();

        GeneradorContraseñas g1 = new GeneradorContraseñas(cant,largo); //se crea el objeto g1 de tipo generador de contraseñas
        System.out.println("\n\nContraseñas generadas:\n\n");
        int k = 1;
        for (int i = 0; i < g1.getContraseñas().length; i++) {
            System.out.println("Contraseña " + k + " --> " + g1.getContraseñas()[i] +
                    "\tCantidad de caracteres --> " + g1.getLongitud(g1.getContraseñas()[i]) +
                    "\tSeguridad de la contraseña --> " + g1.getSeguridad(g1.getContraseñas()[i]));

            k++;
        }

    }
}
*/