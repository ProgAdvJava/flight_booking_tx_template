package be.pxl.flights.service;

import be.pxl.flights.dto.BookingAcknowledgement;
import be.pxl.flights.dto.BookingRequest;
import be.pxl.flights.repository.BookingRepository;
import be.pxl.flights.repository.FlightRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingService {

    private final Logger LOGGER = LogManager.getLogger(FlightBookingService.class);
    private final FlightRepository flightRepository;
    private final BookingRepository bookingRepository;

    public FlightBookingService(FlightRepository flightRepository,
                                BookingRepository bookingRepository) {
        this.flightRepository = flightRepository;
        this.bookingRepository = bookingRepository;
    }

    public BookingAcknowledgement bookFlightTicket(BookingRequest request) {
        // TODO implement this method

        // find flight by id
        // LOGGER.info("Flight " + flight.getId() + " Available seats: " + flight.getAvailableSeats());
        // call  bookSeat() on flight

        // create booking

        // execute payment - call handlePayment

        // return new BookingAcknowledgement(booking.getRef());
        throw new UnsupportedOperationException();
    }
}
