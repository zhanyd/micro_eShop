package com.cart.eshop.biz.contorller;

import com.alibaba.fastjson.JSONObject;
import com.cart.eshop.biz.model.ShoppingCart;
import com.cart.eshop.biz.service.CartService;
import com.cart.eshop.biz.service.RemoteService;
import com.cart.eshop.common.ApiResult;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/9 0009.
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;


    /**
     *根据用户id获取产品列表
     * @param userId
     * @return
     */
    @RequestMapping("getCartProductList")
    public ApiResult< List<Map<String,Object>>> getCartProductList(Integer userId){
        ApiResult< List<Map<String,Object>>> result = new ApiResult< List<Map<String,Object>>>();
        List<Map<String,Object>> shoppingCartList = cartService.selectByUserId(userId);
        return result.success(shoppingCartList);
    }

    /**
     * 添加到购物车
     * @param userId
     * @param productId
     * @param num
     * @return
     */
    @RequestMapping("addOrder")
    public ApiResult<String> addProduct(String productListJSonStr){
        ApiResult<String> result = new ApiResult<String>();
        System.out.println("添加到订单");
        System.out.println(productListJSonStr);
        RemoteService service = Feign.builder()
                //.encoder(new JacksonEncoder())
                //.decoder(new JacksonDecoder())
                .target(RemoteService.class, "http://127.0.0.1:8081");
        String reuslt = service.addOrder(productListJSonStr);
        System.out.println(reuslt);
        JSONObject jsonObject = JSONObject.parseObject(reuslt);
        System.out.println(jsonObject.get("data"));
        return result.success("success");
    }
}
