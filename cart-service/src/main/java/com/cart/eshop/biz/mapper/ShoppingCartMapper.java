package com.cart.eshop.biz.mapper;

import com.cart.eshop.biz.model.ShoppingCart;

import java.util.List;
import java.util.Map;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    List<Map<String,Object>> selectByUserId(Integer userId);
}