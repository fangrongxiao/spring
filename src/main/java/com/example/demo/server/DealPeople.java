package com.example.demo.server;

import com.example.demo.bean.User;

import java.util.List;

/**
 * @author fangrongxiao
 * Date: 2019/7/10 15:07
 * Description:
 */
public interface DealPeople {

    List<User> getPeople();
    int getCount();
}
