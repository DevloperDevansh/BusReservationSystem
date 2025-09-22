package BusReservationSystem;

public class Passanger {

    private int id;
    private String name;
    private int seatNumber;
    private String contact;
    private String description;
    private String seatType;
    private int price;


    public Passanger(int id, String name, int seatNumber, String contact, String description) {
        this.id = id;
        this.name = name;
        this.seatNumber = seatNumber;
        this.contact = contact;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
