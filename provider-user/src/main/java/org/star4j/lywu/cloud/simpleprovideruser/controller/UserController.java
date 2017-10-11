package org.star4j.lywu.cloud.simpleprovideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.star4j.lywu.cloud.simpleprovideruser.entity.User;
import org.star4j.lywu.cloud.simpleprovideruser.repository.UserRepository;

/**
 * @Author: WuYL
 * @Description: 用户功能控制器
 * @Date: Create in 2017/10/10 10:04
 * @Modified By:
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
