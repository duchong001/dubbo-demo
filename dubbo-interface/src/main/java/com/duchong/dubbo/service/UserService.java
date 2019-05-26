package com.duchong.dubbo.service;

import com.duchong.dubbo.model.Order;

import java.util.List;

/**
 * @author DUCHONG
 * @since 2019-05-25 21:27
 **/
public interface UserService {

    public List<Order> getUserOrders();
}
