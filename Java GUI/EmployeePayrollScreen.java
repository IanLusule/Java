
public class EmployeePayrollScreen extends javax.swing.JFrame {

   
    public EmployeePayrollScreen() {
        initComponents();
    }

    
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelEmployeeIdentification1 = new javax.swing.JPanel();
        jLabelEmployeeIdentification1 = new javax.swing.JLabel();
        jTxtEmployeeName = new javax.swing.JTextField();
        jTxtHourlySalary = new javax.swing.JTextField();
        jLabelHourlySalary1 = new javax.swing.JLabel();
        jPanelEmployeeIdentification = new javax.swing.JPanel();
        jLabelFirstWeek = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtMondaySecondWeek = new javax.swing.JTextField();
        jTxtMondayFirstWeek = new javax.swing.JTextField();
        jLabelFirstWeek1 = new javax.swing.JLabel();
        jTxtTuesdaySecondWeek = new javax.swing.JTextField();
        jTxtTuesdayFirstWeek = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtWednesdaySecondWeek = new javax.swing.JTextField();
        jTxtThursdayFirstWeek = new javax.swing.JTextField();
        jTxtWednesdayFirstWeek = new javax.swing.JTextField();
        jTxtFridayFirstWeek = new javax.swing.JTextField();
        jTxtThursdaySecondWeek = new javax.swing.JTextField();
        jTxtSaturdayFirstWeek = new javax.swing.JTextField();
        jTxtSaturdaySecondWeek = new javax.swing.JTextField();
        jTxtFridaySecondWeek = new javax.swing.JTextField();
        jTxtSundayFirstWeek = new javax.swing.JTextField();
        jTxtSundaySecondWeek = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelEmployeeIdentification2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtOvertime = new javax.swing.JTextField();
        jTxtRegularHours = new javax.swing.JTextField();
        jTxtAmountOvertime = new javax.swing.JTextField();
        jTxtNetPay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTxtAmountRegular = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Georgetown Cleaning Services-Employee Payroll");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("aakar", 1, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        jPanelEmployeeIdentification1.setBackground(new java.awt.Color(204, 204, 204));
        jPanelEmployeeIdentification1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Employee Identification"));
        jPanelEmployeeIdentification1.setToolTipText("Employee Identification");

        jLabelEmployeeIdentification1.setText("Employee Name:");

        jTxtEmployeeName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtHourlySalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtHourlySalary.setText("10.00");
        jTxtHourlySalary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelHourlySalary1.setText("Hourly Salary");

        javax.swing.GroupLayout jPanelEmployeeIdentification1Layout = new javax.swing.GroupLayout(jPanelEmployeeIdentification1);
        jPanelEmployeeIdentification1.setLayout(jPanelEmployeeIdentification1Layout);
        jPanelEmployeeIdentification1Layout.setHorizontalGroup(
            jPanelEmployeeIdentification1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeIdentification1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabelEmployeeIdentification1)
                .addGap(18, 18, 18)
                .addComponent(jTxtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabelHourlySalary1)
                .addGap(18, 18, 18)
                .addComponent(jTxtHourlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelEmployeeIdentification1Layout.setVerticalGroup(
            jPanelEmployeeIdentification1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeIdentification1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelEmployeeIdentification1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmployeeIdentification1)
                    .addComponent(jTxtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtHourlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHourlySalary1))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanelEmployeeIdentification.setBackground(new java.awt.Color(204, 204, 204));
        jPanelEmployeeIdentification.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Time Sheet"));
        jPanelEmployeeIdentification.setToolTipText("Employee Identification");

        jLabelFirstWeek.setText("First Week:");

        jLabel1.setText("Monday");

        jTxtMondaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtMondaySecondWeek.setText("0.00");
        jTxtMondaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtMondayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtMondayFirstWeek.setText("0.00");
        jTxtMondayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelFirstWeek1.setText("Second Week:");

        jTxtTuesdaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtTuesdaySecondWeek.setText("0.00");
        jTxtTuesdaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtTuesdayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtTuesdayFirstWeek.setText("0.00");
        jTxtTuesdayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setText("Tuesday");

        jTxtWednesdaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtWednesdaySecondWeek.setText("0.00");
        jTxtWednesdaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtThursdayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtThursdayFirstWeek.setText("0.00");
        jTxtThursdayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtWednesdayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtWednesdayFirstWeek.setText("0.00");
        jTxtWednesdayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtFridayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFridayFirstWeek.setText("0.00");
        jTxtFridayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtThursdaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtThursdaySecondWeek.setText("0.00");
        jTxtThursdaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtSaturdayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtSaturdayFirstWeek.setText("0.00");
        jTxtSaturdayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtSaturdaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtSaturdaySecondWeek.setText("0.00");
        jTxtSaturdaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtFridaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtFridaySecondWeek.setText("0.00");
        jTxtFridaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtSundayFirstWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtSundayFirstWeek.setText("0.00");
        jTxtSundayFirstWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTxtSundaySecondWeek.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtSundaySecondWeek.setText("0.00");
        jTxtSundaySecondWeek.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setText("Wednesday");

        jLabel5.setText("Thursday");

        jLabel6.setText("Friday");

        jLabel7.setText("Sunday");

        jLabel8.setText("Saturday");

        javax.swing.GroupLayout jPanelEmployeeIdentificationLayout = new javax.swing.GroupLayout(jPanelEmployeeIdentification);
        jPanelEmployeeIdentification.setLayout(jPanelEmployeeIdentificationLayout);
        jPanelEmployeeIdentificationLayout.setHorizontalGroup(
            jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFirstWeek)
                            .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                                .addComponent(jLabelFirstWeek1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtMondaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtTuesdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTuesdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)))
                .addGap(29, 29, 29)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtWednesdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtWednesdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTxtThursdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtThursdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addComponent(jTxtFridaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtSaturdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeIdentificationLayout.createSequentialGroup()
                                .addComponent(jTxtFridayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeIdentificationLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtSaturdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8)))))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtSundaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jTxtSundayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jTxtMondayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(646, Short.MAX_VALUE)))
        );
        jPanelEmployeeIdentificationLayout.setVerticalGroup(
            jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addComponent(jLabel5)))
                    .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstWeek, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtTuesdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtThursdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtWednesdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtFridayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtSaturdayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtSundayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMondaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstWeek1)
                    .addComponent(jTxtTuesdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtWednesdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtThursdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSaturdaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFridaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSundaySecondWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanelEmployeeIdentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmployeeIdentificationLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jTxtMondayFirstWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        jPanelEmployeeIdentification2.setBackground(new java.awt.Color(204, 204, 204));
        jPanelEmployeeIdentification2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Payroll Processing"));
        jPanelEmployeeIdentification2.setToolTipText("Employee Identification");

        jLabel2.setText("Hours");

        jTxtOvertime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtOvertime.setText("0.00");
        jTxtOvertime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTxtOvertime.setEnabled(false);

        jTxtRegularHours.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtRegularHours.setText("0.00");
        jTxtRegularHours.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTxtRegularHours.setEnabled(false);

        jTxtAmountOvertime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtAmountOvertime.setText("0.00");
        jTxtAmountOvertime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTxtAmountOvertime.setEnabled(false);

        jTxtNetPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtNetPay.setText("0.00");
        jTxtNetPay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTxtNetPay.setEnabled(false);

        jLabel9.setText("Amount");

        jLabel10.setText("Regular:");

        jLabel11.setText("Overtime:");

        jButtonClose.setBackground(new java.awt.Color(204, 204, 204));
        jButtonClose.setText("Close");
        jButtonClose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("Net Pay:");

        jTxtAmountRegular.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtAmountRegular.setText("0.00");
        jTxtAmountRegular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTxtAmountRegular.setEnabled(false);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Process It");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEmployeeIdentification2Layout = new javax.swing.GroupLayout(jPanelEmployeeIdentification2);
        jPanelEmployeeIdentification2.setLayout(jPanelEmployeeIdentification2Layout);
        jPanelEmployeeIdentification2Layout.setHorizontalGroup(
            jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeIdentification2Layout.createSequentialGroup()
                .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEmployeeIdentification2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9))
                    .addGroup(jPanelEmployeeIdentification2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(39, 39, 39)
                        .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtRegularHours, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtOvertime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtAmountRegular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtAmountOvertime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addComponent(jLabel12)
                .addGap(40, 40, 40)
                .addComponent(jTxtNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelEmployeeIdentification2Layout.setVerticalGroup(
            jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeIdentification2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeeIdentification2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTxtNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeIdentification2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtRegularHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTxtAmountRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtAmountOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jTxtOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))))
            .addGroup(jPanelEmployeeIdentification2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelEmployeeIdentification2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEmployeeIdentification2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelEmployeeIdentification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelEmployeeIdentification1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanelEmployeeIdentification1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEmployeeIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEmployeeIdentification2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
          double hourlySalary =  Double.parseDouble(jTxtHourlySalary.getText());
          double m1 = Double.parseDouble(jTxtMondayFirstWeek.getText());
          double m2 = Double.parseDouble(jTxtMondaySecondWeek.getText());
          double t1 = Double.parseDouble(jTxtTuesdayFirstWeek.getText());
          double t2 = Double.parseDouble(jTxtTuesdaySecondWeek.getText());
          double w1 = Double.parseDouble(jTxtWednesdayFirstWeek.getText());
          double w2 = Double.parseDouble(jTxtWednesdaySecondWeek.getText());
          double th1 = Double.parseDouble(jTxtThursdayFirstWeek.getText());
          double th2 = Double.parseDouble(jTxtThursdaySecondWeek.getText());
          double f1 = Double.parseDouble(jTxtFridayFirstWeek.getText());
          double f2 = Double.parseDouble(jTxtFridaySecondWeek.getText());
          double sa1 = Double.parseDouble(jTxtSaturdayFirstWeek.getText());
          double sa2 = Double.parseDouble(jTxtSaturdaySecondWeek.getText());
          double s1 = Double.parseDouble(jTxtSundayFirstWeek.getText());
          double s2 = Double.parseDouble(jTxtSundaySecondWeek.getText());
          
          double array[] = {m1,m2,t1,t2,w1,w2,th1,th2,f1,f2,sa1,sa2,s1,s2};
          double overtime =0;
          double regular = 0;
          
          for (int i = 0; i < 14; i++){
              if (array[i] > 8){
                  regular += 8;
                  overtime += (array[i] - 8);
              }
              else if(array[i] == 8){
                  regular += array[i];
              }
              else{
                  regular += array[i];
              }
          }
          jTxtRegularHours.setText(String.valueOf(regular));
          jTxtOvertime.setText(String.valueOf(overtime));
          
          double regularSalary = hourlySalary * regular;
          jTxtAmountRegular.setText(String.valueOf(regularSalary));
          
          double overtimeSalary = 27.78 * overtime;
        jTxtAmountOvertime.setText(String.format("%.2f", overtimeSalary));

          
          double netPay = regularSalary + overtimeSalary;
          jTxtNetPay.setText(String.valueOf(netPay));
          
    
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeePayrollScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePayrollScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePayrollScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePayrollScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePayrollScreen().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEmployeeIdentification1;
    private javax.swing.JLabel jLabelFirstWeek;
    private javax.swing.JLabel jLabelFirstWeek1;
    private javax.swing.JLabel jLabelHourlySalary1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEmployeeIdentification;
    private javax.swing.JPanel jPanelEmployeeIdentification1;
    private javax.swing.JPanel jPanelEmployeeIdentification2;
    private javax.swing.JTextField jTxtAmountOvertime;
    private javax.swing.JTextField jTxtAmountRegular;
    private javax.swing.JTextField jTxtEmployeeName;
    private javax.swing.JTextField jTxtFridayFirstWeek;
    private javax.swing.JTextField jTxtFridaySecondWeek;
    private javax.swing.JTextField jTxtHourlySalary;
    private javax.swing.JTextField jTxtMondayFirstWeek;
    private javax.swing.JTextField jTxtMondaySecondWeek;
    private javax.swing.JTextField jTxtNetPay;
    private javax.swing.JTextField jTxtOvertime;
    private javax.swing.JTextField jTxtRegularHours;
    private javax.swing.JTextField jTxtSaturdayFirstWeek;
    private javax.swing.JTextField jTxtSaturdaySecondWeek;
    private javax.swing.JTextField jTxtSundayFirstWeek;
    private javax.swing.JTextField jTxtSundaySecondWeek;
    private javax.swing.JTextField jTxtThursdayFirstWeek;
    private javax.swing.JTextField jTxtThursdaySecondWeek;
    private javax.swing.JTextField jTxtTuesdayFirstWeek;
    private javax.swing.JTextField jTxtTuesdaySecondWeek;
    private javax.swing.JTextField jTxtWednesdayFirstWeek;
    private javax.swing.JTextField jTxtWednesdaySecondWeek;
   
}
