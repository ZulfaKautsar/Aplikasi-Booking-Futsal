package futsalbookingapp.entity;

public class Booking {
    private int id;
    private String customerName;
    private int fieldNumber;
    private String bookingDate;
    private String bookingTime;
    private int duration;
    private double totalPrice;

    public Booking(String customerName, int fieldNumber, String bookingDate, String bookingTime, int duration) {
        this.customerName = customerName;
        this.fieldNumber = fieldNumber;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.duration = duration;
        this.totalPrice = duration * 50000; // Harga per jam: Rp50.000
    }

    // Getters dan Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public int getFieldNumber() { return fieldNumber; }
    public void setFieldNumber(int fieldNumber) { this.fieldNumber = fieldNumber; }
    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }
    public String getBookingTime() { return bookingTime; }
    public void setBookingTime(String bookingTime) { this.bookingTime = bookingTime; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
}