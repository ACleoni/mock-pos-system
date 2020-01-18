package com.alexandercleoni.system.pos.builder;

import com.alexandercleoni.system.pos.domain.Hamburger;
import com.alexandercleoni.system.pos.domain.item.Item;

public class Burger {
    private final Hamburger hamburger;


    private Burger (Builder builder) {
        this.hamburger = builder.hamburger;
    }

    public Hamburger hamburger() {
        return this.hamburger;
    }

    public void addItem(Item item) {
        this.hamburger.addItem(item);
    }

    public static class Builder {
        private Hamburger hamburger;

        public Builder type(final Hamburger hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }

    }
}
