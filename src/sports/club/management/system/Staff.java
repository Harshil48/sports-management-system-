/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports.club.management.system;

/**
 *
 * @author Harshil
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import net.proteanit.sql.*;

public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Sports
     */
    public Staff() {
        initComponents();
        stafftable.getTableHeader().setForeground(Color.darkGray);
        stafftable.getTableHeader().setFont(new Font("Arial",Font.BOLD,14));
        stafftable.setBackground(new Color(0,0,0,0));
        staffholder.setBackground(new Color(0,0,0,0));
        staffholder.getViewport().setOpaque(false);
        addstaffholder.setVisible(false);
        removestaffholder.setVisible(false);
        display();
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carrier = new javax.swing.JScrollPane();
        support = new javax.swing.JPanel();
        holder = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        addstaff = new javax.swing.JButton();
        addstaffholder = new javax.swing.JPanel();
        staffid = new javax.swing.JLabel();
        staffidtxt = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        salary = new javax.swing.JLabel();
        salarytxt = new javax.swing.JTextField();
        type = new javax.swing.JLabel();
        typetxt = new javax.swing.JTextField();
        addr = new javax.swing.JLabel();
        addrtxt = new javax.swing.JTextField();
        contact = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        joinindate = new javax.swing.JLabel();
        jd = new com.toedter.calendar.JDateChooser();
        addstaffsubmit = new javax.swing.JButton();
        coachingsports = new javax.swing.JLabel();
        coachingsportstxt = new javax.swing.JTextField();
        removestaff = new javax.swing.JButton();
        removestaffholder = new javax.swing.JPanel();
        staffid1 = new javax.swing.JLabel();
        staffid1txt = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        removestaffsubmit = new javax.swing.JButton();
        staffholder = new javax.swing.JScrollPane();
        stafftable = new javax.swing.JTable();
        staffheader = new javax.swing.JLabel();
        imagepic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPORTS CLUB MANAGEMENT SYSTEM ");
        setAlwaysOnTop(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        carrier.setBackground(new java.awt.Color(255, 255, 255));
        carrier.setBorder(null);
        carrier.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        carrier.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        carrier.setColumnHeaderView(null);
        carrier.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        carrier.setOpaque(false);

        support.setPreferredSize(new java.awt.Dimension(1538, 1300));

        holder.setLayout(null);

        header.setBackground(new java.awt.Color(255, 204, 51));
        header.setFont(new java.awt.Font("Times New Roman", 1, 66)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Sports  Club  Management  System");
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.setOpaque(true);
        holder.add(header);
        header.setBounds(10, 10, 1500, 85);

        home.setBackground(new java.awt.Color(255, 204, 51));
        home.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        home.setText("HOME");
        home.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        holder.add(home);
        home.setBounds(1270, 110, 110, 30);

        logout.setBackground(new java.awt.Color(255, 204, 51));
        logout.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        logout.setText("LOGOUT");
        logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        holder.add(logout);
        logout.setBounds(1390, 110, 110, 30);

        addstaff.setBackground(new java.awt.Color(255, 255, 153));
        addstaff.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        addstaff.setText("ADD STAFF");
        addstaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addstaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addstaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });
        holder.add(addstaff);
        addstaff.setBounds(300, 620, 160, 60);

        addstaffholder.setOpaque(false);

        staffid.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        staffid.setText("STAFF ID");
        staffid.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        staffidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                staffidtxtKeyPressed(evt);
            }
        });

        name.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        name.setText("NAME");
        name.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametxtKeyPressed(evt);
            }
        });

        salary.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        salary.setText("SALARY");
        salary.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        salarytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salarytxtKeyPressed(evt);
            }
        });

        type.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        type.setText("TYPE");
        type.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        typetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typetxtKeyPressed(evt);
            }
        });

        addr.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        addr.setText("ADDRESS");
        addr.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        addrtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addrtxtKeyPressed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        contact.setText("CONTACT");
        contact.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        contacttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contacttxtKeyPressed(evt);
            }
        });

        DOB.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        DOB.setText("DATE OF BIRTH");
        DOB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dobKeyPressed(evt);
            }
        });

        joinindate.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        joinindate.setText("JOINING DATE");
        joinindate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdKeyPressed(evt);
            }
        });

        addstaffsubmit.setBackground(new java.awt.Color(255, 255, 102));
        addstaffsubmit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        addstaffsubmit.setText("SUBMIT");
        addstaffsubmit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addstaffsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addstaffsubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addstaffsubmit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        addstaffsubmit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addstaffsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffsubmitActionPerformed(evt);
            }
        });

        coachingsports.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        coachingsports.setText("COACHING SPORTS");
        coachingsports.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        coachingsportstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                coachingsportstxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout addstaffholderLayout = new javax.swing.GroupLayout(addstaffholder);
        addstaffholder.setLayout(addstaffholderLayout);
        addstaffholderLayout.setHorizontalGroup(
            addstaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addstaffholderLayout.createSequentialGroup()
                .addGroup(addstaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addstaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(salarytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(staffidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(typetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(type)
                        .addComponent(addrtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(contact)
                        .addComponent(DOB)
                        .addComponent(contacttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(staffid)
                        .addComponent(salary)
                        .addComponent(name)
                        .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coachingsports)
                        .addComponent(coachingsportstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addComponent(joinindate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addstaffholderLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(addstaffsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        addstaffholderLayout.setVerticalGroup(
            addstaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addstaffholderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(staffidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(joinindate)
                .addGap(0, 0, 0)
                .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOB)
                .addGap(0, 0, 0)
                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contact)
                .addGap(0, 0, 0)
                .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addr)
                .addGap(0, 0, 0)
                .addComponent(addrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type)
                .addGap(0, 0, 0)
                .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coachingsports)
                .addGap(0, 0, 0)
                .addComponent(coachingsportstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(addstaffsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        holder.add(addstaffholder);
        addstaffholder.setBounds(250, 690, 270, 490);

        removestaff.setBackground(new java.awt.Color(255, 255, 153));
        removestaff.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        removestaff.setText("REMOVE STAFF");
        removestaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removestaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removestaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removestaffActionPerformed(evt);
            }
        });
        holder.add(removestaff);
        removestaff.setBounds(630, 620, 180, 60);

        removestaffholder.setOpaque(false);

        staffid1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        staffid1.setText("STAFF ID");
        staffid1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        staffid1txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                staffid1txtKeyPressed(evt);
            }
        });

        info.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        info.setText("(Enter Staff Id of the Staff to be removed)");

        removestaffsubmit.setBackground(new java.awt.Color(255, 255, 102));
        removestaffsubmit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        removestaffsubmit.setText("SUBMIT");
        removestaffsubmit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removestaffsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removestaffsubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removestaffsubmit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        removestaffsubmit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removestaffsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removestaffsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removestaffholderLayout = new javax.swing.GroupLayout(removestaffholder);
        removestaffholder.setLayout(removestaffholderLayout);
        removestaffholderLayout.setHorizontalGroup(
            removestaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removestaffholderLayout.createSequentialGroup()
                .addGroup(removestaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(removestaffholderLayout.createSequentialGroup()
                        .addGroup(removestaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staffid1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(removestaffholderLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(removestaffsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(staffid1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        removestaffholderLayout.setVerticalGroup(
            removestaffholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removestaffholderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(staffid1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(staffid1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removestaffsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        holder.add(removestaffholder);
        removestaffholder.setBounds(590, 680, 270, 130);

        staffholder.setBackground(new java.awt.Color(255, 255, 255));
        staffholder.setBorder(null);
        staffholder.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        staffholder.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        staffholder.setOpaque(false);

        stafftable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stafftable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stafftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PLAYER ID", "NAME", "SPORT NAME", "GENDER", "ADDRESS", "CONTACT", "DATE OF BIRTH", "JOINING DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stafftable.setEnabled(false);
        stafftable.setGridColor(new java.awt.Color(0, 0, 0));
        stafftable.setOpaque(false);
        stafftable.setRowHeight(25);
        stafftable.setRowMargin(2);
        stafftable.setRowSelectionAllowed(false);
        stafftable.setShowGrid(true);
        stafftable.getTableHeader().setResizingAllowed(false);
        stafftable.getTableHeader().setReorderingAllowed(false);
        staffholder.setViewportView(stafftable);
        if (stafftable.getColumnModel().getColumnCount() > 0) {
            stafftable.getColumnModel().getColumn(0).setResizable(false);
            stafftable.getColumnModel().getColumn(6).setResizable(false);
            stafftable.getColumnModel().getColumn(7).setResizable(false);
        }

        holder.add(staffholder);
        staffholder.setBounds(30, 210, 1460, 380);

        staffheader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        staffheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffheader.setText("STAFF");
        staffheader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        holder.add(staffheader);
        staffheader.setBounds(0, 130, 1538, 80);

        imagepic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagepic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harshil\\Pictures\\Saved Pictures\\pic.png")); // NOI18N
        imagepic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        holder.add(imagepic);
        imagepic.setBounds(-20, -20, 1580, 1340);

        javax.swing.GroupLayout supportLayout = new javax.swing.GroupLayout(support);
        support.setLayout(supportLayout);
        supportLayout.setHorizontalGroup(
            supportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supportLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 1538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        supportLayout.setVerticalGroup(
            supportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supportLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(holder, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        carrier.setViewportView(support);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(carrier, javax.swing.GroupLayout.DEFAULT_SIZE, 1538, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(carrier, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1552, 843));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insert()
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Dell-HsB:1521:xe", "HSB", "4803");
            String query="insert into HSB.Staff values ('"+staffidtxt.getText()+"','"+nametxt.getText()+"','"+salarytxt.getText()+"','"+contacttxt.getText()+"','"+addrtxt.getText()+"','"+typetxt.getText()+"','"+coachingsportstxt.getText()+"',?,?)";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,((JTextField)dob.getDateEditor().getUiComponent()).getText());
            pstmt.setString(2,((JTextField)jd.getDateEditor().getUiComponent()).getText());
            pstmt.execute();
            con.close();
            staffidtxt.setText(null);
            nametxt.setText(null);
            salarytxt.setText(null);
            typetxt.setText(null);
            addrtxt.setText(null);
            contacttxt.setText(null);
            dob.setDate(null);
            jd.setDate(null);
            coachingsportstxt.setText(null);
            staffidtxt.requestFocus();
           } catch (Exception e) {
            JOptionPane.showMessageDialog(removestaff, "STAFF ID ALREADY EXISTS", "ERROR", JOptionPane.ERROR_MESSAGE);
       } 
    }
    
    private void display()
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Dell-HsB:1521:xe", "HSB", "4803");
            Statement stmt=con.createStatement();
            String query="select * from HSB.Staff order by staff_id";
            ResultSet rs=stmt.executeQuery(query);
            stafftable.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
           } catch (Exception e) {
            System.out.println(e);
       } 
    }
    
    private void remove()
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Dell-HsB:1521:xe", "system", "0000");
            Statement stmt=con.createStatement();
            String query="delete HSB.Staff where staff_id = '"+staffid1txt.getText()+"' ";
            ResultSet rs=stmt.executeQuery(query);
            con.close();
           } catch (Exception e) {
            System.out.println(e);
       } 
    }
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        new Home().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        JOptionPane.showMessageDialog(stafftable, "SUCCESSFULLY LOGGED OUT", "LOGOUT",JOptionPane.INFORMATION_MESSAGE);
        new SCMS().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void removestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removestaffActionPerformed
        addstaffholder.setVisible(false);
        removestaffholder.setVisible(true);
    }//GEN-LAST:event_removestaffActionPerformed

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        removestaffholder.setVisible(false);
        addstaffholder.setVisible(true);
    }//GEN-LAST:event_addstaffActionPerformed

    private void removestaffsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removestaffsubmitActionPerformed
        if(staffid1txt.getText().isBlank())
        {
            JOptionPane.showMessageDialog(removestaff, "ENTER VALID STAFF ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
        remove();
        display();
        staffid1txt.setText(null);
        }
    }//GEN-LAST:event_removestaffsubmitActionPerformed

    private void staffidtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffidtxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            nametxt.requestFocus();
        }
    }//GEN-LAST:event_staffidtxtKeyPressed

    private void salarytxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarytxtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            jd.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            nametxt.requestFocus();
        }
        }
    }//GEN-LAST:event_salarytxtKeyPressed

    private void typetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typetxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            coachingsportstxt.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            addrtxt.requestFocus();
        }
        }
    }//GEN-LAST:event_typetxtKeyPressed

    private void staffid1txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffid1txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            if(staffid1txt.getText().isBlank())
        {
            JOptionPane.showMessageDialog(removestaff, "ENTER VALID STAFF ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        else
        {
        remove();
        display();
        staffid1txt.setText(null);
        }
        }   
    }//GEN-LAST:event_staffid1txtKeyPressed

    private void addrtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addrtxtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            typetxt.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            contacttxt.requestFocus();
        }
        }
    }//GEN-LAST:event_addrtxtKeyPressed

    private void contacttxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contacttxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            addrtxt.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            dob.requestFocus();
        }
        }
    }//GEN-LAST:event_contacttxtKeyPressed

    private void addstaffsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffsubmitActionPerformed
        if(staffidtxt.getText().isBlank()||staffidtxt.getText().isBlank()||nametxt.getText().isBlank()||salarytxt.getText().isBlank()||typetxt.getText().isBlank()||addrtxt.getText().isBlank()||contacttxt.getText().isBlank()||dob.getDate()==null||jd.getDate()==null)
        {
            JOptionPane.showMessageDialog(removestaff, "ALL FIELDS ARE MANADATORY", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        insert();
        display();
        }
    }//GEN-LAST:event_addstaffsubmitActionPerformed

    private void nametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            salarytxt.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            staffidtxt.requestFocus();
        }
        }
    }//GEN-LAST:event_nametxtKeyPressed

    private void dobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            contacttxt.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            jd.requestFocus();
        }
        }
    }//GEN-LAST:event_dobKeyPressed

    private void jdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            dob.requestFocus();
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            salarytxt.requestFocus();
        }
        }
    }//GEN-LAST:event_jdKeyPressed

    private void coachingsportstxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coachingsportstxtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             if(staffidtxt.getText().isBlank()||nametxt.getText().isBlank()||salarytxt.getText().isBlank()||typetxt.getText().isBlank()||addrtxt.getText().isBlank()||contacttxt.getText().isBlank()||dob.getDate()==null||jd.getDate()==null)
        {
            JOptionPane.showMessageDialog(removestaff, "ALL FIELDS ARE MANADATORY", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        insert();
        display();
        }
         }
         else
         {
            if(evt.getKeyCode()==KeyEvent.VK_UP)
        {
            typetxt.requestFocus();
        } 
         }
    }//GEN-LAST:event_coachingsportstxtKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel addr;
    private javax.swing.JTextField addrtxt;
    private javax.swing.JButton addstaff;
    private javax.swing.JPanel addstaffholder;
    private javax.swing.JButton addstaffsubmit;
    private javax.swing.JScrollPane carrier;
    private javax.swing.JLabel coachingsports;
    private javax.swing.JTextField coachingsportstxt;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contacttxt;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel header;
    private javax.swing.JPanel holder;
    private javax.swing.JButton home;
    private javax.swing.JLabel imagepic;
    private javax.swing.JLabel info;
    private com.toedter.calendar.JDateChooser jd;
    private javax.swing.JLabel joinindate;
    private javax.swing.JButton logout;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton removestaff;
    private javax.swing.JPanel removestaffholder;
    private javax.swing.JButton removestaffsubmit;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JLabel staffheader;
    private javax.swing.JScrollPane staffholder;
    private javax.swing.JLabel staffid;
    private javax.swing.JLabel staffid1;
    private javax.swing.JTextField staffid1txt;
    private javax.swing.JTextField staffidtxt;
    private javax.swing.JTable stafftable;
    private javax.swing.JPanel support;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typetxt;
    // End of variables declaration//GEN-END:variables
}
