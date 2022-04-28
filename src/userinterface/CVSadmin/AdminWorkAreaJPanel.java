package userinterface.CVSadmin;

import business.brandDirectory;
import business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private brandDirectory brandDirectory;
    private StoreDirectory storeDirectory;

    public AdminWorkAreaJPanel(JPanel userProcessContainer, brandDirectory brandDirectory,
            StoreDirectory storeDirectory) {
        initComponents();
        this.brandDirectory = brandDirectory;
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory = storeDirectory;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managebrandJButton = new javax.swing.JButton();
        manageStoreJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("My Work Area -Adminstrative Role");

        managebrandJButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        managebrandJButton.setText("Manage Company >>");
        managebrandJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managebrandJButtonActionPerformed(evt);
            }
        });

        manageStoreJButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        manageStoreJButton.setText("Manage Stores >>");
        manageStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
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
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(105, 105, 105)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(manageStoreJButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 289,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(managebrandJButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 289,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(btnBack)))
                                .addGap(109, 109, 109)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(managebrandJButton)
                                .addGap(32, 32, 32)
                                .addComponent(manageStoreJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44,
                                        Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(30, 30, 30)));
    }

    private void managebrandJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Managebrand mp = new Managebrand(userProcessContainer, brandDirectory);
        userProcessContainer.add("manage brand", mp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private void manageStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {

        ManageStores manageStore = new ManageStores(userProcessContainer, storeDirectory);
        userProcessContainer.add("manage Store", manageStore);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managebrandJButton;
    private javax.swing.JButton manageStoreJButton;

}
