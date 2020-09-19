package com.example.demo.pojo;

import lombok.Data;

/**
 * @program: demo
 * @description:订单详情  订单-商品
 * @author: YJX
 * @create: 2020-09-19 07:44
 **/
@Data
public class OrderDetail {
    private Long id; //编号
    private Long orderId;   //订单id
    private Long commodityId;    //商品id
    private Integer amount;  //商品数量
}
