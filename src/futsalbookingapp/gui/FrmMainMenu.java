package futsalbookingapp.gui;

import javax.swing.JOptionPane;

public class FrmMainMenu extends javax.swing.JFrame {
    public FrmMainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        btnBooking = new javax.swing.JButton();
        btnViewBookings = new javax.swing.JButton();
        btnCancelBooking = new javax.swing.JButton();
        btnCheckAvailability = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pemesanan Futsal");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel1.setText("SELAMAT DATANG");

        btnBooking.setText("Booking");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        btnViewBookings.setText("Lihat Pemesanan");
        btnViewBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookingsActionPerformed(evt);
            }
        });

        btnCancelBooking.setText("Batalkan Pemesanan");
        btnCancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBookingActionPerformed(evt);
            }
        });

        btnCheckAvailability.setText("Cek Ketersediaan");
        btnCheckAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAvailabilityActionPerformed(evt);
            }
        });

        btnPayment.setText("Pembayaran");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnGenerateReport.setText("Buat Laporan");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnBooking)
                .addGap(18, 18, 18)
                .addComponent(btnViewBookings)
                .addGap(18, 18, 18)
                .addComponent(btnCancelBooking)
                .addGap(18, 18, 18)
                .addComponent(btnCheckAvailability)
                .addGap(18, 18, 18)
                .addComponent(btnPayment)
                .addGap(18, 18, 18)
                .addComponent(btnGenerateReport)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmBooking().setVisible(true);
    }

    private void btnViewBookingsActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmViewBookings().setVisible(true);
    }

    private void btnCancelBookingActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmCancelBooking().setVisible(true);
    }

    private void btnCheckAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmCheckAvailability().setVisible(true);
    }

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmPayment().setVisible(true);
    }

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmGenerateReport().setVisible(true);
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        new FrmLogin().setVisible(true);
        this.dispose();
    }

    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnViewBookings;
    private javax.swing.JButton btnCancelBooking;
    private javax.swing.JButton btnCheckAvailability;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
}