package com.example.demo.cn.cortroller;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FreMarkConller {
    @Autowired
    private UserDao us;
    @GetMapping("free")
    public ModelAndView say(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name","测试");
        mav.setViewName("User");
        return mav;
    }
    @GetMapping("getAll")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        List<User> all = us.findAll();
        mav.addObject("all",all);
        mav.setViewName("User");
        return mav;
    }
}
