public class Operazioni {

    public static double somma(double a, double b) {
        return a + b;
    }

    public static double sottrazione(double a, double b) {
        return a - b;
    }

    public static double moltiplicazione(double a, double b) {
        return a * b;
    }

    public static double divisione(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero!");
        }
        return a / b;
    }

    public static double potenza(double base, double esponente) {
        return Math.pow(base, esponente);
    }

    public static double radiceQuadrata(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Radice di numero negativo!");
        }
        return Math.sqrt(numero);
    }

    public static double percentuale(double totale, double percento) {
        return (totale * percento) / 100;
    }

    public static double eseguiOperazione(Operatore op, double a, double b) {
        return switch (op) {
            case SOMMA -> somma(a, b);
            case SOTTRAZIONE -> sottrazione(a, b);
            case MOLTIPLICAZIONE -> moltiplicazione(a, b);
            case DIVISIONE -> divisione(a, b);
            case POTENZA -> potenza(a, b);
            case PERCENTUALE -> percentuale(a, b);
            default -> throw new IllegalArgumentException("Operazione non supportata");
        };
    }
}