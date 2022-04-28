/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

public class AddData {

    public void setInitialValues(brandDirectory brandDirectory)

    {
        brandDirectory brand_Directory = brandDirectory;

        brand brand1 = new brand();

        brand brand2 = new brand();

        brand1.setStoreName("brand1");
        brand2.setStoreName("brand2");

        brand_Directory.addbrand(brand1);
        brand_Directory.addbrand(brand2);
        Item Item1 = new Item();

        // Item1.setItemID(1);
        Item1.setItemName("Crocin");
        Item1.setItemType("paracetemol");
        Item1.setComposition("paracetemol ");
        Item1.setItemAvailibility(40);
        Item1.setItemPrice(20);
        Item1.setItemDescription("used for fever");
        Item1.setExpirationDate("20-05-2018");
        Item1.setManufacturedDate("10-09-2015");
        brand1.getItemCatalog().addItems(Item1);

        Item Item2 = new Item();
        // Item2.setItemID(2);
        Item2.setItemName("Anacin");
        Item2.setItemType("antacid");
        Item2.setComposition("antacid ");
        Item2.setItemAvailibility(80);
        Item2.setItemPrice(30);
        Item2.setItemDescription("used for acidity");
        Item2.setExpirationDate("20-10-2018");
        Item2.setManufacturedDate("10-10-2015");
        brand1.getItemCatalog().addItems(Item2);

        Item Item12 = new Item();
        // Item12.setItemID(3);
        Item12.setItemName("Cetaphil");
        Item12.setItemType("cetaphil");
        Item12.setComposition("antacid ");
        Item12.setItemAvailibility(80);
        Item12.setItemPrice(30);
        Item12.setItemDescription("used for acne");
        Item12.setExpirationDate("20-10-2018");
        Item12.setManufacturedDate("10-10-2015");
        brand2.getItemCatalog().addItems(Item12);

    }

    public void setStoreInitialValues(StoreDirectory storeDirectory) {
        StoreDirectory sd = storeDirectory;

        Store store1 = new Store();

        Store store2 = new Store();

        store1.setStoreName("Store 1");
        store1.setStoreLocation("Boston");
        sd.addStore(store1);

        store2.setStoreName("Store 2");
        store2.setStoreLocation("New york");
        sd.addStore(store2);

    }

}
