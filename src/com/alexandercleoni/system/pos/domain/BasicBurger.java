package com.alexandercleoni.system.pos.domain;

import com.alexandercleoni.system.pos.domain.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alexandercleoni
 *
 */
public class BasicBurger implements Hamburger {
    private List<Item> itemList = new ArrayList<>();

    @Override
    public String name() {
        return "Basic Burger";
    }

    @Override
    public List<Item> showItems() {
        return this.itemList;
    }

    @Override
    public double showPrice() {
        double price = 5.99;
        for(Item item : itemList) {
            price += item.getPrice();
        }
        return price;
    }

    @Override
    public void addItem(Item item) {

    }
}
