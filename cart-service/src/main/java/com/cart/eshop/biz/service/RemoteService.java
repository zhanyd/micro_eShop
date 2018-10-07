package com.cart.eshop.biz.service;

import feign.Param;
import feign.RequestLine;

/**
 * Created by Administrator on 2018/9/16 0016.
 */
public interface RemoteService {

    @RequestLine("POST /order/addOrder")
    String addOrder(@Param("userId") Integer userId, @Param("productListJSonStr") String productListJSonStr);
}
