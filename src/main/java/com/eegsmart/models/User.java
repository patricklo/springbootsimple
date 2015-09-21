package com.eegsmart.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by patrick on 2015/9/21.
 */

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;

    @NotNull
    private String email;

    @NotNull
    private String name;

    public User(){}

    public User(long id){
        this.userId = id;
    }

    public User(String email,String name){
        this.email = email;
        this.name = name;
    }



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
