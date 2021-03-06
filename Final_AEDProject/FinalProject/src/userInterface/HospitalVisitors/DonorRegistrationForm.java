/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalVisitors;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import Business.Organization.Organization;
import Business.RegularExpressionCheck;
import java.time.Clock;
import javax.swing.JOptionPane;

/**
 *
 * @author Priyanka
 */
public class DonorRegistrationForm extends javax.swing.JPanel {

    /**
     * Creates new form DonarRegistrationForm
     */
    JPanel rightPanel;
    Organization organization;
    String email;
    String emailAdd;
    public DonorRegistrationForm(JPanel rightPanel, Organization organization, String email) {
        initComponents();
        this.rightPanel=rightPanel;
        this.organization=organization;
        this.email= email;
        this.emailAdd=email;
        String emailAdd=email;
        emailIdTextField.setText(email);
        groupButton1();
        groupButton2();
    }
    
    public DonorRegistrationForm(JPanel rightPanel, Organization organization) {
        initComponents();
        this.rightPanel=rightPanel;
        this.organization=organization;
        groupButton1();
        groupButton2();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailIdTextField = new javax.swing.JTextField();
        contactNumTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emergencyContactNameTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emergencyContactNumTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        corneasCheckBox = new javax.swing.JCheckBox();
        kidneysCheckBox = new javax.swing.JCheckBox();
        heartCheckBox = new javax.swing.JCheckBox();
        lungsCheckBox = new javax.swing.JCheckBox();
        liverCheckBox = new javax.swing.JCheckBox();
        pancreasCheckBox = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        signatureTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        organAvailRadioButton = new javax.swing.JRadioButton();
        organNotAvailRadioButton = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Donor Registration Form");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Name:");

        nameTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Age:");

        ageTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Sex:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Blood Group:");

        maleRadioBtn.setBackground(new java.awt.Color(255, 204, 204));
        maleRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        maleRadioBtn.setText("Male");

        femaleRadioBtn.setBackground(new java.awt.Color(255, 204, 204));
        femaleRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        femaleRadioBtn.setText("Female");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Contact Number:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Email Id:");

        emailIdTextField.setEditable(false);
        emailIdTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        emailIdTextField.setEnabled(false);
        emailIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIdTextFieldActionPerformed(evt);
            }
        });

        contactNumTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Address:");

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel9.setText("In Emergency, Person of Contact");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Name:");

        emergencyContactNameTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Contact Number:");

        emergencyContactNumTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        emergencyContactNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyContactNumTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        jLabel12.setText("After My Death I would like to donate:");

        corneasCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        corneasCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        corneasCheckBox.setText("Corneas");

        kidneysCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        kidneysCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        kidneysCheckBox.setText("Kidney");

        heartCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        heartCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        heartCheckBox.setText("Heart");

        lungsCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        lungsCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        lungsCheckBox.setText("Lungs");

        liverCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        liverCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        liverCheckBox.setText("Liver");

        pancreasCheckBox.setBackground(new java.awt.Color(255, 204, 204));
        pancreasCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        pancreasCheckBox.setText("Pancreas");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel14.setText("Digital Signature:");

        signatureTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        registerButton.setBackground(new java.awt.Color(153, 204, 255));
        registerButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        registerButton.setText("Register");
        registerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Organ Available Now?");

        organAvailRadioButton.setBackground(new java.awt.Color(255, 204, 204));
        organAvailRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        organAvailRadioButton.setText("Yes");

        organNotAvailRadioButton.setBackground(new java.awt.Color(255, 204, 204));
        organNotAvailRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        organNotAvailRadioButton.setText("NO");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-positive", "O-negative ", "A-positive", "A-negative", "B-positive", "B-negative", "AB-positive", "AB-negative" }));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/IMAGES/Donate.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(16, 16, 16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(39, 39, 39))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(16, 16, 16))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(3, 3, 3))
                                        .addComponent(jLabel3))
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(maleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(femaleRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(contactNumTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailIdTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(158, 158, 158)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(heartCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lungsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(liverCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(pancreasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(corneasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(kidneysCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel15)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(organAvailRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(organNotAvailRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(253, 253, 253)
                                        .addComponent(jLabel1)))
                                .addGap(397, 397, 397))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emergencyContactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emergencyContactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                            .addComponent(signatureTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maleRadioBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(femaleRadioBtn)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(contactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emergencyContactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(emergencyContactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(signatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corneasCheckBox)
                            .addComponent(kidneysCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lungsCheckBox)
                            .addComponent(heartCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(liverCheckBox)
                            .addComponent(pancreasCheckBox))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(organAvailRadioButton)
                            .addComponent(organNotAvailRadioButton))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String name = nameTextField.getText();
        //int age = Integer.parseInt(ageTextField.getText());
        String sex ="";
        if(maleRadioBtn.isSelected())
            sex = maleRadioBtn.getText();
        
        if(femaleRadioBtn.isSelected()) 
            sex = femaleRadioBtn.getText();
        
       
        Object bloodGroup = jComboBox1.getSelectedItem();
        //System.out.println("SEX       " +maleRadioBtn.isSelected() );

        String contactNum = contactNumTextField.getText(); 
        String address = addressTextArea.getText();
        String emergencyPOC = emergencyContactNameTextField.getText();
        String emergencyPOC_Num = emergencyContactNumTextField.getText();
        String sign = signatureTextField.getText();
        //ADDED
       // String emailAdd = emailIdTextField.getText();
        
        
        boolean isOrganAvaiNow = false;
        if(organAvailRadioButton.isSelected())
            isOrganAvaiNow = true;
        else if(organNotAvailRadioButton.isSelected())
            isOrganAvaiNow = false;
           
        List<String> organs = new ArrayList<String>();

        if(corneasCheckBox.isSelected())
            organs.add(corneasCheckBox.getText());
        if(heartCheckBox.isSelected())
            organs.add(heartCheckBox.getText());
        if(kidneysCheckBox.isSelected())
            organs.add(kidneysCheckBox.getText());
        if(lungsCheckBox.isSelected())
            organs.add(lungsCheckBox.getText());
        if(liverCheckBox.isSelected())
            organs.add(liverCheckBox.getText());
        if(pancreasCheckBox.isSelected())
            organs.add(pancreasCheckBox.getText());

        
        //all fields should be filled
        //remove EemailAdd.equals("") from here
        if(name.equals("") || sex.equals("") || sign.equals("") || emergencyPOC.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the details.");
            return;
        }
        if(!(organAvailRadioButton.isSelected() || organNotAvailRadioButton.isSelected())){
            JOptionPane.showMessageDialog(null, "Please select whether Organ currently available.");
            return;
        }
        if(!(corneasCheckBox.isSelected() || heartCheckBox.isSelected() || kidneysCheckBox.isSelected() ||
                lungsCheckBox.isSelected() || liverCheckBox.isSelected() || pancreasCheckBox.isSelected())){
            JOptionPane.showMessageDialog(null, "Please select atleast one organ to donate..");
            return;
        }
        int age;
        
        try
           {
        
            age =  Integer.parseInt(ageTextField.getText());
            
            if(age > 120 || age < 18){
                JOptionPane.showMessageDialog(null , "Please enter correct age.");
                ageTextField.setText("");
                 return;
            }
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Age should be numeric."); 
            ageTextField.setText("");
               return;
           }
        
        //check valid name
        if(!RegularExpressionCheck.findRE(name) || !RegularExpressionCheck.findRE(emergencyPOC) || !RegularExpressionCheck.findRE(sign)){
            JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
        }
        //check for valid emailId
        if(!RegularExpressionCheck.isValidEmailAddress(emailAdd)){
            JOptionPane.showMessageDialog(null, " Invalid Username." + 
                "Username should be an email-ID with '_' and '@' as the only allowed special characters but should not start with '_'");
            return;
        }
        //check valid phone number
        if(!RegularExpressionCheck.isValidPhoneNum(contactNum) || !RegularExpressionCheck.isValidPhoneNum(emergencyPOC_Num)){
            JOptionPane.showMessageDialog(null, " Invalid phonenumber." + 
                "Phone number should be 10 digit number between 0-9.");
            return;
        }

         
        
        if(organization != null && organization.getDonorDirectory() != null){
           
            organization.getDonorDirectory().createDonor(name, age, sex, (String) bloodGroup, contactNum, 
                address, sign, emailAdd, emergencyPOC, emergencyPOC_Num, isOrganAvaiNow, organs);
            JOptionPane.showMessageDialog(null, "You have registered successfully.");
       
            rightPanel.remove(this);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.previous(rightPanel);
 
        }
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void emailIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIdTextFieldActionPerformed

    private void emergencyContactNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyContactNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyContactNumTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField contactNumTextField;
    private javax.swing.JCheckBox corneasCheckBox;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JTextField emergencyContactNameTextField;
    private javax.swing.JTextField emergencyContactNumTextField;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JCheckBox heartCheckBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox kidneysCheckBox;
    private javax.swing.JCheckBox liverCheckBox;
    private javax.swing.JCheckBox lungsCheckBox;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton organAvailRadioButton;
    private javax.swing.JRadioButton organNotAvailRadioButton;
    private javax.swing.JCheckBox pancreasCheckBox;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField signatureTextField;
    // End of variables declaration//GEN-END:variables

    private void groupButton1() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioBtn);
        buttonGroup.add(femaleRadioBtn);
    }
    
    private void groupButton2() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(organAvailRadioButton);
        buttonGroup.add(organNotAvailRadioButton);
    }

    
}
