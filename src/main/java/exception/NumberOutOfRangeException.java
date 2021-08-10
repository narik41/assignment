package exception;

public class NumberOutOfRangeException extends Exception {

    public NumberOutOfRangeException(String errorMessage){
        super(errorMessage);
    }
}
