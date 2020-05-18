/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ManageCustomers;

import Business.AirlinerCatalog;
import userInterface.ManageCustomers.ManageCustomers;
import Business.Airplane;
import Business.AirplaneCatalog;
import Business.CustomerCatalog;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.TravelAgency.ManageFlights;

/**
 *
 * @author Priyanka Malpekar
 */
public class BestFlights extends javax.swing.JPanel {

  private JPanel userControlDisplayPanel;
  private CustomerCatalog cCatalog;
 // private AirlinerCatalog aCatalog;
  private AirplaneCatalog aCatalog;
    /**
     * Creates new form BestFlights
     */
    public BestFlights(JPanel userControlDisplayPanel, AirplaneCatalog aCatalog ) {
        initComponents(); 
        this.userControlDisplayPanel=userControlDisplayPanel;
        this.aCatalog=aCatalog;
       // this.airplaneC = airplaneC;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBestFlights = new javax.swing.JLabel();
        lblMinPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldMax = new javax.swing.JTextField();
        TextFieldMin = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBestFlights = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnBookandSelect = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblBestFlights.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBestFlights.setText("BEST FLIGHTS");

        lblMinPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMinPrice.setText("Minimum Price:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Maximum Price:");

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblBestFlights.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblBestFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Airliner ID", "Flight Number", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBestFlights);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBookandSelect.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBookandSelect.setText("Select and Book");
        btnBookandSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBookandSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookandSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMinPrice)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldMax, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBookandSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(lblBestFlights)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblBestFlights)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinPrice)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookandSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userControlDisplayPanel.remove(this);
        CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
        layout.previous(userControlDisplayPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int min =Integer.parseInt(TextFieldMin.getText());
        int max=Integer.parseInt(TextFieldMax.getText());
        int n;
        
        DefaultTableModel dtm=(DefaultTableModel)tblBestFlights.getModel();
        dtm.setNumRows(0);
        if(String.valueOf(min)!=null && !String.valueOf(min).isEmpty() && String.valueOf(max)!=null &&!String.valueOf(max).isEmpty());
        
        {
        n=min;
            if(n>min)
                    {
                        n=max;
                        if(n<max)
                                {
                                    
                                }
                    }
        int a;
     for(Airplane vs:aCatalog.getAirlinerCatalog())
      
    {
    a=vs.getSeatPrice();
    
     if((min<=a) &(a<max))
     {  
    Object row[]=new Object[10];
    row[0]=vs;
    row[1]=vs.getAirlineID();
    row[2]=vs.getFlightNumber();
    row[3]=vs.getSeatPrice();
    row[4]=vs.getDate();
    
    dtm.addRow(row);
    }
        
    
    }//GEN-LAST:event_btnSubmitActionPerformed
        }}
    private void btnBookandSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookandSelectActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblBestFlights.getSelectedRow();
      if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the data first.","Warning!", JOptionPane.WARNING_MESSAGE);
        }
      else{
       Airplane a=(Airplane)tblBestFlights.getValueAt(selectedRow, 0);
       BookFlight panel=new BookFlight(userControlDisplayPanel,a);
       userControlDisplayPanel.add("BookFlight",panel);
       CardLayout layout=(CardLayout)userControlDisplayPanel.getLayout();
       layout.next(userControlDisplayPanel); 
    }
    }//GEN-LAST:event_btnBookandSelectActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldMax;
    private javax.swing.JTextField TextFieldMin;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookandSelect;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBestFlights;
    private javax.swing.JLabel lblMinPrice;
    private javax.swing.JTable tblBestFlights;
    // End of variables declaration//GEN-END:variables
}
