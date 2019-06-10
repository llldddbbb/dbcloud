package cn.dblearn.dbcloud.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
