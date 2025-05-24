package futsalbookingapp.tablemodel;

import futsalbookingapp.entity.Booking;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelBooking extends AbstractTableModel {
    private List<Booking> bookings;
    private String[] columnNames = {"ID", "Nama Pelanggan", "Nomor Lapangan", "Tanggal", "Waktu", "Durasi", "Total Harga"};

    public TableModelBooking() {
        this.bookings = null;
    }

    public void setData(List<Booking> bookings) {
        this.bookings = bookings;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return bookings == null ? 0 : bookings.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Booking booking = bookings.get(rowIndex);
        switch (columnIndex) {
            case 0: return booking.getId();
            case 1: return booking.getCustomerName();
            case 2: return booking.getFieldNumber();
            case 3: return booking.getBookingDate();
            case 4: return booking.getBookingTime();
            case 5: return booking.getDuration();
            case 6: return booking.getTotalPrice();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}