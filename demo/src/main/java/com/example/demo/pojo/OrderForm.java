package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @program: demo
 * @description:订单表
 * @author: YJX
 * @create: 2020-09-19 07:36
 **/
@Data
public class OrderForm {
    private Long id;    //订单id
    private String orderNo;    //订单编号
    private Integer statusId;   //订单状态
    private Date createDate;    //下单日期
    private Date accomplishDate;    //交易完成日期
}
