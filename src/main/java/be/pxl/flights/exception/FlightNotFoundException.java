package be.pxl.flights.exception;

public class FlightNotFoundException extends RuntimeException {

    public FlightNotFoundException(Integer flightId) {
        super("Flight [" + flightId + "] not found.");
    }
}
