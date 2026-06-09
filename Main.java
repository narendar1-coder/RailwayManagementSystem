import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Train train = new Train(
            101,
            "Rajdhani Express"
        );

        System.out.println("Enter Passenger ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Passenger Name:");
        String name = sc.nextLine();

        Passenger passenger =
            new Passenger(id, name);

        TicketBooking booking =
            new TicketBooking(train, passenger);

        booking.bookTicket();

        sc.close();
    }
}