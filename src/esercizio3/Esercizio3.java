package esercizio3;
import java.util.Scanner;


public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();

        int index = 0;
        StringBuilder risultato = new StringBuilder();

        while (index < input.length()) {
            risultato.append(input.charAt(index)); // Aggiunge il carattere corrente
            index++;
            if (index < input.length()) {
                risultato.append(", "); // Aggiunge la virgola se non è l'ultimo carattere
            }
        }

        System.out.println("Caratteri separati da virgola: " + risultato.toString());

        scanner.close();
    }
}

