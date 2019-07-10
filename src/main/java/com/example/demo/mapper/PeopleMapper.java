package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.User;

import java.util.List;

/**
 * @author fangrongxiao
 * Date: 2019/7/10 15:10
 * Description:
 */

public interface PeopleMapper  extends BaseMapper<User>{
    List<User> select();
    int getCount();
}
