package org.star4j.lywu.cloud.simpleconsumermovie.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: WuYL
 * @Description: 用户实体
 * @Date: Create in 2017/10/10 9:58
 * @Modified By:
 */
public class User implements Serializable{

    private Long id;

    private String username;

    private String name;

    private Short age;

    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
