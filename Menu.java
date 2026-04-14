import java.util.Scanner;

public class Menu {

    public static void mostraMenu() {
        System.out.println("\n==============================");
        System.out.println("        CALCOLATRICE");
        System.out.println("==============================");
        System.out.println("Scegli un'operazione:");
        System.out.println(" 1) Somma (+)");
        System.out.println(" 2) Sottrazione (-)");
        System.out.println(" 3) Moltiplicazione (*)");
        System.out.println(" 4) Divisione (/)");
        System.out.println(" 5) Potenza (^)");
        System.out.println(" 6) Radice quadrata (r)");
        System.out.println(" 7) Percentuale (%)");
        System.out.println("------------------------------");
        System.out.print("Inserisci scelta: ");
    }

    public static Operatore leggiOperatore(Scanner input) {
        int scelta = input.nextInt();

        return switch (scelta) {
            case 1 -> Operatore.SOMMA;
            case 2 -> Operatore.SOTTRAZIONE;
            case 3 -> Operatore.MOLTIPLICAZIONE;
            case 4 -> Operatore.DIVISIONE;
            case 5 -> Operatore.POTENZA;
            case 6 -> Operatore.RADICE;
            case 7 -> Operatore.PERCENTUALE;
            default -> throw new IllegalArgumentException("Scelta non valida!");
        };
    }

    // ➕ operazioni base
    public static double[] leggiDueNumeri(Scanner input) {
        System.out.print("Inserisci primo numero: ");
        double a = input.nextDouble();

        System.out.print("Inserisci secondo numero: ");
        double b = input.nextDouble();

        return new double[]{a, b};
    }

    // POTENZA
    public static double[] leggiPotenza(Scanner input) {
        System.out.print("Inserisci la base: ");
        double base = input.nextDouble();

        System.out.print("Inserisci l'esponente: ");
        double esponente = input.nextDouble();

        return new double[]{base, esponente};
    }

    // RADICE
    public static double leggiNumero(Scanner input) {
        System.out.print("Inserisci numero: ");
        return input.nextDouble();
    }

    public static boolean chiediContinuazione(Scanner input) {
        System.out.print("\nVuoi continuare? (s/n): ");
        char r = input.next().charAt(0);
        return r == 's' || r == 'S';
    }
}