package com.example.demo.dao;

import com.example.demo.model.Count;
import com.example.demo.pojo.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description:订单详情
 * @author: YJX
 * @create: 2020-09-19 07:45
 **/
@Repository
@Mapper
public interface IOrderDetailDao {
    int addOrderDetail(OrderDetail orderDetail);
    int updateOrderDetail(OrderDetail orderDetail);
    List<Count> find(Integer id);
}
