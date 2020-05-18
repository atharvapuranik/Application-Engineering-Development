/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalAdminWorkSpace;

import Business.Enterprise.AwarenessCampEnterprise;
import Business.Enterprise.CentralLaboratoryEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Enterprise.HospitalEnterprise;
import javax.swing.JOptionPane;

/**
 *
 * @author Anuja
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    JPanel container;
    private OrganizationDirectory directory;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel container, OrganizationDirectory directory, Enterprise enterprise) {
        initComponents();
        this.container = container;
        this.directory = directory;
        this.enterprise = enterprise;
        
        populateDropDown();
        populateTable();
        populateCombo();
        organizationJTable.getTableHeader().setFont(new Font("Times New Roman", Font.ITALIC, 23));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        addOrganizationBtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        organizationJTable.setBackground(new java.awt.Color(255, 204, 204));
        organizationJTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Organization Type");

        organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        addOrganizationBtn.setBackground(new java.awt.Color(255, 204, 204));
        addOrganizationBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addOrganizationBtn.setText("Add Organization");
        addOrganizationBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationBtnActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 204, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addOrganizationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(addOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnBack)
                .addContainerGap(317, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationBtnActionPerformed

       if(enterprise instanceof HospitalEnterprise){
            if (directory.getOrganizationList().size() == 3) {
                removeItems(); 
             }
             else{
                addItemsInDirectory();  
            }
       }
       
       if(enterprise instanceof CentralLaboratoryEnterprise) {
           if (directory.getOrganizationList().size() == 2) {
                removeItems();
            }
            else{
                addItemsInDirectory();
           }
       }
       
       if(enterprise instanceof AwarenessCampEnterprise){
           if (directory.getOrganizationList().size() == 1) {
                removeItems();
            }
            else{
                addItemsInDirectory();
           }
       }
       
       if(enterprise instanceof GovernmentEnterprise){
           if (directory.getOrganizationList().size() == 1) {
                removeItems();
            }
            else{
                addItemsInDirectory();
           }
       }
    }//GEN-LAST:event_addOrganizationBtnActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrganizationBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
        }
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        for (Organization.Type type : Organization.Type.values()) {

            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.Type.Laboratory.getValue())) {
                if (type.getValue().equals(Organization.Type.Radiology.getValue()) || type.getValue().equals(Organization.Type.Screening.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType.Hospital.getValue())) {
                if (type.getValue().equals(Organization.Type.Doctor.getValue()) || type.getValue().equals(Organization.Type.Lab.getValue()) || type.getValue().equals(Organization.Type.Visitor.getValue())) {
                    organizationJComboBox.addItem(type);

                }

            }

            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.Awareness.getValue())) {
                if (type.getValue().equals(Organization.Type.NGO.getValue())) {
                    organizationJComboBox.addItem(type);

                }
            }
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.Government.getValue())) {
                if (type.getValue().equals(Organization.Type.GovernmentFunding.getValue())) {
                    organizationJComboBox.addItem(type);

                }
            }
            
            
        }
    }

    private void populateDropDown() {
         if(enterprise instanceof HospitalEnterprise){
             if (directory.getOrganizationList().size() >= 3) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
         }else if(enterprise instanceof CentralLaboratoryEnterprise){
             if (directory.getOrganizationList().size() >= 2) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
         }else if(enterprise instanceof AwarenessCampEnterprise){
             if (directory.getOrganizationList().size() >= 1) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
         }
         else if(enterprise instanceof GovernmentEnterprise){
             if (directory.getOrganizationList().size() >= 1) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
         }
         
         
        
    }

    private void removeItems() {
        organizationJComboBox.removeAll();
        organizationJComboBox.setEnabled(false);
        JOptionPane.showMessageDialog(null, "You cannot add the same organization again. All organizations are created already.");
    }

    private void addItemsInDirectory() {
        Organization.Type type = (Organization.Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
        organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Organization added successfully.");
    }
}
