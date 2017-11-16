package com.example.demo.cn.cortroller;


import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCortroller {

   /* @Value("${User}")
    private  String username;
    @Value("${pwd}")
    private  String pwd;

    @Autowired
    private User u;
    @RequestMapping(value = "t")
    public String show(){
        return u.toString();
    }*/
   /*@Autowired
    private User u;*/
   @RequestMapping("t")
    public String say(){
       int i = 1/0;
       return "Hellow word";
   }

}
