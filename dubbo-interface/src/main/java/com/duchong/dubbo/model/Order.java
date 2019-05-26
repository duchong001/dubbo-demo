package com.duchong.dubbo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author DUCHONG
 * @since 2019-05-25 21:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Order implements Serializable{

    /** 订单号*/
    private String orderNumber;
    /** 价格*/
    private int price;
    /** 订单描述*/
    private String subject;
}
