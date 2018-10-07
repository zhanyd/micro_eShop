package com.cart.eshop.biz.service;

import com.cart.eshop.biz.mapper.ShoppingCartMapper;
import com.cart.eshop.biz.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/14 0014.
 */

@Service
public class CartService {

    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    public List<Map<String,Object>> selectByUserId(Integer userId){
        return shoppingCartMapper.selectByUserId(userId);
    }
}
