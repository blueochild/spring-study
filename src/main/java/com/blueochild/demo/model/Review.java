package com.blueochild.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;

    @Column(length = 50, nullable = false)
    private String reviewId;

    @Column(length = 50, nullable = false)
    private String userId;

    @Column(length = 50, nullable = false)
    private String content;

    @Column(length = 12, nullable = false)
    private String date;

    @Column(length = 5, nullable = false)
    private int scope;

    @Builder
    public Review(String productId, String reviewId, String userId, String content, String date, int scope){
        this.productId = productId;
        this.reviewId = reviewId;
        this.userId = userId;
        this.content = content;
        this.date = date;
        this.scope = scope;
    }

    @Override
    public String toString(){
        return String.format(
                "User[productId='%s', reviewId='%s', userId='%s', content='%s', date='%s', scope=%d]",
                this.productId, this.reviewId, this.userId, this.content, this.date, this.scope
        );
    }

}
