package com.example.demo.pojo;

import lombok.Data;

/**
 * @program: demo
 * @description:订单状态
 * @author: YJX
 * @create: 2020-09-19 07:39
 **/
@Data
public class OrderStatus {
    private Integer id;   //状态编号
    private String statusName;  //状态名称
}
