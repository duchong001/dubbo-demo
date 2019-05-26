package com.duchong.dubbo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author DUCHONG
 * @since 2019-05-25 21:07
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    private int id;

    private String name;

    private int age;

    public static void main(String[] args) {
        User u=new User(1,"duchong",20);
        System.out.println(u);
    }
}
