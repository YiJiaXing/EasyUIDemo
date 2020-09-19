package com.example.demo.service;

import com.example.demo.model.CommodityAndType;
import com.example.demo.model.Count;
import com.example.demo.pojo.Commodity;
import com.example.demo.pojo.CommodityType;

import java.util.List;

/**
 * @program: demo
 * @description:商品服务
 * @author: YJX
 * @create: 2020-09-19 07:55
 **/
public interface ICommodityService {
    int addCommodity(Commodity commodity);
    int updateCommodity(Commodity commodity);
    int delCommodity(Integer id);
    CommodityAndType findCommodityAndTypeById (Integer id);
    List<CommodityAndType> findCommodityAndTypeAll ();
    List<CommodityAndType> findCommodityAndTypeLikeByNo (String no);

    int addCommodityType(CommodityType commodityType);
    int updateCommodityType(CommodityType commodityType);
    List<CommodityType> findCommodityType(int num, int size);

    List<Count> find(Integer id);
}
