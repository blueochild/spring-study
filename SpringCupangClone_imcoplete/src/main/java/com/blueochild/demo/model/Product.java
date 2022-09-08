package com.blueochild.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;

    @Column(length = 50, nullable = false)
    private String productName;

    @Column(length = 20, nullable = false)
    private int price;

    @Column(length = 50, nullable = false)
    private String sellerId;

    @Column(length = 12, nullable = false)
    private int sale;

    @Column(length = 2, nullable = false)
    private int salePrice;

    @Column(length = 50, nullable = false)
    private int stackPoint;

    @Column(length = 50, nullable = false)
    private int size;

    @Column(length = 50, nullable = false)
    private int amount;

    @Column(length = 50, nullable = false)
    private int shippingDate;

    @Column(length = 50, nullable = false)
    private int reviewId;

    @Builder
    public Product(String productId, String productName, int price, String sellerId, int sale, int salePrice, int stackPoint
                , int size, int amount, int shippingDate, int reviewId){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.sellerId = sellerId;
        this.sale = sale;
        this.salePrice = salePrice;
        this.stackPoint = stackPoint;
        this.size = size;
        this.amount = amount;
        this.shippingDate = shippingDate;
        this.reviewId = reviewId;
    }

    @Override
    public String toString(){
        return String.format(
                "User[product_Id='%s', productName='%s', price=%d, sellerId='%s', sale=%d, salePrice=%d, stackPoint=%d, size==%d, amount==%d, shippingDate==%d, reviewId=%d]",
                this.productId, this.productName, this.price, this.sellerId, this.sale , this.salePrice, this.stackPoint, this.size, this.amount , this.shippingDate , this.reviewId
        );
    }

}
