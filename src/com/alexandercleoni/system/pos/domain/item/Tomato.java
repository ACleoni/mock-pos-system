package com.alexandercleoni.system.pos.domain.item;

public class Tomato implements Item {
    @Override
    public String getName() {
        return "Tomato";
    }

    @Override
    public double getPrice() {
        return 0.99;
    }
}
