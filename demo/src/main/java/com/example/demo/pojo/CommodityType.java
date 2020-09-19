package com.example.demo.pojo;

import lombok.Data;

/**
 * @program: demo
 * @description:商品类别
 * @author: YJX
 * @create: 2020-09-19 07:33
 **/
@Data
public class CommodityType {
    private Integer id; //商品类别id
    private String typeName;    //商品类别名称
}
