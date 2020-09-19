package com.example.demo.dao;

import com.example.demo.model.CommodityAndType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @description:查询商品-类别
 * @author: YJX
 * @create: 2020-09-19 07:34
 **/
@Repository
@Mapper
public interface ICommodityAndTypeDao {
    CommodityAndType findCommodityAndTypeById (Integer id);
    List<CommodityAndType> findCommodityAndTypeAll ();
    List<CommodityAndType> findCommodityAndTypeLikeByNo (String no);
}
