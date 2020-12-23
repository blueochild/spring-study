package com.blueochild.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String s_userId;

    @Column(length = 40, nullable = false)
    private String sellerId;

    @Column(length = 40, nullable = false)
    private String productId;

    @Column(length = 40, nullable = false)
    private String productRegistryDate;

    @Builder
    public Seller(String s_userId, String sellerId, String productId, String productRegistryDate){
        this.s_userId = s_userId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.productRegistryDate = productRegistryDate;
    }

    @Override
    public String toString(){
        return String.format("Seller[user_id='%s', seller_id='%s', product_id='%s', product_Registry_date='%s',]",
                this.s_userId, this.sellerId, this.productId, this.productRegistryDate);
    }

}
