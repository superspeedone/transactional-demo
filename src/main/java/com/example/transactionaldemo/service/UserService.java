package com.example.transactionaldemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.transactionaldemo.entity.User;

import java.util.List;

/**
 * 用户接口
 */
public interface UserService {

    public IPage<User> selectUserPage(Page<User> page, Integer state);

    public List<User> selectUserList();

}
