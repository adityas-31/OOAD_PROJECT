
package business;

public class brand {

    private String brandName;
    private int brandID;
    private String brandLocation;
    private ItemCatalog ItemCatalog;

    @Override
    public String toString() {
        // return "brand{" + "brandName=" + brandName + '}';
        return brandName;
    }

    public brand() {
        ItemCatalog = new ItemCatalog();
    }

    public ItemCatalog getItemCatalog() {
        return ItemCatalog;
    }

    public void setItemCatalog(ItemCatalog ItemCatalog) {
        this.ItemCatalog = ItemCatalog;
    }

    public String getStoreName() {
        return brandName;
    }

    public void setStoreName(String storeName) {
        this.brandName = storeName;
    }

    public int getStoreID() {
        return brandID;
    }

    public void setStoreID(int storeID) {
        this.brandID = storeID;
    }

    public String getStoreLocation() {
        return brandLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.brandLocation = storeLocation;
    }

}
