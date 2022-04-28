package userinterface.CVSadmin;

import business.brand;
import business.brandDirectory;
import java.awt.CardLayout;
import java.util.function.Supplier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Managebrand extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private brandDirectory brandDirectory;

    public Managebrand(JPanel userProcessConatiner, brandDirectory brandDirectory) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.brandDirectory = brandDirectory;
        populateTable();
    }

    void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) brandTable.getModel();
        dtm.setRowCount(0); // to make row count 0
        // int rowCount = accountJTable.getRowCount();
        for (brand brand : brandDirectory.getStoreList()) {
            Object[] row = new Object[1];
            row[0] = brand;
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        brandTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddbrand = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        brandTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null },
                        { null },
                        { null },
                        { null }
                },
                new String[] {
                        "Brand Name"
                }) {
            boolean[] canEdit = new boolean[] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(brandTable);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnView.setText("View Brand");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddbrand.setText("Add Brand");
        btnAddbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddbrandActionPerformed(evt);
            }
        });

        jLabel1.setText("Manage Brand");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(btnBack)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(btnRemove)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(btnView))
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 335,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAddbrand)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel1)))
                                .addContainerGap(42, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(btnRemove)
                                        .addComponent(btnView))
                                .addGap(18, 18, 18)
                                .addComponent(btnAddbrand)
                                .addContainerGap(128, Short.MAX_VALUE)));
    }

    private void btnAddbrandActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddbrandActionPerformed
        Addbrand aph = new Addbrand(userProcessContainer, brandDirectory);
        userProcessContainer.add("add brand", aph);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnViewActionPerformed

        int selectedRow = brandTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        brand brand = (brand) brandTable.getValueAt(selectedRow, 0);
        ViewbrandDetails viewbranddetailsPanel = new ViewbrandDetails(userProcessContainer, brand);
        userProcessContainer.add("viewbranddetailsPanel", viewbranddetailsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = brandTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Please confirm to delete", "Delete confirmation",
                JOptionPane.WARNING_MESSAGE);
        if (dialogResult == JOptionPane.YES_OPTION) {
            brand brand = (brand) brandTable.getValueAt(selectedRow, 0);
            brandDirectory.removeSupplier(brand);
            populateTable();
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private javax.swing.JButton btnAddbrand;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable brandTable;

}
