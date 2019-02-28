package cn.kevin.shoppingmall.web;

import cn.kevin.shoppingmall.entity.User;
import cn.kevin.shoppingmall.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kevin on 2019/2/26.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String saveUser(){

        User user = new User();
        user.setId(123L);
        user.setImage("112");
        user.setNickName("张三");
        userService.saveUser(user);
        return "save";
    }


}
