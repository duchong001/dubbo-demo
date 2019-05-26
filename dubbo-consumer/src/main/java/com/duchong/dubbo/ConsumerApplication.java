package com.duchong.dubbo;

import com.duchong.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ConsumerApplication
{
    public static void main( String[] args ) throws Exception
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        applicationContext.start();
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.getUserOrders();
        System.in.read();
    }
}
