package com.kangyh.repository.impl;

import com.kangyh.entity.Student;
import com.kangyh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: StudentRepository
 * @Package: com.kangyh.repository.impl
 * @Description:
 * @Datetime: 2022/4/20   17:42
 * @Author: YuHan.Kang@outlook.com
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long, Student> studentMap;



    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "zs", 22));
        studentMap.put(2L, new Student(2L, "ls", 23));
        studentMap.put(3L, new Student(3L, "ss", 32));

    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }


}
