package com.kangyh.feign;

import com.kangyh.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @ClassName: FeignProviderClient
 * @Package: com.kangyh.feign
 * @Description:
 * @Datetime: 2022/4/21   14:16
 * @Author: YuHan.Kang@outlook.com
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
