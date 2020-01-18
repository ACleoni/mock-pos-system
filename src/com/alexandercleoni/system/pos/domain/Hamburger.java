package com.alexandercleoni.system.pos.domain;

import com.alexandercleoni.system.pos.domain.item.Item;

import java.util.List;

public interface Hamburger {
    String name();
    List<Item> showItems();
    double showPrice();
    void addItem(Item item);
}
