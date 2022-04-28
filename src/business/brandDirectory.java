
package business;

import java.util.ArrayList;

public class brandDirectory {

    ArrayList<brand> brandList;

    public brandDirectory() {
        this.brandList = new ArrayList<brand>();
    }

    public ArrayList<brand> getStoreList() {
        return brandList;
    }

    public void setStoreList(ArrayList<brand> storeList) {
        this.brandList = storeList;
    }

    public brand addbrand(brand brand) {

        // brand brand = new brand();
        brandList.add(brand);
        return brand;
    }

    public void removeSupplier(brand brand) {
        brandList.remove(brand);
    }

    public Item searchItem(int ItemID) {
        for (brand p : brandList) {
            for (Item Item : p.getItemCatalog().getItemList()) {
                if (ItemID == Item.getItemID())
                    return Item;
            }
        }
        return null;
    }
}
