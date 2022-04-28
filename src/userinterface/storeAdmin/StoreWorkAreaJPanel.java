
package userinterface.storeAdmin;

import business.MasterOrderCatalog;
import business.brandDirectory;
import business.Store;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class StoreWorkAreaJPanel extends javax.swing.JPanel {

    /** Creates new form ProductManagerWorkAreaJPanel */
    private JPanel userProcessContainer;
    private brandDirectory brandDirectory;
    private Store store;

    public StoreWorkAreaJPanel(JPanel userProcessContainer, brandDirectory brandDirectory, Store store) {
        this.userProcessContainer = userProcessContainer;
        this.brandDirectory = brandDirectory;
        this.store = store;
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BrowseJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BrowseJButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area (Customer Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        BrowseJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BrowseJButton.setText("Browse Item Catalog >>");
        BrowseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseJButtonActionPerformed(evt);
            }
        });
        add(BrowseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Order items from CVS brand");
        jLabel2.setIconTextGap(7);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        BrowseJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BrowseJButton1.setText("Browse Stores >>");
        BrowseJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseJButton1ActionPerformed(evt);
            }
        });
        add(BrowseJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseJButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BrowseJButtonActionPerformed
        // TODO add your handling code here:
        BrowseItems browseItems = new BrowseItems(userProcessContainer, brandDirectory, store);
        userProcessContainer.add("browseItems", browseItems);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }// GEN-LAST:event_BrowseJButtonActionPerformed

    private void BrowseJButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BrowseJButton1ActionPerformed
        // TODO add your handling code here:
        BrowseStores browseStore = new BrowseStores(userProcessContainer, store);
        userProcessContainer.add("browseStore", browseStore);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }// GEN-LAST:event_BrowseJButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed

        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }// GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrowseJButton;
    private javax.swing.JButton BrowseJButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
