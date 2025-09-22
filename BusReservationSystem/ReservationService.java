package BusReservationSystem;

import java.util.LinkedList;

public class ReservationService {

    private String name;
    private LinkedList<Passanger> passangers;

    public ReservationService(String name) {
        this.name = name;
        this.passangers = new LinkedList<>();
    }

    // ✅ Add passenger
    public void addPassanger(Passanger passanger) {
        //get seat number
        int seatNo = passanger.getSeatNumber();

        if(seatNo<=0 && seatNo>10){
            System.out.println("❌ Invalid seat number! Only 1-10 available.");
            return;
        }

        if(!seatIsAvailable(seatNo)){
            System.out.println("❌ Seat already booked!");
            return;
        }

        if(seatNo >=1 && seatNo<=3){
            passanger.setSeatType("VIP");
            passanger.setPrice(1000);
        }else if(seatNo >= 3 && seatNo<=7){
            passanger.setSeatType("NORMAL");
            passanger.setPrice(500);
        }else{
            passanger.setSeatType("SLEEPER");
            passanger.setPrice(1500);
        }

        passangers.add(passanger);

        System.out.println("✅ Booking Confirmed for " + passanger.getName() +
                " | SeatType: " + passanger.getSeatType() +
                " | Price: ₹" + passanger.getPrice());


    }

    // ✅ Remove passenger by seat number (Fixed)
    public void removePassanger(int seatNumber) {
        boolean found = false; // flag to check if seat exists

        for (Passanger pass : passangers) {
            if (pass.getSeatNumber() == seatNumber) {
                passangers.remove(pass);
                System.out.println("Passenger with Seat No " + seatNumber + " removed successfully.");
                found = true;
                break; // stop loop once passenger is removed
            }
        }

        if (!found) {
            System.out.println("❌ Seat number " + seatNumber + " does not exist!");
        }
    }

    // ✅ View all bookings in table format
    public void viewAllBooking() {
        if (passangers.isEmpty()) {
            System.out.println("No bookings yet!");
            return;
        }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-20s %-15s %-20s\n",
                "Id", "Seat No", "Name", "Contact", "Description");
        System.out.println("------------------------------------------------------------------------------------");

        for (Passanger passanger : passangers) {
            System.out.printf("%-10d %-15d %-20s %-15s %-20s\n",
                    passanger.getId(),
                    passanger.getSeatNumber(),
                    passanger.getName(),
                    passanger.getContact(),
                    passanger.getDescription());
        }

        System.out.println("------------------------------------------------------------------------------------");
    }

    // ✅ Search passenger by seat number (Fixed)
    public void search(int seatNumber) {
        boolean found = false;

        for (Passanger p : passangers) {
            if (p.getSeatNumber() == seatNumber) {
                System.out.println("✅ Passenger Found: " + p.getName() + " (Seat No: " + seatNumber + ")");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Passenger with Seat No " + seatNumber + " not found!");
        }
    }

    public boolean seatIsAvailable(int seatNumber){

        for(Passanger p:passangers){
            if(p.getSeatNumber()==seatNumber){
                return false; //seat is booked
            }
        }

        return true;
    }


    public void showAvailableSeats() {
        System.out.println("--------Available seats-------");

        //we have 10 seats
        //for showimg available seats we can iterate and and prin available seats based on the conition

        for(int i=1;i<=10;i++){
            if(seatIsAvailable(i)){
                String type;
                if(i>=1 && i<=3){
                    type = "VIP (₹ 1000)";
                } else if (i>=3 && i<=7) {
                    type = "NORMAL (₹500)";
                }else {
                    type = "SLEEPER (₹1500)";
                }
                System.out.println("Seat" +i+ " -> " +type+ "✅ Available");
            }
        }
    }
}
