package cn.kevin.shoppingmall.service.Impl;

import cn.kevin.shoppingmall.dao.UserMapper;
import cn.kevin.shoppingmall.entity.User;
import cn.kevin.shoppingmall.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Kevin on 2019/2/25.
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
