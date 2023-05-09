## Mission 4: Transactions, isolation level and transaction propagation

### Task 1: Create the mariadb database

### Task 2: Annotate the entity classes.

The database will be created by flyway migration scripts. 
You're not allowed to change the sql scripts to create the database.
Make sure your entity classes are annotated correctly.

### Task 3: Implement bookFlightTicket business logic

Implement the business logic for booking a flight ticket.

Make sure no booking is saved and the seat is not taken (in the flight)
when there is insufficient money on the provided account.

You can add the following properties to investigate the creation, commit and rollback
of transactions:
```
logging.level.org.springframework.transaction.interceptor=trace
logging.level.org.springframework.orm.jpa=debug
logging.level.org.springframework.transaction=debug
```

```
POST http://localhost:8085/flights/api/v1/booking

{
	"flightId": 14,
	"firstname": "Els",
	"lastname": "Somebody",
	"email": "somebody@pxl.be",
	"account": "VISA-001"
}
```

### Task 4: Concurrent transactions

There are flights that have only one seat available. If two transactions try to book
the flight simultaneously, how can you prevent a double booking? 

We need the possibility to wait before committing the transaction. Therefore, we add the 
field sleep (boolean) in the BookingRequest. If sleep is true, we put the thread to
sleep before handling the payment.
Start a first transaction with sleep true (this gives us time to start the second transaction),
start a second transaction to book the same, last seat.
Can you prevent a double booking?
What if the account for the first transaction did not have sufficient money?

### Task 5: Save the payment reference (uuid returned by handlePayment) with the booking

Create an update script to add the column to the database table. 
Update the Booking entity class and fix the business logic.
Write a unit test for the method bookFlightTicket in class FlightBookingService.

### Task 6: Get flight details

Create an endpoint to retrieve the flight details. We need the iata code and full name of the origin
and destination airport, we need the departure time, and a list of all passengers.



