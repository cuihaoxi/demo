package com.example.demo.cn.cortroller;

import com.example.demo.dao.User1DaoImpl;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcConlroller {
    @Autowired
    private User1DaoImpl user;
    @GetMapping("jdbc")
    public  String ss(){
        User u =new User();
        u.setUserName("胡执行");
        u.setPassword("12334");
        int addone = user.addone(u);
        System.out.println(addone);
        return ""+addone;
    }
}
