package com.example.demo.dao;

import com.example.demo.pojo.OrderForm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: demo
 * @description:订单
 * @author: YJX
 * @create: 2020-09-19 07:37
 **/
@Repository
@Mapper
public interface IOrderFromDao {
    int addOrderFrom (OrderForm orderForm);
    int updateOrderFrom (OrderForm orderForm);
}
