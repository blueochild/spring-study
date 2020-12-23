package com.blueochild.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(length = 40, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String userName;

    @Column(length = 40, nullable = false)
    private String email;

    @Column(length = 12, nullable = false)
    private String phone;

    @Column(length = 2, nullable = false)
    private String gender;

    @Column(length = 40, nullable = false)
    private int point;

    @Builder
    public User(String userId, String password, String userName, String email, String phone, int gender, int point){
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        if(gender == 1){
            this.gender = "남";
        }else if( gender == 0){
            this.gender = "여";
        }
        this.point = point;
    }

    @Override
    public String toString(){
        return String.format(
                "User[user_id='%s', password='%s', userName='%s', email='%s', phone='%s', gender='%s', point=%d]",
                this.userId, this.password, this.userName, this.email, this.phone, this.gender, this.point
        );
    }

}
