package com.example.demo.service.impl;

import com.example.demo.dao.ICommodityAndTypeDao;
import com.example.demo.dao.ICommodityDao;
import com.example.demo.dao.ICommodityTypeDao;
import com.example.demo.dao.IOrderDetailDao;
import com.example.demo.model.CommodityAndType;
import com.example.demo.model.Count;
import com.example.demo.pojo.Commodity;
import com.example.demo.pojo.CommodityType;
import com.example.demo.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: demo
 * @description:商品实现类
 * @author: YJX
 * @create: 2020-09-19 07:58
 **/
@Transactional
@Service
public class CommodityServiceImpl implements ICommodityService {

    @Autowired
    private ICommodityDao iCommodityDao;

    @Autowired
    private ICommodityAndTypeDao iCommodityAndTypeDao;

    @Autowired
    private ICommodityTypeDao iCommodityTypeDao;

    @Autowired
    private IOrderDetailDao iOrderDetailDao;

    @Override
    public int addCommodity(Commodity commodity) {
        return iCommodityDao.addCommodity(commodity);
    }

    @Override
    public int updateCommodity(Commodity commodity) {
        return iCommodityDao.updateCommodity(commodity);
    }

    @Override
    public int delCommodity(Integer id) {
        return iCommodityDao.delCommodity(id);
    }

    @Override
    public CommodityAndType findCommodityAndTypeById(Integer id) {
        return iCommodityAndTypeDao.findCommodityAndTypeById(id);
    }

    @Override
    public List<CommodityAndType> findCommodityAndTypeAll() {
        return iCommodityAndTypeDao.findCommodityAndTypeAll();
    }

    @Override
    public List<CommodityAndType> findCommodityAndTypeLikeByNo(String no) {
        return iCommodityAndTypeDao.findCommodityAndTypeLikeByNo(no);
    }

    @Override
    public int addCommodityType(CommodityType commodityType) {
        return iCommodityTypeDao.addCommodityType(commodityType);
    }

    @Override
    public int updateCommodityType(CommodityType commodityType) {
        return iCommodityTypeDao.updateCommodityType(commodityType);
    }

    @Override
    public List<CommodityType> findCommodityType(int num, int size) {
        return iCommodityTypeDao.findCommodityType(num,size);
    }

    @Override
    public List<Count> find(Integer id) {
        return iOrderDetailDao.find(id);
    }
}
