package cn.dblearn.dbcloud.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserApplication
 *
 * @author bobbi
 * @date 2019/06/02 14:08
 * @email 571002217@qq.com
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
