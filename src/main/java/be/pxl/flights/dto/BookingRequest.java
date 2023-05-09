package be.pxl.flights.dto;

public record BookingRequest(int flightId,
                             String firstname,
                             String lastname,
                             String email,
                             String account) {
}
