package cn.kevin.shoppingmall.dao;

import cn.kevin.shoppingmall.entity.User;

/**
 * 订单mapper
 * Created by Kevin on 2019/2/26.
 */
public interface OrderMapper {

    /**
     * 添加订单
     * @param user
     */
    public void insertOrder(User user);

    public void selectOrder();
}
