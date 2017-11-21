package com.jm.springboot.model;

import org.apache.solr.client.solrj.beans.Field;

/**
 * @author jm
 */
public class Product {

    @Field
    private String name;
    @Field
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return (name != null ? name.equals(product.name) : product.name == null) && (price != null ? price.equals(product.price) : product.price == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product() {
    }

}
