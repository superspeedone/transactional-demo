package com.example.transactionaldemo;

import com.example.transactionaldemo.entity.User;
import com.example.transactionaldemo.mapper.UserMapper;
import com.example.transactionaldemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionalDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectUserList() {
        System.out.println(userService.selectUserList());
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setName("Wein");
        user.setAge(22);
        userMapper.insert(user);
        userMapper.selectList(null).forEach(System.out::println);
    }

}
