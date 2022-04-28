
package userinterface.CVSadmin;

import business.brand;
import business.brandDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class LoginbrandJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private brandDirectory brandDirectory;

    public LoginbrandJPanel(JPanel userProcessContainer, brandDirectory brandDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.brandDirectory = brandDirectory;
        initComponents();
        brandListJComboBox.removeAllItems();

        for (brand p : brandDirectory.getStoreList()) {
            brandListJComboBox.addItem(p);
        }
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        brandListJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        goJButton = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setText("Brand");

        brandListJComboBox.setModel(
                new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        brandListJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandListJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Login Brand Manage Items");

        goJButton.setText("GO>>");
        goJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goJButtonActionPerformed(evt);
            }
        });

        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel1)
                                                .addGap(41, 41, 41)
                                                .addComponent(brandListJComboBox,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78)
                                                .addComponent(goJButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(backbtn)))
                                .addContainerGap(75, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(brandListJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(goJButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62,
                                        Short.MAX_VALUE)
                                .addComponent(backbtn)
                                .addGap(51, 51, 51)));
    }

    private void goJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_goJButtonActionPerformed

        brand brand = (brand) brandListJComboBox.getSelectedItem();
        ViewbrandCompany viewbrand = new ViewbrandCompany(userProcessContainer, brand);
        userProcessContainer.add("viewBrand", viewbrand);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private void brandListJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_brandListJComboBoxActionPerformed

    }

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backbtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private javax.swing.JButton backbtn;
    private javax.swing.JButton goJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox brandListJComboBox;
}
