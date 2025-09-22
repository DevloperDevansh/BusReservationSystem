package BusReservationSystem;

import java.util.Scanner;

public class BusReservationMgt {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ReservationService reservationService = new ReservationService("Dinkarpur Bus Service");

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("-----------  🚌 Bus Reservation Menu -------------------------");
            System.out.println("--------------------------------------------------------------");
            System.out.println("1. Add Passenger");
            System.out.println("2. Remove Passenger");
            System.out.println("3. View All Passengers");
            System.out.println("4. Search Passenger");
            System.out.println("5. Show Available Seats");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scn.nextInt();
            scn.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger ID: ");
                    int id = scn.nextInt();
                    scn.nextLine();

                    System.out.print("Enter Seat Number (1-10): ");
                    int seatNo = scn.nextInt();
                    scn.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scn.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = scn.nextLine();

                    System.out.print("Enter Description: ");
                    String desc = scn.nextLine();

                    // ✅ Updated: No need to pass null,0
                    Passanger passanger = new Passanger(id, name, seatNo, contact, desc);
                    reservationService.addPassanger(passanger);
                    break;

                case 2:
                    System.out.print("Enter Passenger SeatNumber to remove: ");
                    int seatnumber = scn.nextInt();
                    scn.nextLine();

                    reservationService.removePassanger(seatnumber);
                    break;

                case 3:
                    reservationService.viewAllBooking();
                    break;

                case 4:
                    System.out.print("Enter Passenger SeatNumber to search: ");
                    int seatNumber = scn.nextInt();
                    scn.nextLine();

                    reservationService.search(seatNumber);
                    break;

                case 5:
                    reservationService.showAvailableSeats();
                    break;

                case 6:
                    System.out.println("🚪 Exiting... Thank you for using the system!");
                    scn.close();
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }
        }
    }
}
