package org.star4j.lywu.cloud.simpleprovideruser.controller;

import static org.mockito.Matchers.longThat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.star4j.lywu.cloud.simpleprovideruser.entity.User;
import org.star4j.lywu.cloud.simpleprovideruser.repository.UserRepository;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

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
    
    @Autowired
    private EurekaClient eurekaClient;
    
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
    
    @GetMapping("/service/url")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
        return instance.getHomePageUrl();
    }
    
    @GetMapping("/service/info")
    public String serviceInfo() {
    	List<String> localServiceInstance = discoveryClient.getServices();
    	System.out.println("------"+localServiceInstance.toString());
    	return localServiceInstance.get(0);
    }
}
