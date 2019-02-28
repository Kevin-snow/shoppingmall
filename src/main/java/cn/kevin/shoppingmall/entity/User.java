package cn.kevin.shoppingmall.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 系统登录人
 * Created by Kevin on 2019/2/25.
 */
public class User {


    private Long id;

    private String nickName;

    private String image;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
