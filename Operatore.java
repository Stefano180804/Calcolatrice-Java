public enum Operatore {
    SOMMA('+'),
    SOTTRAZIONE('-'),
    MOLTIPLICAZIONE('*'),
    DIVISIONE('/'),
    POTENZA('^'),
    RADICE('r'),
    PERCENTUALE('%');

    private final char simbolo;

    Operatore(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public static Operatore daSimbolo(char simbolo) {
        for (Operatore op : Operatore.values()) {
            if (op.simbolo == simbolo) {
                return op;
            }
        }
        throw new IllegalArgumentException("Operatore non valido!");
    }
}
