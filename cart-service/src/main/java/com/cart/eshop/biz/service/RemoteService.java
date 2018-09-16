package com.cart.eshop.biz.service;

import feign.RequestLine;

/**
 * Created by Administrator on 2018/9/16 0016.
 */
public interface RemoteService {

    @RequestLine("POST /order/addOrder")
    String addOrder();
}
