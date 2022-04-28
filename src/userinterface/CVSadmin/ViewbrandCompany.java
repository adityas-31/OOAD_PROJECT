package userinterface.CVSadmin;

import business.Item;
import business.ItemCatalog;
import business.brand;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ViewbrandCompany extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private brand brand;

    public ViewbrandCompany(JPanel userProcessConatiner, brand brand) {
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
            Object[] row = new Object[3];
            row[0] = Items;
            row[1] = Items.getItemID();
            row[2] = Items.getItemAvailibility();

            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        brandNameLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsCatalogJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        addItemsJButton = new javax.swing.JButton();

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

        addItemsJButton.setText("Add Items");
        addItemsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 422,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnBack)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(brandNameLabelName))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(addItemsJButton)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(brandNameLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addItemsJButton)
                                .addGap(81, 81, 81)
                                .addComponent(btnBack)
                                .addContainerGap(48, Short.MAX_VALUE)));
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private void addItemsJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ItemCatalog ItemCatalog = brand.getItemCatalog();
        AddItemsJPanel addItemsJPanel = new AddItemsJPanel(userProcessContainer, ItemCatalog);
        userProcessContainer.add("addItemsJPanel", addItemsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private javax.swing.JButton addItemsJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable ItemsCatalogJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel brandNameLabelName;
}
