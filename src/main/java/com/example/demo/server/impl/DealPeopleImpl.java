package com.example.demo.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.User;
import com.example.demo.mapper.PeopleMapper;
import com.example.demo.server.DealPeople;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fangrongxiao
 * Date: 2019/7/10 15:09
 * Description:
 */

@Service
public class DealPeopleImpl implements DealPeople {


    @Resource
    private PeopleMapper peopleMapper;
    @Override
    public List<User> getPeople() {

        return peopleMapper.select();
    }

    @Override
    public int getCount() {

        return peopleMapper.getCount();
    }
}
