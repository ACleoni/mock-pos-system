package com.alexandercleoni.system.pos.builder;

public class Account {
    private final int id;
    private final Name name;
    private String email;
    private Address address;


    private Account (Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.address = builder.address;
        this.name = builder.name;
    }

    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {
        private int id;
        private String email;
        private Address address;
        private Name name;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder Address(final Address address) {
            this.address = address;
            return this;
        }

        public Builder Name(final Name name) {
            this.name = name;
            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }
}
