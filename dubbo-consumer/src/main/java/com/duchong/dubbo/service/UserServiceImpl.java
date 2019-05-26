package com.duchong.dubbo.service;

import com.duchong.dubbo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DUCHONG
 * @since 2019-05-25 22:31
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    OrderService orderService;

    public List<Order>getUserOrders(){

        List<Order> orderList= orderService.getUserOrders();
        for (Order order : orderList) {
            System.out.println(order);
        }
        return  orderList;
    }
}
