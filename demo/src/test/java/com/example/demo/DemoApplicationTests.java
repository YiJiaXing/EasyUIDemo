package com.example.demo;

import com.example.demo.dao.IOrderDetailDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private IOrderDetailDao iOrderDetailDao;

    @Test
    void contextLoads() {
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
//        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
//        OrderForm orderForm = new OrderForm();
//        orderForm.setId(1l);
//        orderForm.setOrderNo(LocalDateTime.now().format(dateTimeFormatter));
//        orderForm.setStatusId(2);
//        orderForm.setCreateDate(new Date());
//        System.out.println(iOrderFromDao.updateOrderFrom(orderForm));
//        Date date =new Date();
//        String formatDate = null;
//        formatDate = DateFormat.getDateInstance().format(date);
//        System.out.println(formatDate);

    }

}
