package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author fangrongxiao
 * Date: 2019/7/10 16:37
 * Description:
 */
@Data
@TableName(value = "user")
public class User {
    private String id;
    private String name;
    private String age;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
