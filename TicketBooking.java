
public class TicketBooking {

    Train train;
    Passenger passenger;

    public TicketBooking(Train train,
                         Passenger passenger) {

        this.train = train;
        this.passenger = passenger;
    }

    public void bookTicket() {

        System.out.println(
            "Ticket Booked Successfully"
        );

        System.out.println(
            "Passenger: " + passenger.passengerName
        );

        System.out.println(
            "Train: " + train.trainName
        );
    }
}
