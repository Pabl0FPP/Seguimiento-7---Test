package exceptions;

public class NegativeWeightException extends RuntimeException{

    public NegativeWeightException() {
        super("No se pueden ingresar numeros negativos");
    }
}
