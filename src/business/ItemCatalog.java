/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

public class ItemCatalog {

    private ArrayList<Item> ItemList;

    public ItemCatalog() {
        this.ItemList = new ArrayList<Item>();
    }

    public ArrayList<Item> getItemList() {
        return ItemList;
    }

    public void setItemList(ArrayList<Item> ItemList) {
        this.ItemList = ItemList;
    }

    public Item addItems(Item d) {
        // Item d = new Item();
        ItemList.add(d);
        return d;

    }

    public void removeItem(Item d) {
        ItemList.remove(d);
    }

}
