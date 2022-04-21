package com.kangyh.controller;

import com.kangyh.entity.Student;
import com.kangyh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @ClassName: StudentHandler
 * @Package: com.kangyh.controller
 * @Description:
 * @Datetime: 2022/4/20   22:31
 * @Author: YuHan.Kang@outlook.com
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student
    ) {
        studentRepository.saveOrUpdate(student);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }


    @GetMapping("/index")
    public String index() {
        return "port" + this.port;
    }
}
