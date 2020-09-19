package com.example.demo.dao;

import com.example.demo.pojo.OrderStatus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description:订单状态
 * @author: YJX
 * @create: 2020-09-19 07:39
 **/
@Repository
@Mapper
public interface IOrderStatusDao {
    int addOrderStatus (OrderStatus orderStatus);
    int updateOrderStatus (OrderStatus orderStatus);
    List<OrderStatus> findOrderStatuses (int num, int size);
}
