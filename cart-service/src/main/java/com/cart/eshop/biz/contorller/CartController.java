package com.cart.eshop.biz.contorller;

import com.alibaba.fastjson.JSONObject;
import com.cart.eshop.biz.service.RemoteService;
import com.cart.eshop.common.ApiResult;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/9 0009.
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/cart")
public class CartController {

    /**
     * 添加到购物车
     * @param userId
     * @param productId
     * @param num
     * @return
     */
    @RequestMapping("addProduct")
    public ApiResult<String> addProduct(Integer userId, Integer productId, Integer num){
        ApiResult<String> result = new ApiResult<String>();
        System.out.println("添加到购物车");

        RemoteService service = Feign.builder()
               // .encoder(new JacksonEncoder())
               // .decoder(new JacksonDecoder())
                .target(RemoteService.class, "http://127.0.0.1:8081");
        String reuslt = service.addOrder();
        System.out.println(reuslt);
        JSONObject jsonObject = JSONObject.parseObject(reuslt);
        System.out.println(jsonObject.get("data"));
        return result.success("success");
    }
}
