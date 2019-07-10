package com.example.demo;


import com.example.demo.bean.User;
import com.example.demo.server.DealPeople;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @author fangrongxiao
 * Date: 2019/5/7 16:12
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskTest {
    @Autowired
    private DealPeople peopleServer;
    @Test
    public void tes() throws Exception{
        List<User> select = peopleServer.getPeople();
        System.out.println(select.size());
    }

}
