package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.CommodityAndType;
import com.example.demo.model.Count;
import com.example.demo.pojo.Commodity;
import com.example.demo.pojo.CommodityType;
import com.example.demo.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.List;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: YJX
 * @create: 2020-09-19 07:05
 **/
@Controller
public class CommodityController {

    @Autowired
    private ICommodityService iCommodityService;


    /**
     * 主页面
     * @return
     */
    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

    /**
     * 获取商品信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getCommodity")
    public JSONObject getCommodity() {
        List<CommodityAndType>list = iCommodityService.findCommodityAndTypeAll();
        JSONObject jsonObject =new JSONObject(true);
        jsonObject.put("rows",list);
        jsonObject.put("total",list.size());
        return jsonObject;
    }

    /**
     * 模糊查询 商品信息
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getCommodityByNo")
    public JSONObject getCommodityByNo(@RequestParam Map<String,String> map) {
        List<CommodityAndType> list = iCommodityService.findCommodityAndTypeLikeByNo("%"+map.get("no")+"%");
        JSONObject jsonObject =new JSONObject(true);
        jsonObject.put("rows",list);
        jsonObject.put("total",list.size());
        return jsonObject;
    }

    /**
     * 获取商品的类别
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getType")
    public JSONObject getCommodityType() {
        JSONObject jsonObject =new JSONObject(true);
        List<CommodityType> list = iCommodityService.findCommodityType(0,20);
        jsonObject.put("data",list);
        return jsonObject;
    }

    /**
     * 增加商品信息
     * @param jsonData
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addCommodity")
    public JSONObject addCommodity(@RequestBody JSONObject jsonData) {
        System.out.println(jsonData);
        Commodity commodity = Commodity.builder()
                .commodityNo(jsonData.getString("commodityNo"))
                .commodityName(jsonData.getString("commodityName"))
                .price(jsonData.getFloat("price"))
                .typeId(jsonData.getInteger("typeId"))
                .build();
        int flag=iCommodityService.addCommodity(commodity);
        JSONObject jsonObject =new JSONObject(true);
        jsonObject.put("state",flag==1?true:false);
        return jsonObject;
    }

    /**
     * 更新商品信息
     * @param jsonData
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateCommodity")
    public JSONObject updateCommodity(@RequestBody JSONObject jsonData) {
        Commodity commodity = Commodity.builder()
                .id(jsonData.getLong("id"))
                .commodityNo(jsonData.getString("commodityNo"))
                .commodityName(jsonData.getString("commodityName"))
                .price(jsonData.getFloat("price"))
                .typeId(jsonData.getInteger("typeId"))
                .build();
        int flag=iCommodityService.updateCommodity(commodity);
        JSONObject jsonObject =new JSONObject(true);
        jsonObject.put("state",flag==1?true:false);
        return jsonObject;
    }

    /**
     * 获取某件商品的销售量
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getCommodityCount")
    public JSONObject getCommodityCount(@RequestParam Integer id) {
        List<Count> list = iCommodityService.find(id);
        JSONArray jsonArray =new JSONArray();
        for (Count count:list) {
            JSONObject temp = new JSONObject(true);
            temp.put("sumAmount",count.getSumAmount());
            temp.put("cdate", DateFormat.getDateInstance().format(count.getCdate()));
            jsonArray.add(temp);
        }
        JSONObject jsonObject =new JSONObject(true);
        jsonObject.put("data",jsonArray);
        return jsonObject;
    }

    /**
     * 删除信息
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete")
    public JSONObject delCommodity(@RequestParam Integer id) {
        int flag=iCommodityService.delCommodity(id);
        JSONObject jsonObject =new JSONObject(true);
        jsonObject.put("state",flag==1?true:false);
        return jsonObject;
    }




}
