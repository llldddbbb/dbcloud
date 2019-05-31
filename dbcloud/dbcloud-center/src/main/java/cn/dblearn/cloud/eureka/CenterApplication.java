package cn.dblearn.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * CenterApplication
 *
 * @author bobbi
 * @date 2019/05/30 21:07
 * @email 571002217@qq.com
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class,args);
    }
}
