package com.kangyh.feign.impl;

import com.kangyh.entity.Student;
import com.kangyh.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ClassName: FeignError
 * @Package: com.kangyh.feign
 * @Description:
 * @Datetime: 2022/4/21   14:25
 * @Author: YuHan.Kang@outlook.com
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "mmm";
    }
}
