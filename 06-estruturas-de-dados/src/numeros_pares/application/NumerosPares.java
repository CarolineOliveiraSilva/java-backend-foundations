package numerosPares.application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros?");
        int n = sc.nextInt();
        int[] vect = new int[n];
        
        System.out.println("Numeros:");

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        int contador = 0;
        System.out.println("Esses foram os números pares2:");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                contador++;
            }
        }
        System.out.println("\nTOTAL = " + contador);

        sc.close();
    }
}
