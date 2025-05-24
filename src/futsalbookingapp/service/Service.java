package futsalbookingapp.service;

import futsalbookingapp.entity.Booking;
import java.util.List;

public abstract class Service {
    public abstract void addBooking(Booking booking) throws Exception;
    public abstract List<Booking> getAllBookings() throws Exception;
}