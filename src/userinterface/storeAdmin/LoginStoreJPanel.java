package userinterface.storeAdmin;

import business.brandDirectory;
import business.Store;
import business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class LoginStoreJPanel extends javax.swing.JPanel {

        private JPanel userProcessContainer;
        private StoreDirectory storeDirectory;
        private brandDirectory brandDirectory;

        public LoginStoreJPanel(JPanel userProcessContainer, brandDirectory brandDirectory,
                        StoreDirectory storeDirectory) {
                this.userProcessContainer = userProcessContainer;
                this.storeDirectory = storeDirectory;
                this.brandDirectory = brandDirectory;
                initComponents();

                storeJComboBox.removeAllItems();

                for (Store store : storeDirectory.getStoreList()) {
                        storeJComboBox.addItem(store);
                }
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                storeJComboBox = new javax.swing.JComboBox();
                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                backBtn = new javax.swing.JButton();

                storeJComboBox.setModel(
                                new javax.swing.DefaultComboBoxModel(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                jButton1.setText("Go>>");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
                jLabel1.setText("Store Login");

                jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
                jLabel2.setText("Store Name");

                backBtn.setText("<<Back");
                backBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backBtnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(jLabel2)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(storeJComboBox,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                62,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1)
                                                                .addGap(43, 43, 43))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(158, 158, 158)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(38, 38, 38)
                                                                                                .addComponent(backBtn)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addGap(55, 55, 55)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(storeJComboBox,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton1)
                                                                                .addComponent(jLabel2))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                132,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(backBtn)
                                                                .addGap(38, 38, 38)));
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

                Store store = (Store) storeJComboBox.getSelectedItem();
                StoreWorkAreaJPanel swap = new StoreWorkAreaJPanel(userProcessContainer, brandDirectory,
                                store);
                userProcessContainer.add("store area", swap);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }

        private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
        }

        private javax.swing.JButton backBtn;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JComboBox storeJComboBox;

}
