package com.cart.eshop.biz.service;

import com.cart.eshop.biz.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/9/14 0014.
 */

@Service
public class CartService {

    @Autowired
    ShoppingCartMapper shoppingCartMapper;
}
