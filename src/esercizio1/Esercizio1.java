
package esercizio1;

public class Esercizio1 {

    // Metodo che verifica se una stringa ha una lunghezza pari
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    // Metodo che verifica se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        // Un anno è bisestile se:
        // 1. È divisibile per 4
        // 2. Se è divisibile per 100 deve essere anche divisibile per 400
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0; // Bisestile solo se divisibile per 400
            }
            return true; // Bisestile
        }
        return false; // Non bisestile
    }

    // Metodo main per testare gli altri metodi
    public static void main(String[] args) {
        // Test per il metodo stringaPariDispari
        String testString = "Ciao";
        boolean isEven = stringaPariDispari(testString);
        System.out.println("La stringa \"" + testString + "\" ha una lunghezza " + (isEven ? "pari." : "dispari."));

        // Test per il metodo annoBisestile
        int testYear = 2024;
        boolean isLeapYear = annoBisestile(testYear);
        System.out.println("L'anno " + testYear + " è " + (isLeapYear ? "bisestile." : "non bisestile."));
}
}