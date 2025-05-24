package futsalbookingapp.dao;

import futsalbookingapp.config.Koneksi;
import futsalbookingapp.entity.Booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoBooking {
    public void addBooking(Booking booking) throws SQLException {
        Connection conn = null;
        try {
            conn = Koneksi.getConnection();
            String sql = "INSERT INTO bookings (customer_name, field_number, booking_date, booking_time, duration, total_price) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, booking.getCustomerName());
                stmt.setInt(2, booking.getFieldNumber());
                stmt.setString(3, booking.getBookingDate());
                stmt.setString(4, booking.getBookingTime());
                stmt.setInt(5, booking.getDuration());
                stmt.setDouble(6, booking.getTotalPrice());
                stmt.executeUpdate();
            }
        } finally {
            Koneksi.closeConnection(conn);
        }
    }

    public List<Booking> getAllBookings() throws SQLException {
        Connection conn = null;
        List<Booking> bookings = new ArrayList<>();
        try {
            conn = Koneksi.getConnection();
            String sql = "SELECT * FROM bookings";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Booking booking = new Booking(
                        rs.getString("customer_name"),
                        rs.getInt("field_number"),
                        rs.getString("booking_date"),
                        rs.getString("booking_time"),
                        rs.getInt("duration")
                    );
                    booking.setId(rs.getInt("id"));
                    booking.setTotalPrice(rs.getDouble("total_price"));
                    bookings.add(booking);
                }
            }
        } finally {
            Koneksi.closeConnection(conn);
        }
        return bookings;
    }

    public void deleteBooking(int id) throws SQLException {
        Connection conn = null;
        try {
            conn = Koneksi.getConnection();
            String sql = "DELETE FROM bookings WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }
        } finally {
            Koneksi.closeConnection(conn);
        }
    }

    public double getTotalPriceById(int id) throws SQLException {
        Connection conn = null;
        try {
            conn = Koneksi.getConnection();
            String sql = "SELECT total_price FROM bookings WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    return rs.getDouble("total_price");
                } else {
                    throw new SQLException("Pemesanan dengan ID " + id + " tidak ditemukan.");
                }
            }
        } finally {
            Koneksi.closeConnection(conn);
        }
    }
}