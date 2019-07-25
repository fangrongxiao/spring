package com.example.demo.util;

/**
 * @author fangrongxiao
 * Date: 2019/7/10 17:45
 * Description:
 */
public class Meta {
    private Integer code;
    private String message;
    public Meta(){

    }

    public Meta(Integer code,String message){
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
