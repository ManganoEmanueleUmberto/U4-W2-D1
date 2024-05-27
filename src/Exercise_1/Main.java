package Exercise_1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = rdm.nextInt(100);
        }
        System.out.println("Array iniziale:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        while (true) {
            try {

                System.out.print("Inserisci un valore (0 per terminare): ");
                int value = sc.nextInt();
                if (value == 0) {
                    break;
                }

                System.out.print("Inserisci la posizione (0-4): ");
                int position = sc.nextInt();
                array[position] = value;

                System.out.println("Nuovo stato dell'array:");
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Errore: posizione non valida. Riprova.");
            } catch (Exception e) {
                System.err.println("Errore: input non valido. Riprova.");
                sc.next();
            }
        }

        sc.close();
    }
}
