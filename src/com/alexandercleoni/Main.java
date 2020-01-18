package com.alexandercleoni;

import com.alexandercleoni.system.pos.builder.Burger;
import com.alexandercleoni.system.pos.domain.BasicBurger;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger.Builder()
                                    .type(new BasicBurger())
                                    .build();
    }
}
