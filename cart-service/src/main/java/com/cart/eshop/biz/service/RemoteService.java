package com.cart.eshop.biz.service;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Administrator on 2018/9/16 0016.
 */
public interface RemoteService {

    @RequestLine("POST /order/addOrder")
    @Headers("Content-Type: application/json")
    String addOrder(@RequestBody String productListJSonStr);
}
