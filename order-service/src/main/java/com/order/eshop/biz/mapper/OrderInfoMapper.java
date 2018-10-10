package com.order.eshop.biz.mapper;

import com.order.eshop.biz.model.OrderInfo;

import java.util.Map;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    int insertByProductArrayList(Map<String,Object> param);
}