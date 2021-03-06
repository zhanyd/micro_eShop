package com.order.eshop.biz.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.order.eshop.biz.service.OrderService;
import com.order.eshop.common.ApiResult;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2018/9/14 0014.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("addOrder")
    public ApiResult<String> addProduct(@RequestBody String productListJSonStr){
        ApiResult<String> result = new ApiResult<String>();
        System.out.println(productListJSonStr);
        JSONObject parseObject = JSONObject.parseObject(productListJSonStr);
        Integer userId = parseObject.getInteger("userId");
        JSONArray productList = parseObject.getJSONArray("productList");

        Random ran = new Random();
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("orderNum", userId + "" + ran.nextInt(1000));
        param.put("userId",userId);
        param.put("productArrayList",productList);
        orderService.insertByProductArrayList(param);
        return result.success("添加到订单");
    }
}
