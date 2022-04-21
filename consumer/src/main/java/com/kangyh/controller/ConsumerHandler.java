package com.kangyh.controller;

import com.kangyh.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @ClassName: ConsumerHandler
 * @Package: com.kangyh.controller
 * @Description:
 * @Datetime: 2022/4/20   23:27
 * @Author: YuHan.Kang@outlook.com
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://localhost:8080/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2() {
        return restTemplate.getForObject("http://localhost:8080/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findByID(@PathVariable Long id) {
        return restTemplate.getForEntity("http://localhost:8080/student/findById/{id}", Student.class, id).getBody();
    }
}
