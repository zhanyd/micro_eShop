package com.order.eshop.biz.service;

import com.order.eshop.biz.mapper.OrderInfoMapper;
import com.order.eshop.common.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2018/9/15 0015.
 */

@Service
public class OrderService {

    @Autowired
    OrderInfoMapper orderInfoMapper;
}
