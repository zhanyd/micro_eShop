package com.order.eshop.biz.controller;

import com.order.eshop.common.ApiResult;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/14 0014.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/order")
public class OrderController {

    @PostMapping("addOrder")
    public ApiResult<String> addProduct(Integer userId, Integer productId, Integer num, Integer totalPice){
        ApiResult<String> result = new ApiResult<String>();
        System.out.println("添加到订单");
        return result.success("添加到订单");
    }
}
