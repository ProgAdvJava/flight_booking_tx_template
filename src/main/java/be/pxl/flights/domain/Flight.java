package be.pxl.flights.domain;

import be.pxl.flights.exception.InsufficientSeatsException;

import java.time.LocalDateTime;

public class Flight {
    private Integer id;
    private Airport origin;
    private Airport destination;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private double fare;
    private int availableSeats;

    public Integer getId() {
        return id;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getFare() {
        return fare;
    }

    public void bookSeat() {
        if (availableSeats >= 1) {
            availableSeats--;
        } else {
            throw new InsufficientSeatsException("No seats available on flight [" + id +"]");
        }
    }
}
