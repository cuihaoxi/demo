package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("s")
public class User1DaoImpl implements User1Dao{
    @Autowired
    private JdbcTemplate j;
    @Override
    public int addone(User u) {
        int update = j.update("INSERT INTO user VALUES (0,?,?)", u.getPassword(), u.getUserName());
        return update;
    }
}
