package com.bigsea.sns.model.User;

import javax.persistence.*;

public class User {
    /**
     * 用户ID,主键
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户名
     */
    @Column(name = "UserName")
    private String username;

    /**
     * 密码
     */
    @Column(name = "Password")
    private String password;

    /**
     * 获取用户ID,主键
     *
     * @return Id - 用户ID,主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置用户ID,主键
     *
     * @param id 用户ID,主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return UserName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return Password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}