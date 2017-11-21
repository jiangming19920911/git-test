package com.jm.springboot.model;

public class DO1 {

    private String name;

    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public String getName() {

        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DO1 do1 = (DO1) o;

        return (name != null ? name.equals(do1.name) : do1.name == null) && (price != null ? price.equals(do1.price) : do1.price == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
