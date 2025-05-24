package futsalbookingapp.gui;

import futsalbookingapp.entity.Booking;
import futsalbookingapp.service.ServiceBooking;
import javax.swing.JOptionPane;

public class FrmBooking extends javax.swing.JFrame {
    private ServiceBooking service;

    public FrmBooking() {
        initComponents();
        service = new ServiceBooking();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtFieldNumber = new javax.swing.JTextField();
        txtBookingDate = new javax.swing.JTextField();
        txtBookingTime = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Pemesanan");

        jLabel1.setText("Nama Pelanggan:");
        jLabel2.setText("Nomor Lapangan:");
        jLabel3.setText("Tanggal Pemesanan (YYYY-MM-DD):");
        jLabel4.setText("Waktu Pemesanan (HH:MM):");
        jLabel5.setText("Durasi (jam):");

        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustomerName)
                    .addComponent(txtFieldNumber)
                    .addComponent(txtBookingDate)
                    .addComponent(txtBookingTime)
                    .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBookingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String customerName = txtCustomerName.getText().trim();
            int fieldNumber = Integer.parseInt(txtFieldNumber.getText().trim());
            String bookingDate = txtBookingDate.getText().trim();
            String bookingTime = txtBookingTime.getText().trim();
            int duration = Integer.parseInt(txtDuration.getText().trim());

            if (customerName.isEmpty() || fieldNumber <= 0 || duration <= 0) {
                throw new IllegalArgumentException("Semua field harus diisi dengan nilai valid.");
            }

            Booking booking = new Booking(customerName, fieldNumber, bookingDate, bookingTime, duration);
            service.addBooking(booking);
            JOptionPane.showMessageDialog(this, "Pemesanan berhasil disimpan!");
            clearFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Nomor lapangan dan durasi harus angka.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new FrmMainMenu().setVisible(true);
    }

    private void clearFields() {
        txtCustomerName.setText("");
        txtFieldNumber.setText("");
        txtBookingDate.setText("");
        txtBookingTime.setText("");
        txtDuration.setText("");
    }

    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBookingDate;
    private javax.swing.JTextField txtBookingTime;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFieldNumber;
}