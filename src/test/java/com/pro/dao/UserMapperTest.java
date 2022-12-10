package com.pro.dao;

import com.pro.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    public UserMapper userMapper;

    @Test
    public void selectUsers() {
    }

    @Test
    public void insert() {
        userMapper.insert(new User(1,"zsf","333"));
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void selectUser() {
    }
}