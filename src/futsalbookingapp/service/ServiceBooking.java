package futsalbookingapp.service;

import futsalbookingapp.dao.DaoBooking;
import futsalbookingapp.entity.Booking;
import java.util.List;

public class ServiceBooking extends Service {
    private DaoBooking dao;

    public ServiceBooking() {
        this.dao = new DaoBooking();
    }

    @Override
    public void addBooking(Booking booking) throws Exception {
        dao.addBooking(booking);
    }

    @Override
    public List<Booking> getAllBookings() throws Exception {
        return dao.getAllBookings();
    }
}