package be.pxl.flights.domain;

public class Booking {
    private String ref;
    private String firstname;
    private String lastname;
    private String email;
    private Flight flight;

    public String getRef() {
        return ref;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
