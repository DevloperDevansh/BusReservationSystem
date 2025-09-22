🚌 Bus Reservation System

A console-based Bus Reservation System in Java that allows users to manage passenger bookings efficiently. This project demonstrates the use of LinkedList to handle dynamic data and implements features like VIP, Normal, and Sleeper seat booking.

🔹 Features

Add a passenger with unique ID, seat number, name, contact, and description

Remove a passenger by seat number

Search for a passenger by seat number

View all bookings in a tabular format with seat type and price

Manage seat types:

VIP (Seats 1-2, ₹1000)

Normal (Seats 3-7, ₹500)

Sleeper (Seats 8-10, ₹1500)

Check available seats before booking

Simple, user-friendly console interface

🔹 Technologies Used

Java (Core Concepts: OOP, Classes, Objects)

LinkedList for dynamic passenger management

Console-based input/output

🔹 How It Works

Run the program in any Java IDE or terminal.

The menu displays options to add, remove, view, search passengers, and check available seats.

Enter the choice number and provide passenger details when required.

The system automatically assigns seat type and price based on the seat number.

All bookings are displayed in a neat table format for easy viewing.

🔹 How to Run

Clone the repository:

git clone https://github.com/DevloperDevansh/bus-reservation-system.git


Open the project in any Java IDE (Eclipse, IntelliJ, VS Code)

Compile and run BusReservationMgt.java

Follow the on-screen menu to manage bookings

🔹 Sample Output
Enter Passenger ID: 101
Enter Seat Number (1-10): 1
Enter Name: Devansh
Enter Contact: 9876543210
Enter Description: Window seat

✅ Booking Confirmed for Devansh | SeatType: VIP | Price: ₹1000

🔹 Future Enhancements

Add total revenue calculation

Add GUI interface using Java Swing or JavaFX

Save bookings to a file or database for persistence

Extend seat count and bus routes
