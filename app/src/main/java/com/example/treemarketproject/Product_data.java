package com.example.treemarketproject;

public class Product_data {
    private String productName;
    private String shopName;
    private String productNumber;
    private Integer productImage;
    private String shopAddress;

    public Product_data(String productName,String shopName,String productNumber,Integer productImage,String shopAddress){
        this.productName = productName;
        this.shopName = shopName;
        this.productNumber = productNumber;
        this.productImage = productImage;
        this.shopAddress = shopAddress;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getProductImage() {
        return productImage;
    }

    public void setProductImage(Integer productImage) {
        this.productImage = productImage;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
}

