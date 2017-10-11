package org.star4j.lywu.cloud.simpleconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.star4j.lywu.cloud.simpleconsumermovie.entity.User;

/**
 * @Author: WuYL
 * @Description: 服务调用者
 * @Date: Create in 2017/10/10 10:35
 * @Modified By:
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById (@PathVariable Long id){

        return restTemplate.getForObject("http://localhost:7900/simple/"+id, User.class);
    }
}
