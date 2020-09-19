package com.example.demo.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @program: demo
 * @description:商品
 * @author: YJX
 * @create: 2020-09-19 07:23
 **/
@Data
@Builder
public class Commodity {
    private Long id; //商品id
    private String commodityNo;    //商品编号
    private String commodityName;   //商品名称
    private Float price;    //商品的价格
    private Integer typeId;     //商品类别id
}
