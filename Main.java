import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            boolean continua = true;

            while (continua) {

                try {
                    Menu.mostraMenu();
                    Operatore op = Menu.leggiOperatore(input);

                    double risultato;

                    switch (op) {

                        case RADICE -> {
                            double num = Menu.leggiNumero(input);
                            risultato = Operazioni.radiceQuadrata(num);
                        }

                        case POTENZA -> {
                            double[] dati = Menu.leggiPotenza(input);
                            risultato = Operazioni.potenza(dati[0], dati[1]);
                        }

                        default -> {
                            double[] numeri = Menu.leggiDueNumeri(input);
                            risultato = Operazioni.eseguiOperazione(op, numeri[0], numeri[1]);
                        }
                    }

                    System.out.println("Risultato: " + risultato);

                } catch (ArithmeticException e) {
                    System.out.println("Errore matematico: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Errore input non valido!");
                    input.nextLine();
                }

                continua = Menu.chiediContinuazione(input);
            }

            System.out.println("Calcolatrice chiusa ");
        }
    }
}