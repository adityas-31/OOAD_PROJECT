
package userinterface.storeAdmin;

import business.Item;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class ViewItemDetailJPanel extends javax.swing.JPanel {

    /** Creates new form CreateProductJPanel */
    private JPanel userProcessContainer;
    private Item item

    public ViewItemDetailJPanel(JPanel userProcessContainer, Item Item) {
        this.userProcessContainer = userProcessContainer;
        this.item = Item;
        initComponents();
        nameField.setText(Item.getItemName());
        ;
        idField.setText(String.valueOf(Item.getItemID()));
        txtPrice1.setText(String.valueOf(Item.getItemPrice()));
        txtAvail.setText(String.valueOf(Item.getItemAvailibility()));
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Item Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Item Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 159, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Availibility:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        txtAvail.setEditable(false);
        txtAvail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAvail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 159, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Item ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txtPrice1.setEditable(false);
        txtPrice1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }// GEN-LAST:event_backButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtPrice1;
    // End of variables declaration//GEN-END:variables

}
