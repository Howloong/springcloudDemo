package com.kangyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: NativeConfigServer
 * @Package: com.kangyh
 * @Description:
 * @Datetime: 2022/4/21   17:02
 * @Author: YuHan.Kang@outlook.com
 */
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServer.class, args);

    }
}
