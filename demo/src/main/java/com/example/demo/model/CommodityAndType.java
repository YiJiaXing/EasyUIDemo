package com.example.demo.model;

import lombok.Data;

/**
 * @program: demo
 * @description:商品+类别
 * @author: YJX
 * @create: 2020-09-19 07:34
 **/
@Data
public class CommodityAndType {
    private Long id; //商品id
    private String commodityNo;    //商品编号
    private String commodityName;   //商品名称
    private Float price;    //商品的价格
    private Integer typeId;     //商品类别id
    private String typeName;    //商品类别名称
}
