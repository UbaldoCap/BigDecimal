import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal x = BigDecimal.valueOf(99);
        BigDecimal y = BigDecimal.valueOf(88);
        OperazioniEnum moltiplicazione = OperazioniEnum.MOLTIPLICAZIONE;
        System.out.println(x + " " + moltiplicazione.getOperazione() + " " + y + " = " + calcolatrice(x, y, moltiplicazione));
    }
    public static BigDecimal calcolatrice (BigDecimal x, BigDecimal y, OperazioniEnum operazioniEnum) {
        BigDecimal result = null;
        switch (operazioniEnum) {
            case ADDIZIONE ->
                result = x.add(y);
            case SOTTRAZIONE ->
                result = x.subtract(y);
            case MOLTIPLICAZIONE ->
                result = x.multiply(y);
            case DIVISIONE ->
                result = x.divide(y);
            case Max ->
                result = x.max(y);
            case MIN ->
                result = x.min(y);
        }
        return result;
    }
}
