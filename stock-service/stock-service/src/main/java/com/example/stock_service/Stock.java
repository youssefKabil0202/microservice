package com.example.stock_service;

public class Stock {
    private int productId;
    private int quantityAvailable;

    public Stock() {}

    public Stock(int productId, int quantityAvailable) {
        this.productId = productId;
        this.quantityAvailable = quantityAvailable;
    }

    public int getProductId()
    {
        return productId;
    }
    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public int getQuantityAvailable()
    {
        return quantityAvailable;
    }
    public void setQuantityAvailable(int quantityAvailable)
    {
        this.quantityAvailable = quantityAvailable;
    }

}
