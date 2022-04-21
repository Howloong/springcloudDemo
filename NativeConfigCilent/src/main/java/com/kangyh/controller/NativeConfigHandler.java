package com.kangyh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: NativeConfigHandler
 * @Package: com.kangyh.controller
 * @Description:
 * @Datetime: 2022/4/21   17:10
 * @Author: YuHan.Kang@outlook.com
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String index() {
        return this.port + ":" + foo;
    }
}
