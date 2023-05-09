package be.pxl.flights.exception;

public class InsufficientSeatsException extends RuntimeException {
    public InsufficientSeatsException(String msg){
        super(msg);
    }
}
