package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSum_vector {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        double[] vect = new double[n];

        

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Numero:");
            vect[i] = sc.nextDouble();
            
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {

            sum += vect[i];

        }
        double avg = sum / n;

        System.out.printf("Soma: %.2f%n" , sum);
        System.out.printf("Media: %.2f%n ", avg);

        sc.close();

    }
}