package com.example.demo.dao;

import com.example.demo.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: demo
 * @description:商品
 * @author: YJX
 * @create: 2020-09-19 07:24
 **/
@Repository
@Mapper
public interface ICommodityDao {
    int addCommodity(Commodity commodity);
    int updateCommodity(Commodity commodity);
    int delCommodity(Integer id);
}
