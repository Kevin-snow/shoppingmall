package cn.kevin.shoppingmall.dao;

import cn.kevin.shoppingmall.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 系统登录人Mapper
 * Created by Kevin on 2019/2/25.
 */
@Repository
public interface UserMapper {
    int insert(User user);


}
