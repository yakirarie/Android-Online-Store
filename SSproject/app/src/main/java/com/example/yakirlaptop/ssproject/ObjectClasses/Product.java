package com.example.yakirlaptop.ssproject.ObjectClasses;

public class Product {
    private int p_id;
    private int s_id;
    private String name;
    private int price;
    private int quantity;
    private String image;

    public Product(int p_id, int s_id, String name, int price, int quantity, String image) {
        this.p_id = p_id;
        this.s_id = s_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public Product(int s_id, String name, int price, int quantity, String image) {
        this.s_id = s_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
