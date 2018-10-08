package com.order.eshop.biz.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.order.eshop.common.ApiResult;
import feign.Param;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/9/14 0014.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/order")
public class OrderController {

    @PostMapping("addOrder")
    public ApiResult<String> addProduct(@RequestBody String productListJSonStr){
        ApiResult<String> result = new ApiResult<String>();
        System.out.println(productListJSonStr);
        JSONObject parseObject = JSONObject.parseObject(productListJSonStr);
        Integer userId = parseObject.getInteger("userId");
        JSONArray productList = parseObject.getJSONArray("productList");
        return result.success("添加到订单");
    }
}
