package be.pxl.flights.api;

import be.pxl.flights.dto.BookingAcknowledgement;
import be.pxl.flights.dto.BookingRequest;
import be.pxl.flights.service.FlightBookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("booking")
public class BookingController {

    private FlightBookingService bookingService;

    public BookingController(FlightBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public BookingAcknowledgement createBooking(@RequestBody BookingRequest bookingRequest) {
        return bookingService.bookFlightTicket(bookingRequest);
    }
}
