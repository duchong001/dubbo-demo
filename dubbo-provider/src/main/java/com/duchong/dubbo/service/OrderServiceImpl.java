package com.duchong.dubbo.service;

import com.duchong.dubbo.model.Order;

import java.util.Arrays;
import java.util.List;

/**
 * @author DUCHONG
 * @since 2019-05-26 21:38
 **/
public class OrderServiceImpl implements OrderService {

    public List<Order> getUserOrders() {

        Order order1=new Order().setOrderNumber("123456").setPrice(100).setSubject("order1");
        Order order2=new Order().setOrderNumber("1234567").setPrice(102).setSubject("order2");
        Order order3=new Order().setOrderNumber("12345678").setPrice(103).setSubject("order3");

        return Arrays.asList(order1,order2,order3);

    }
}
