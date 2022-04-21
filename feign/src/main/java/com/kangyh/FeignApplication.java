package com.kangyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: FeignApplication
 * @Package: com.kangyh
 * @Description:
 * @Datetime: 2022/4/21   10:46
 * @Author: YuHan.Kang@outlook.com
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
