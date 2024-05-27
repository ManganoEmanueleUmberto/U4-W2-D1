package Exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double km = sc.nextDouble();
            System.out.print("Inserisci i litri di carburante consumati: ");
            double litri = sc.nextDouble();
            if (litri == 0) {
                throw new ArithmeticException("I litri di carburante consumati non possono essere zero");
            }
            double kmPerLitro = km / litri;
            System.out.println("I km/litro percorsi sono: " + kmPerLitro);

        } catch (ArithmeticException e) {
            System.err.println("Errore: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Errore: input non valido");
        }
        sc.close();

    }

}
