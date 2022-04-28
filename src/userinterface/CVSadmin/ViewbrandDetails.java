package userinterface.CVSadmin;

import business.Item;
import business.ItemCatalog;
import business.brand;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ViewbrandDetails extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private brand brand;

    public ViewbrandDetails(JPanel userProcessConatiner, brand brand) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.brand = brand;

        populateTable();
        brandNameLabelName.setText(brand.getStoreName());
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) ItemsCatalogJTable.getModel();
        dtm.setRowCount(0);
        for (Item Items : brand.getItemCatalog().getItemList()) {
            if (Items != null) {
                Object[] row = new Object[3];
                row[0] = Items;
                row[1] = Items.getItemID();
                row[2] = Items.getItemAvailibility();

                dtm.addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        brandNameLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsCatalogJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        brandNameLabelName.setText("jLabel1");

        ItemsCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null }
                },
                new String[] {
                        "Item Name", "Item Id", "Item Availibility"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(ItemsCatalogJTable);

        btnBack.setText("<< Back");
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
                                .addGap(35, 35, 35)
                                .addComponent(brandNameLabelName)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBack))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(brandNameLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(btnBack)
                                .addContainerGap(48, Short.MAX_VALUE)));
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private javax.swing.JButton btnBack;
    private javax.swing.JTable ItemsCatalogJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel brandNameLabelName;
}
