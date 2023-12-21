public enum OperazioniEnum {
    ADDIZIONE ("+"),
    SOTTRAZIONE ("-"),
    MOLTIPLICAZIONE ("*"),
    DIVISIONE ("/"),
    MIN ("min"),
    Max ("max");

    private final String operazione;

    OperazioniEnum(String operazione) {
        this.operazione = operazione;
    }

    public String getOperazione() {
        return operazione;
    }
}
