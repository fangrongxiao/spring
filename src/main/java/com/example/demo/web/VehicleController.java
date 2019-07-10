package com.example.demo.web;

import com.example.demo.server.DealPeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangrongxiao
 * Date: 2019/7/10 14:59
 * Description:
 */
@RestController
public class VehicleController {

    @Autowired
    private DealPeople dealPeople;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/pe")
    public Integer getList(){
        return dealPeople.getCount();
    }
}
