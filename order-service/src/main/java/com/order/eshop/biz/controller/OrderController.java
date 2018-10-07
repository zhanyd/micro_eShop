package com.order.eshop.biz.controller;

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
    public ApiResult<String> addProduct(@RequestParam Integer userId, @RequestParam String productListJSonStr){
        ApiResult<String> result = new ApiResult<String>();
        System.out.println(productListJSonStr);
        return result.success("添加到订单");
    }
}
