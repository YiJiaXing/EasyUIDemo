package com.example.demo.dao;

import com.example.demo.pojo.CommodityType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description:类别
 * @author: YJX
 * @create: 2020-09-19 07:33
 **/
@Repository
@Mapper
public interface ICommodityTypeDao {
    int addCommodityType(CommodityType commodityType);
    int updateCommodityType(CommodityType commodityType);
    List<CommodityType> findCommodityType(int num, int size);
}
